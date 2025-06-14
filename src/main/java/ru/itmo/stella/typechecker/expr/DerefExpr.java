package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.StellaLanguageExtension;
import ru.itmo.stella.typechecker.constraint.StellaConstraint;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.reference.StellaNotAReferenceException;
import ru.itmo.stella.typechecker.type.StellaRefType;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaType.Tag;

public class DerefExpr extends StellaExpression {
	private StellaExpression expr;
	
	public DerefExpr(StellaExpression expression) {
		this.expr = expression;
	}
	
	public StellaExpression getExpression() {
		return expr;
	}
	
	@Override
	protected void doTypeCheckConstrainted(ExpressionContext context, StellaType expected) throws StellaException {
		StellaType exprType = expr.inferType(context);
		
		StellaRefType expectedRefenceType = new StellaRefType(expected);
		
		context.addConstraint(
					new StellaConstraint(exprType, expectedRefenceType, expr)
				);
	}
	
	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		StellaType exprType = expr.inferType(context);
		
		if (exprType == StellaType.BOTTOM)
			checkTypeMatching(context, new StellaRefType(expected), exprType);
		else if (exprType.getTypeTag() != Tag.REF)
			throw new StellaNotAReferenceException(expr, exprType);
		else {
			StellaRefType refExprType = (StellaRefType) exprType;
			
			checkTypeMatching(context, expected, refExprType.getReferencedType());
		}
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		StellaType exprType = expr.inferType(context);
		
		if (exprType.getTypeTag() != Tag.REF) {
			if (exprType.getTypeTag() != Tag.TYPE_VAR || !context.isExtensionUsed(StellaLanguageExtension.TYPE_RECONSTRUCTION))
				throw new StellaNotAReferenceException(this, exprType);
			
			return doTypeInferenceConstrainted(context);
		}
		
		return doTypeInference(context);
	}
	
	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		StellaRefType refExprType = (StellaRefType) expr.inferType(context);
		
		return refExprType.getReferencedType();
	}
	
	@Override
	protected StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		StellaType exprType = expr.inferType(context);
		
		StellaType referencedType = getCachedType(context);
		
		context.addConstraint(
					new StellaConstraint(exprType, new StellaRefType(referencedType), expr)
				);
		
		return referencedType;
	}

	@Override
	public String toString() {
		return String.format("*%s", expr);
	}
}
