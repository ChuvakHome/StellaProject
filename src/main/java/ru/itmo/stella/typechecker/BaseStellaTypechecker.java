package ru.itmo.stella.typechecker;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import ru.itmo.stella.lang.ComposVisitor;
import ru.itmo.stella.lang.StellaLexer;
import ru.itmo.stella.lang.StellaParser;
import ru.itmo.stella.lang.Absyn.AParamDecl;
import ru.itmo.stella.lang.Absyn.ARecordFieldType;
import ru.itmo.stella.lang.Absyn.AVariantFieldType;
import ru.itmo.stella.lang.Absyn.Decl;
import ru.itmo.stella.lang.Absyn.DeclFun;
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
import ru.itmo.stella.typechecker.constraint.StellaConstraint;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.StellaOccursCheckInfiniteTypeException;
import ru.itmo.stella.typechecker.exception.StellaUnexpectedTypeWhenUnifyingExpressionException;
import ru.itmo.stella.typechecker.exception.function.StellaIncorrectArityOfMainException;
import ru.itmo.stella.typechecker.exception.function.StellaIncorrectNumberOfArgumentsException;
import ru.itmo.stella.typechecker.exception.function.StellaMissingMainException;
import ru.itmo.stella.typechecker.exception.generic.StellaUndefinedTypeVariableException;
import ru.itmo.stella.typechecker.exception.record.StellaDuplicateRecordTypeFieldsException;
import ru.itmo.stella.typechecker.exception.record.StellaMissingRecordFieldsException;
import ru.itmo.stella.typechecker.exception.record.StellaUnexpectedRecordFieldsException;
import ru.itmo.stella.typechecker.exception.tuple.StellaUnexpectedTupleLengthException;
import ru.itmo.stella.typechecker.exception.variant.StellaDuplicateVariantTypeFieldsException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.expr.visitor.StellaCoreExprVisitor;
import ru.itmo.stella.typechecker.expr.visitor.StellaExprVisitor;
import ru.itmo.stella.typechecker.type.StellaForAllType;
import ru.itmo.stella.typechecker.type.StellaFunctionType;
import ru.itmo.stella.typechecker.type.StellaListType;
import ru.itmo.stella.typechecker.type.StellaRecordType;
import ru.itmo.stella.typechecker.type.StellaRefType;
import ru.itmo.stella.typechecker.type.StellaSumType;
import ru.itmo.stella.typechecker.type.StellaTupleType;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaType.Tag;
import ru.itmo.stella.typechecker.type.StellaTypeVar;
import ru.itmo.stella.typechecker.type.StellaVariantType;
import ru.itmo.stella.typechecker.util.IntCounter;
import ru.itmo.stella.typechecker.util.StellaOptional;

public class BaseStellaTypechecker implements StellaTypechecker {
	private ExpressionContext context;
	private StellaExprVisitor exprVisitor;
	
	public BaseStellaTypechecker(StellaExprVisitor exprVisitor) {
		this.context = new ExpressionContext(ExpressionContext.EMPTY_CONTEXT, new IntCounter(1));
		this.exprVisitor = exprVisitor;
	}
	
	public BaseStellaTypechecker() {
		this(new StellaCoreExprVisitor(new StellaTypeVisitor()));
	}
	
	@Override
	public List<StellaException> typecheckProgram(InputStream in) throws IOException {
		StellaParser parser = new StellaParser(
					new CommonTokenStream(
						new StellaLexer(CharStreams.fromStream(in))
					)
				);
		
		List<StellaException> errorRecords = new ArrayList<>();
		Visitor visitor = new Visitor();
		
		parser.program().result.accept(visitor, errorRecords);
		
		Set<StellaConstraint> constraints = visitor.getConstraints();
		constraints.forEach(System.out::println);
//		
		System.out.println("\n=== UNIFICATION ===\n");
		
		constraints.forEach(constraint -> {
			System.out.println(constraint + " :: " + constraint.getRelatedExpression());
			System.out.println("LEFT: " + constraint.getLeftTypeVariables());
			System.out.println("RIGHT: " + constraint.getRightTypeVariables());
			
			System.out.println();
		});
		
		try {
			Deque<StellaConstraint> sortedConstraints = new ArrayDeque<>();
			sortedConstraints.addAll(constraints);
			
			Set<StellaConstraint> unifiedConstraints = unify(sortedConstraints);
			
			unifiedConstraints.forEach(c -> {
				System.out.println("UNIFIED: " + c + " :: " + c.getRelatedExpression());
			});
			
			resolveUnifiedConstraints(unifiedConstraints);
		} catch (StellaException e) {
			errorRecords.add(e);
		}
		
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
	
	private void resolveUnifiedConstraints(Set<StellaConstraint> constraints) throws StellaException {
		for (StellaConstraint constraint: constraints) {
			StellaType leftType = constraint.getLeftType();
			StellaType rightType = constraint.getRightType();
			
			if (!leftType.equals(rightType)) {
				throw new StellaUnexpectedTypeWhenUnifyingExpressionException(
					constraint.getRelatedExpression(), 
					rightType,
					leftType
				);
			}
		}
	}
	
//	private Stack<StellaConstraint> toposortConstraints(Set<StellaConstraint> constraints) throws StellaException {
//		Map<StellaTypeVar, List<StellaConstraint>> dependentConstraints = new HashMap<>();
//		
//		Set<StellaConstraint> rootConstraints = new HashSet<>();
//		
//		constraints.forEach(constraint -> {
//			StellaType leftType = constraint.getLeftType();
//			StellaType rightType = constraint.getRightType();
//			
//			if (leftType instanceof StellaTypeVar) {
//				Set<StellaTypeVar> rightTypeVars = constraint.getRightTypeVariables();
//				
////				if (rightTypeVars.isEmpty())
////					rootConstraints.add(constraint);
////				else {
////					rightTypeVars.forEach(rightTypeVar -> {
////						if (!dependentConstraints.containsKey(rightTypeVar))
////							dependentConstraints.put(rightTypeVar, new ArrayList<>());
////						
////						dependentConstraints.get(rightTypeVar).add(constraint);
////					});
////				}
//				
//				rightTypeVars.forEach(rightTypeVar -> {
//					if (!dependentConstraints.containsKey(rightTypeVar))
//						dependentConstraints.put(rightTypeVar, new ArrayList<>());
//					
//					dependentConstraints.get(rightTypeVar).add(constraint);
//				});
//				
//				rootConstraints.add(constraint);
//			} else if (rightType instanceof StellaTypeVar) {
//				Set<StellaTypeVar> leftTypeVars = constraint.getLeftTypeVariables();
//				
////				if (leftTypeVars.isEmpty())
////					rootConstraints.add(constraint);
////				else {
////					leftTypeVars.forEach(leftTypeVar -> {
////						if (!dependentConstraints.containsKey(leftTypeVar))
////							dependentConstraints.put(leftTypeVar, new ArrayList<>());
////						
////						dependentConstraints.get(leftTypeVar).add(constraint);
////					});
////				}
//				
//				leftTypeVars.forEach(leftTypeVar -> {
//					if (!dependentConstraints.containsKey(leftTypeVar))
//						dependentConstraints.put(leftTypeVar, new ArrayList<>());
//					
//					dependentConstraints.get(leftTypeVar).add(constraint);
//				});
//				
//				rootConstraints.add(constraint);
//			} else {
//				constraint.getLeftTypeVariables().forEach(typeVar -> {
//					if (!dependentConstraints.containsKey(typeVar))
//						dependentConstraints.put(typeVar, new ArrayList<>());
//					
//					dependentConstraints.get(typeVar).add(constraint);
//				});
//				
//				constraint.getRightTypeVariables().forEach(typeVar -> {
//					if (!dependentConstraints.containsKey(typeVar))
//						dependentConstraints.put(typeVar, new ArrayList<>());
//					
//					dependentConstraints.get(typeVar).add(constraint);
//				});
//			}
//		});
//		
//		Stack<StellaConstraint> constraintStack = new Stack<>();
//		constraintStack.addAll(rootConstraints);
//		
//		Set<StellaConstraint> visited = new HashSet<>();
//		Stack<StellaConstraint> orderedConstraints = new Stack<>();
//		
//		while (!constraintStack.isEmpty()) {
//			StellaConstraint constraint = constraintStack.pop();
//			
//			if (visited.contains(constraint))
//				continue;
//			
//			StellaType leftType = constraint.getLeftType();
//			StellaType rightType = constraint.getRightType();
//			
//			if (leftType.getTypeTag() == Tag.TYPE_VAR || rightType.getTypeTag() == Tag.TYPE_VAR) {
//				Collection<StellaConstraint> dependencies;
//				
//				Collection<StellaTypeVar> typeVars;
//				
//				if (leftType instanceof StellaTypeVar typeVar) {
//					dependencies = dependentConstraints.getOrDefault(typeVar, new ArrayList<>());
//					dependentConstraints.remove(typeVar);
//					
//					typeVars = constraint.getRightTypeVariables();
//				} else /* if (rightType instanceof StellaTypeVar typeVar) */ {
//					StellaTypeVar typeVar = (StellaTypeVar) rightType;
//					
//					dependencies = dependentConstraints.getOrDefault(typeVar, new ArrayList<>());
//					dependentConstraints.remove(typeVar);
//					
//					typeVars = constraint.getLeftTypeVariables();
//				}
//				
//				typeVars.forEach(tv -> {
//					dependencies.addAll(
//						Optional.ofNullable(dependentConstraints.get(tv)).orElse(List.of())
//					);
//					dependentConstraints.remove(tv);
//				});
//				
//				if (dependencies.isEmpty()) {
//					orderedConstraints.push(constraint);
//
//					visited.add(constraint);
//				} else {
//					constraintStack.add(constraint);
//					constraintStack.addAll(dependencies);
//				}
//			} else {
//				constraintStack.addAll(
//					unifyConstraint(constraint)
//				);
//				
//				visited.add(constraint);
//			}
//		}
//		
//		return orderedConstraints;
//	}
	
	private Collection<StellaConstraint> unifyConstraint(StellaConstraint constraint) throws StellaException {
		Set<StellaConstraint> producedConstraints = new LinkedHashSet<>();
		
		StellaType leftType = constraint.getLeftType();
		StellaType rightType = constraint.getRightType();
		
		if (leftType.getTypeTag() != rightType.getTypeTag())
			throw new StellaUnexpectedTypeWhenUnifyingExpressionException(constraint.getRelatedExpression(), rightType, leftType);
		
		StellaExpression relatedExpr = constraint.getRelatedExpression();
		
		switch (leftType.getTypeTag()) {
			case FUNCTION: {
				StellaFunctionType leftFn = (StellaFunctionType) leftType;
				StellaFunctionType rightFn = (StellaFunctionType) rightType;
				
				if (leftFn.getArity() != rightFn.getArity()) {
					// TODO: Process unequal arity case
					throw new StellaIncorrectNumberOfArgumentsException(rightFn, leftFn, constraint.getRelatedExpression());
				}
				
				Iterator<StellaType> leftFnArgsIter = leftFn.getArgumensTypes().values().iterator();
				Iterator<StellaType> rightFnArgsIter = rightFn.getArgumensTypes().values().iterator();
				
				while (leftFnArgsIter.hasNext() && rightFnArgsIter.hasNext()) {
					StellaType leftArg = leftFnArgsIter.next();
					StellaType rightArg = rightFnArgsIter.next();
					
					producedConstraints.add(
						new StellaConstraint(
							leftArg, 
							rightArg, 
							relatedExpr
						)
					);
				}
				
				producedConstraints.add(
					new StellaConstraint(
						leftFn.getReturnType(), 
						rightFn.getReturnType(),
						relatedExpr
					)
				);
				
				break;
			} case REF: {
				producedConstraints.add(
					new StellaConstraint(
						((StellaRefType) leftType).getReferencedType(),
						((StellaRefType) rightType).getReferencedType(),
						relatedExpr
					)
				);
				
				break;
			} case LIST: {
				producedConstraints.add(
					new StellaConstraint(
						((StellaListType) leftType).getElementType(),
						((StellaListType) rightType).getElementType(),
						relatedExpr
					)
				);
				
				break;
			} case SUM: {
				StellaSumType leftSum = (StellaSumType) leftType;
				StellaSumType rightSum = (StellaSumType) rightType;
				
				producedConstraints.addAll(
					List.of(
						new StellaConstraint(
							leftSum.getLeftType(), 
							rightSum.getLeftType(),
							relatedExpr
						),
						new StellaConstraint(
							leftSum.getRightType(), 
							rightSum.getRightType(),
							relatedExpr
						)
					)
				);
				
				break;
			} case TUPLE: {
				StellaTupleType leftTuple = (StellaTupleType) leftType;
				StellaTupleType rightTuple = (StellaTupleType) rightType;
				
				if (leftTuple.getFieldsCount() != rightTuple.getFieldsCount())
					throw new StellaUnexpectedTupleLengthException(rightTuple, leftTuple, constraint.getRelatedExpression());
				
				for (int i = 0; i < leftTuple.getFieldsCount(); ++i) {
					producedConstraints.add(
						new StellaConstraint(
							leftTuple.getFieldType(i),
							rightTuple.getFieldType(i),
							relatedExpr
						)
					);
				}
				
				break;
			} case RECORD: {
				StellaRecordType leftRecord = (StellaRecordType) leftType;
				StellaRecordType rightRecord = (StellaRecordType) rightType;
				
				List<String> unexpectedFields = new ArrayList<>();
				
				for (Map.Entry<String, StellaType> recordEntry: leftRecord.getFieldTypes().entrySet()) {
					String fieldName = recordEntry.getKey();
					StellaType fieldLeftType = recordEntry.getValue();
					
					StellaType fieldRightType = rightRecord.getFieldType(fieldName);
					
					if (fieldRightType == null)
						unexpectedFields.add(fieldName);
					else {
						producedConstraints.add(
							new StellaConstraint(
								fieldLeftType,
								fieldRightType,
								relatedExpr
							)
						);
					}
				}
				
				if (unexpectedFields.isEmpty()) {
					List<String> missingFields = rightRecord.getFieldTypes().keySet().stream().filter(Predicate.not(leftRecord::hasField)).toList();
					
					if (!missingFields.isEmpty())
						throw new StellaMissingRecordFieldsException(missingFields, rightRecord, leftRecord, relatedExpr);
				} else
					throw new StellaUnexpectedRecordFieldsException(unexpectedFields, rightRecord, leftRecord, relatedExpr);
				
				break;
			} default: {
				producedConstraints.add(constraint);
				
				break;
			}
		}
		
		return producedConstraints;
	}
	
	private Set<StellaConstraint> unify(Deque<StellaConstraint> constraints) throws StellaException {
		if (constraints.isEmpty())
			return Set.of();
		
		Set<StellaConstraint> unfiedConstraints = new LinkedHashSet<>(); 
		StellaConstraint constraint = constraints.poll();
		
		System.out.println("DEBUG UNIFY: " + constraint);
		
		StellaType leftType = constraint.getLeftType();
		StellaType rightType = constraint.getRightType();
		
		if (leftType.getTypeTag() == Tag.TYPE_VAR || rightType.getTypeTag() == Tag.TYPE_VAR) {
			Deque<StellaConstraint> subconstraints = new ArrayDeque<>();
			
			StellaType replaceType, replacementType;
			Set<StellaTypeVar> typeVariables;
			
			if (leftType.getTypeTag() == Tag.TYPE_VAR) {
				replaceType = leftType;
				replacementType = rightType;
				
				typeVariables = constraint.getRightTypeVariables();
			} else /* if (rightType.getTypeTag() == Tag.TYPE_VAR) */ {
				replaceType = rightType;
				replacementType = leftType;
				
				typeVariables = constraint.getLeftTypeVariables();
			}
			
			if (typeVariables.contains(replaceType))
				throw new StellaOccursCheckInfiniteTypeException(replaceType, replacementType, constraint.getRelatedExpression());
			
			for (StellaConstraint c: constraints) {
				StellaConstraint subconstraint = new StellaConstraint(
						c.getLeftType().replaceType(replaceType, replacementType),
						c.getRightType().replaceType(replaceType, replacementType),
						c.getRelatedExpression()
					);
				
				subconstraints.add(subconstraint);
			}
			
			constraints = subconstraints;
		} else if (leftType.getTypeTag() == Tag.PRIMITIVE && rightType.getTypeTag() == Tag.PRIMITIVE)
			unfiedConstraints.add(constraint);
		else
			unifyConstraint(constraint).forEach(constraints::addFirst);
		
		unfiedConstraints.addAll(unify(constraints));
		
		return unfiedConstraints;
	}
	
	public class Visitor extends ComposVisitor<List<StellaException>> {
		private Set<StellaConstraint> constraints; 
		
		private StellaTypeVisitor typeVisitor = new StellaTypeVisitor();
		
		public Set<StellaConstraint> getConstraints() {
			return constraints;
		}
		
		@Override
		public ru.itmo.stella.lang.Absyn.Extension visit(ru.itmo.stella.lang.Absyn.AnExtension p, List<StellaException> errorsList) {			
			for (String extensionName: p.listextensionname_)
				context.addExtension(StellaLanguageExtension.getExtensionByName(extensionName));
			
			return super.visit(p, errorsList);
		}
		
		@Override
		public ru.itmo.stella.lang.Absyn.Decl visit(ru.itmo.stella.lang.Absyn.DeclExceptionType p, List<StellaException> errorsList) {
			try {
				StellaType exceptionType = p.type_.accept(typeVisitor, context).get();
				context.setExceptionType(exceptionType);
			} catch (StellaException e) {
				errorsList.add(e);
			}
			
			return super.visit(p, errorsList);
		}
		
		@Override
		public ru.itmo.stella.lang.Absyn.Decl visit(ru.itmo.stella.lang.Absyn.DeclFunGeneric p, List<StellaException> errorsList) {
			String fnName = p.stellaident_;
			
			List<StellaTypeVar> typeVars = p.liststellaident_.stream().map(StellaTypeVar::new).toList();
			
			try {
				ExpressionContext subctx = new ExpressionContext(context);
				typeVars.forEach(subctx::addTypeVariable);
				
				StellaFunctionType fnType = parseGenericFuncDecl(p, subctx).get();
				
				StellaType genericFnType = new StellaForAllType(typeVars, fnType);
				
				fnType.getArgumensTypes().forEach((argName, argType) -> subctx.add(argName, argType));
				subctx.add(fnName, genericFnType);
				
				StellaExpression fnBody = p.expr_.accept(
						exprVisitor,
						new TypecheckContext(errorsList, subctx)
					).get();
			
				fnBody.checkType(subctx, fnType.getReturnType());
				
				context.add(fnName, genericFnType);
			} catch (StellaException e) {
				errorsList.add(e);
			}
			
			return super.visit(p, errorsList);
		}
		
		@Override
		public ru.itmo.stella.lang.Absyn.Decl visit(ru.itmo.stella.lang.Absyn.DeclFun p, List<StellaException> errorsList) {
			String fnName = p.stellaident_;
			
			try {
				StellaFunctionType fnStellaType = parseFuncDecl(p).get();
				
				ExpressionContext subctx = new ExpressionContext(context, fnStellaType.getArgumensTypes(), context.getTypeVarCounter());
				
				ExpressionContext oldContext = context;
				context = subctx;
				
				try {
					for (Decl decl: p.listdecl_) {
						if (decl instanceof DeclFun nestedDeclFun) {
							String nestedFnName = nestedDeclFun.stellaident_;
							
							nestedDeclFun.accept(this, errorsList);
							
							StellaFunctionType nestedFnStellaType = parseFuncDecl(nestedDeclFun).get();
							subctx.add(nestedFnName, nestedFnStellaType);
						}
					}
					
					StellaExpression fnBody = p.expr_.accept(
								exprVisitor,
								new TypecheckContext(errorsList, subctx)
							).get();
					
					fnBody.checkType(subctx, fnStellaType.getReturnType());
				} catch (StellaException e) {
					errorsList.add(e);
				}
				
				oldContext.addConstraints(context.getConstraints());
				context = oldContext;
				context.add(fnName, fnStellaType);
			} catch (StellaException e) {
				errorsList.add(e);
			}

			constraints = context.getConstraints();
			
			return null;
			
//			return super.visit(p, errorsList);
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
		
		protected StellaOptional<StellaFunctionType> parseGenericFuncDecl(ru.itmo.stella.lang.Absyn.DeclFunGeneric p, ExpressionContext ctx) {
			Map<String, StellaType> funArgs = new LinkedHashMap<>();
			
			try {
				for (ParamDecl paramDecl: p.listparamdecl_) {
					AParamDecl param = (AParamDecl) paramDecl;
					
					funArgs.put(
							param.stellaident_,
							param.type_.accept(typeVisitor, ctx).get()
						);
				}
				
				StellaType retType = p.returntype_.accept(typeVisitor, ctx).get();
				
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
			return StellaOptional.of(ctx.newAutoTypeVar());
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
			try {
				List<StellaTypeVar> typeVars = p.liststellaident_.stream().map(StellaTypeVar::new).toList();
				
				ExpressionContext subctx = new ExpressionContext(ctx);
				typeVars.forEach(subctx::addTypeVariable);
				
				StellaType innerType = p.type_.accept(this, subctx).get();
				
				return StellaOptional.of(new StellaForAllType(typeVars, innerType));
			} catch (StellaException e) {
				return StellaOptional.of(StellaForAllType.class, e);
			}
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
			return StellaOptional.of(StellaType.TOP);
		}

		@Override
		public StellaOptional<StellaType> visit(TypeBottom p, ExpressionContext ctx) {
			return StellaOptional.of(StellaType.BOTTOM);
		}

		@Override
		public StellaOptional<StellaType> visit(TypeRef p, ExpressionContext ctx) {
			try {
				StellaType referencedType = p.type_.accept(this, ctx).get();
				
				return StellaOptional.of(new StellaRefType(referencedType));
			} catch (StellaException e) {
				return StellaOptional.of(StellaRefType.class, e);
			}
		}

		@Override
		public StellaOptional<StellaType> visit(TypeVar p, ExpressionContext ctx) {
			String typeVarName = p.stellaident_;
			
			if (ctx.hasTypeVariable(typeVarName))
				return StellaOptional.of(new StellaTypeVar(p.stellaident_));
			else
				return StellaOptional.of(
							StellaTypeVar.class, 
							new StellaUndefinedTypeVariableException(typeVarName)
						);
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
			return StellaOptional.of(StellaType.NO_TYPE);
		}

		@Override
		public StellaOptional<StellaType> visit(SomeTyping p, ExpressionContext ctx) {
			return p.type_.accept(this, ctx);
		}
	}
}
