package ru.itmo.stella.typechecker;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import ru.itmo.stella.lang.ComposVisitor;
import ru.itmo.stella.lang.StellaLexer;
import ru.itmo.stella.lang.StellaParser;
import ru.itmo.stella.lang.Absyn.AParamDecl;
import ru.itmo.stella.lang.Absyn.ARecordFieldType;
import ru.itmo.stella.lang.Absyn.AVariantFieldType;
import ru.itmo.stella.lang.Absyn.NoReturnType;
import ru.itmo.stella.lang.Absyn.NoTyping;
import ru.itmo.stella.lang.Absyn.OptionalTyping;
import ru.itmo.stella.lang.Absyn.ParamDecl;
import ru.itmo.stella.lang.Absyn.RecordFieldType;
import ru.itmo.stella.lang.Absyn.ReturnType;
import ru.itmo.stella.lang.Absyn.SomeReturnType;
import ru.itmo.stella.lang.Absyn.SomeTyping;
import ru.itmo.stella.lang.Absyn.Type;
import ru.itmo.stella.lang.Absyn.TypeAuto;
import ru.itmo.stella.lang.Absyn.TypeBool;
import ru.itmo.stella.lang.Absyn.TypeBottom;
import ru.itmo.stella.lang.Absyn.TypeForAll;
import ru.itmo.stella.lang.Absyn.TypeFun;
import ru.itmo.stella.lang.Absyn.TypeList;
import ru.itmo.stella.lang.Absyn.TypeNat;
import ru.itmo.stella.lang.Absyn.TypeRec;
import ru.itmo.stella.lang.Absyn.TypeRecord;
import ru.itmo.stella.lang.Absyn.TypeRef;
import ru.itmo.stella.lang.Absyn.TypeSum;
import ru.itmo.stella.lang.Absyn.TypeTop;
import ru.itmo.stella.lang.Absyn.TypeTuple;
import ru.itmo.stella.lang.Absyn.TypeUnit;
import ru.itmo.stella.lang.Absyn.TypeVar;
import ru.itmo.stella.lang.Absyn.TypeVariant;
import ru.itmo.stella.lang.Absyn.VariantFieldType;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.function.StellaIncorrectArityOfMainException;
import ru.itmo.stella.typechecker.exception.function.StellaMissingMainException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.expr.visitor.StellaCoreExprVisitor;
import ru.itmo.stella.typechecker.expr.visitor.StellaExprVisitor;
import ru.itmo.stella.typechecker.type.StellaFunctionType;
import ru.itmo.stella.typechecker.type.StellaListType;
import ru.itmo.stella.typechecker.type.StellaRecordType;
import ru.itmo.stella.typechecker.type.StellaSumType;
import ru.itmo.stella.typechecker.type.StellaTupleType;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaVariantType;

public class BaseStellaTypechecker implements StellaTypechecker {
	private ExpressionContext context = ExpressionContext.EMPTY_CONTEXT;
	private StellaExprVisitor exprVisitor;
	private StellaParser parser;
	
	public BaseStellaTypechecker(StellaExprVisitor exprVisitor) {
		this.context = ExpressionContext.EMPTY_CONTEXT;
		this.exprVisitor = exprVisitor;
	}
	
	public BaseStellaTypechecker() {
		this(new StellaCoreExprVisitor(new StellaTypeVisitor()));
	}
	
	@Override
	public List<StellaException> typecheckProgram(InputStream in) throws IOException {
		parser = new StellaParser(
					new CommonTokenStream(
						new StellaLexer(CharStreams.fromStream(in))
					)
				);
		
		List<StellaException> errorRecords = new ArrayList<>();
		Visitor visitor = new Visitor();
		parser.program().result.accept(visitor, errorRecords);
		
		postTypecheck(errorRecords);
		
		return errorRecords;
	}
	
	private void postTypecheck(List<StellaException> errorRecords) {
		StellaFunctionType mainFunctionType = (StellaFunctionType) context.getVarType("main");
		
		if (mainFunctionType == null) {
			errorRecords.add(
					new StellaMissingMainException()
				);
			
			return;
		}
		
		if (mainFunctionType.getArity() != 1) {
			errorRecords.add(
					new StellaIncorrectArityOfMainException()
				);
		}
	}
	
	public class Visitor extends ComposVisitor<List<StellaException>> {
		private StellaTypeVisitor typeVisitor = new StellaTypeVisitor();
		
		@Override
		public ru.itmo.stella.lang.Absyn.Decl visit(ru.itmo.stella.lang.Absyn.DeclFun p, List<StellaException> errorsList) {
			String fnName = p.stellaident_;
			StellaFunctionType fnStellaType = parseFuncDecl(p, errorsList);
			
			ExpressionContext subctx = new ExpressionContext(context, fnStellaType.getArgumensTypes());
			
			try {
				StellaExpression fnBody = p.expr_.accept(
							exprVisitor,
							new TypecheckContext(errorsList, subctx)
						);
				
				fnBody.checkType(subctx, fnStellaType.getReturnType());
			} catch (StellaException e) {
				errorsList.add(e);
			}
			
			context.add(fnName, fnStellaType);
			
			return super.visit(p, errorsList);
		}
		
		protected StellaFunctionType parseFuncDecl(ru.itmo.stella.lang.Absyn.DeclFun p, List<StellaException> errorsList) {
			Map<String, StellaType> funArgs = new LinkedHashMap<>();
			
			for (ParamDecl paramDecl: p.listparamdecl_) {
				AParamDecl param = (AParamDecl) paramDecl;
				
				funArgs.put(
							param.stellaident_,
							param.type_.accept(typeVisitor, context)
						);
			}
			
			StellaType retType = p.returntype_.accept(typeVisitor, context);
			
			return new StellaFunctionType(funArgs, retType);
		}
	}
	
	public static class StellaTypeVisitor implements 
		Type.Visitor<StellaType, ExpressionContext>,
		ReturnType.Visitor<StellaType, ExpressionContext>,
		OptionalTyping.Visitor<StellaType, ExpressionContext> {
		
		@Override
		public StellaType visit(TypeAuto p, ExpressionContext ctx) {
			return null;
		}

		@Override
		public StellaType visit(TypeFun p, ExpressionContext ctx) {
			List<StellaType> argsList = p.listtype_.stream()
											.map(t -> t.accept(this, ctx))
											.toList();
			StellaType retType = p.type_.accept(this, ctx);
			
			return new StellaFunctionType(argsList, retType);
		}

		@Override
		public StellaType visit(TypeForAll p, ExpressionContext ctx) {
			return null;
		}

		@Override
		public StellaType visit(TypeRec p, ExpressionContext ctx) {
			return null;
		}

		@Override
		public StellaType visit(TypeSum p, ExpressionContext ctx) {
			StellaType left = p.type_1.accept(this, ctx);
			StellaType right = p.type_2.accept(this, ctx);
			
			return new StellaSumType(left, right);
		}

		@Override
		public StellaType visit(TypeTuple p, ExpressionContext ctx) {
			return new StellaTupleType(
						p.listtype_.stream().map(type -> type.accept(this, ctx)).toList()
					);
		}

		@Override
		public StellaType visit(TypeRecord p, ExpressionContext ctx) {
			Map<String, StellaType> recordFieldsTypes = new LinkedHashMap<>(p.listrecordfieldtype_.size());
			
			for (RecordFieldType recordFieldType: p.listrecordfieldtype_) {
				ARecordFieldType fieldType = (ARecordFieldType) recordFieldType;
				
				recordFieldsTypes.put(fieldType.stellaident_, fieldType.type_.accept(this, ctx));
			}
			
			return new StellaRecordType(recordFieldsTypes);
		}

		@Override
		public StellaType visit(TypeVariant p, ExpressionContext ctx) {
			Map<String, StellaType> labelsTypes = new LinkedHashMap<>();
			
			for (VariantFieldType f: p.listvariantfieldtype_) {
				AVariantFieldType varField = (AVariantFieldType) f;
				
				labelsTypes.put(varField.stellaident_, varField.optionaltyping_.accept(this, ctx));
			}
			
			return new StellaVariantType(labelsTypes);
		}

		@Override
		public StellaType visit(TypeList p, ExpressionContext ctx) {
			StellaType elemType = p.type_.accept(this, ctx);
			
			return new StellaListType(elemType);
		}

		@Override
		public StellaType visit(TypeBool p, ExpressionContext ctx) {
			return StellaType.Primitives.BOOL;
		}

		@Override
		public StellaType visit(TypeNat p, ExpressionContext ctx) {
			return StellaType.Primitives.NAT;
		}

		@Override
		public StellaType visit(TypeUnit p, ExpressionContext ctx) {
			return StellaType.Primitives.UNIT;
		}

		@Override
		public StellaType visit(TypeTop p, ExpressionContext ctx) {
			return null;
		}

		@Override
		public StellaType visit(TypeBottom p, ExpressionContext ctx) {
			return null;
		}

		@Override
		public StellaType visit(TypeRef p, ExpressionContext ctx) {
			return null;
		}

		@Override
		public StellaType visit(TypeVar p, ExpressionContext ctx) {
			return null;
		}

		@Override
		public StellaType visit(NoReturnType p, ExpressionContext ctx) {
			return StellaType.Primitives.UNIT;
		}

		@Override
		public StellaType visit(SomeReturnType p, ExpressionContext ctx) {			
			return p.type_.accept(this, ctx);
		}

		@Override
		public StellaType visit(NoTyping p, ExpressionContext ctx) {
			return null;
		}

		@Override
		public StellaType visit(SomeTyping p, ExpressionContext ctx) {
			return p.type_.accept(this, ctx);
		}
	}
}
