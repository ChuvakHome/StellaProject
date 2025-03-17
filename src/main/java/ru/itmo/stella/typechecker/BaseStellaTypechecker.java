package ru.itmo.stella.typechecker;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
import ru.itmo.stella.typechecker.exception.record.StellaDuplicateRecordTypeFieldsException;
import ru.itmo.stella.typechecker.exception.variant.StellaDuplicateVariantTypeFieldsException;
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
import ru.itmo.stella.typechecker.util.StellaOptional;

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
			
			try {
				StellaFunctionType fnStellaType = parseFuncDecl(p).get();
				
				ExpressionContext subctx = new ExpressionContext(context, fnStellaType.getArgumensTypes());
				
				try {
					StellaExpression fnBody = p.expr_.accept(
								exprVisitor,
								new TypecheckContext(errorsList, subctx)
							).get();
					
					fnBody.checkType(subctx, fnStellaType.getReturnType());
				} catch (StellaException e) {
					errorsList.add(e);
				}
					
				context.add(fnName, fnStellaType);
			} catch (StellaException e) {
				errorsList.add(e);
			}
			
			return super.visit(p, errorsList);
		}
		
		protected StellaOptional<StellaFunctionType> parseFuncDecl(ru.itmo.stella.lang.Absyn.DeclFun p) {
			Map<String, StellaType> funArgs = new LinkedHashMap<>();
			
			try {
				for (ParamDecl paramDecl: p.listparamdecl_) {
					AParamDecl param = (AParamDecl) paramDecl;
					
					funArgs.put(
								param.stellaident_,
								param.type_.accept(typeVisitor, context).get()
							);
				}
				
				StellaType retType = p.returntype_.accept(typeVisitor, context).get();
				
				return StellaOptional.of(new StellaFunctionType(funArgs, retType));
			} catch (StellaException e) {
				return StellaOptional.of(StellaFunctionType.class, e);
			}
		}
	}
	
	public static class StellaTypeVisitor implements 
		Type.Visitor<StellaOptional<StellaType>, ExpressionContext>,
		ReturnType.Visitor<StellaOptional<StellaType>, ExpressionContext>,
		OptionalTyping.Visitor<StellaOptional<StellaType>, ExpressionContext> {
		
		@Override
		public StellaOptional<StellaType> visit(TypeAuto p, ExpressionContext ctx) {
			return null;
		}

		@Override
		public StellaOptional<StellaType> visit(TypeFun p, ExpressionContext ctx) {
			List<StellaType> argsList = new ArrayList<>();
			
			try {
				for (Type t: p.listtype_)
					argsList.add(t.accept(this, ctx).get());
				
				StellaType retType = p.type_.accept(this, ctx).get();
				
				return StellaOptional.of(new StellaFunctionType(argsList, retType));
			} catch (StellaException e) {
				return StellaOptional.of(StellaFunctionType.class, e);
			}
		}

		@Override
		public StellaOptional<StellaType> visit(TypeForAll p, ExpressionContext ctx) {
			return null;
		}

		@Override
		public StellaOptional<StellaType> visit(TypeRec p, ExpressionContext ctx) {
			return null;
		}

		@Override
		public StellaOptional<StellaType> visit(TypeSum p, ExpressionContext ctx) {
			try {
				StellaType left = p.type_1.accept(this, ctx).get();
				StellaType right = p.type_2.accept(this, ctx).get();
				
				return StellaOptional.of(new StellaSumType(left, right));
			} catch (StellaException e) {
				return StellaOptional.of(StellaSumType.class, e);
			}
		}

		@Override
		public StellaOptional<StellaType> visit(TypeTuple p, ExpressionContext ctx) {
			List<StellaType> tupleComponentsTypes = new ArrayList<>(); 
			
			for (Type type: p.listtype_) {
				try {
					tupleComponentsTypes.add(type.accept(this, ctx).get());
				} catch (StellaException e) {
					return StellaOptional.of(StellaTupleType.class, e);
				}
			}
			
			return StellaOptional.of(new StellaTupleType(tupleComponentsTypes));
		}

		@Override
		public StellaOptional<StellaType> visit(TypeRecord p, ExpressionContext ctx) {
			Map<String, StellaType> recordFieldsTypes = new LinkedHashMap<>(p.listrecordfieldtype_.size());
			List<Map.Entry<String, StellaType>> fieldsTypesList = new ArrayList<>(p.listrecordfieldtype_.size());
			
			Set<String> duplicateRecordFields = new LinkedHashSet<>();
			
			for (RecordFieldType recordFieldType: p.listrecordfieldtype_) {
				ARecordFieldType aRecordFieldType = (ARecordFieldType) recordFieldType;
				
				try {
					String fieldName = aRecordFieldType.stellaident_;
					StellaType fieldType = aRecordFieldType.type_.accept(this, ctx).get();
					
					if (recordFieldsTypes.containsKey(fieldName))
						duplicateRecordFields.add(fieldName);
					
					recordFieldsTypes.put(fieldName, fieldType);
					fieldsTypesList.add(Map.entry(fieldName, fieldType));
				} catch (StellaException ex) {
					return StellaOptional.of(StellaRecordType.class, ex);
				}
			}
			
			if (duplicateRecordFields.isEmpty())
				return StellaOptional.of(new StellaRecordType(recordFieldsTypes));
			else {
				String recordStr = String.format(
						"{ %s }",
						String.join(
								", ",
								fieldsTypesList.stream().map(entry -> entry.getKey() + " : " + entry.getValue() ).toList()
							)
					);
				
				return StellaOptional.of(StellaRecordType.class, new StellaDuplicateRecordTypeFieldsException(duplicateRecordFields, recordStr));
			}
		}

		@Override
		public StellaOptional<StellaType> visit(TypeVariant p, ExpressionContext ctx) {
			Map<String, StellaType> variantFieldsTypes = new LinkedHashMap<>();
			List<Map.Entry<String, StellaType>> fieldsTypesList = new ArrayList<>(p.listvariantfieldtype_.size());
			
			Set<String> duplicateRecordFields = new LinkedHashSet<>();
			
			try {
				for (VariantFieldType f: p.listvariantfieldtype_) {
					AVariantFieldType varField = (AVariantFieldType) f;
					
					String fieldName = varField.stellaident_;
					StellaType fieldType = varField.optionaltyping_.accept(this, ctx).get();
					
					if (variantFieldsTypes.containsKey(fieldName))
						duplicateRecordFields.add(fieldName);
					
					variantFieldsTypes.put(fieldName, varField.optionaltyping_.accept(this, ctx).get());
					fieldsTypesList.add(Map.entry(fieldName, fieldType));
				}
			} catch (StellaException e) {
				return StellaOptional.of(StellaVariantType.class, e);
			}
			
			if (duplicateRecordFields.isEmpty())
				return StellaOptional.of(new StellaVariantType(variantFieldsTypes));
			else {
				String variantStr = String.format(
						"<| %s |>",
						String.join(
								", ",
								fieldsTypesList.stream().map(entry -> entry.getKey() + " : " + entry.getValue() ).toList()
							)
					);
				
				return StellaOptional.of(StellaVariantType.class, new StellaDuplicateVariantTypeFieldsException(duplicateRecordFields, variantStr));
			}
		}

		@Override
		public StellaOptional<StellaType> visit(TypeList p, ExpressionContext ctx) {
			try {
				StellaType elemType = p.type_.accept(this, ctx).get();
				
				return StellaOptional.of(new StellaListType(elemType));
			} catch (StellaException e) {
				return StellaOptional.of(StellaListType.class, e);
			}
		}

		@Override
		public StellaOptional<StellaType> visit(TypeBool p, ExpressionContext ctx) {
			return StellaOptional.of(StellaType.Primitives.BOOL);
		}

		@Override
		public StellaOptional<StellaType> visit(TypeNat p, ExpressionContext ctx) {
			return StellaOptional.of(StellaType.Primitives.NAT);
		}

		@Override
		public StellaOptional<StellaType> visit(TypeUnit p, ExpressionContext ctx) {
			return StellaOptional.of(StellaType.Primitives.UNIT);
		}

		@Override
		public StellaOptional<StellaType> visit(TypeTop p, ExpressionContext ctx) {
			return null;
		}

		@Override
		public StellaOptional<StellaType> visit(TypeBottom p, ExpressionContext ctx) {
			return null;
		}

		@Override
		public StellaOptional<StellaType> visit(TypeRef p, ExpressionContext ctx) {
			return null;
		}

		@Override
		public StellaOptional<StellaType> visit(TypeVar p, ExpressionContext ctx) {
			return null;
		}

		@Override
		public StellaOptional<StellaType> visit(NoReturnType p, ExpressionContext ctx) {
//			return ThrowingOptional.of(StellaType.Primitives.UNIT);
			return null;
		}

		@Override
		public StellaOptional<StellaType> visit(SomeReturnType p, ExpressionContext ctx) {			
			return p.type_.accept(this, ctx);
		}

		@Override
		public StellaOptional<StellaType> visit(NoTyping p, ExpressionContext ctx) {
			return null;
		}

		@Override
		public StellaOptional<StellaType> visit(SomeTyping p, ExpressionContext ctx) {
			return p.type_.accept(this, ctx);
		}
	}
}
