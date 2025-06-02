package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public abstract class ComparisonExpr extends StellaExpression {
	protected StellaExpression left;
	protected StellaExpression right;
	
	public ComparisonExpr(StellaExpression leftExpression, StellaExpression rightExpression) {
		this.left = leftExpression;
		this.right = rightExpression;
	}
	
	public StellaExpression getLeftExpression() {
		return left;
	}
	
	public StellaExpression getRightExpression() {
		return right;
	}
	
	@Override
	protected void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		left.checkType(context, StellaType.Primitives.NAT);
		right.checkType(context, StellaType.Primitives.NAT);
	}
	
	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		left.checkType(context, StellaType.Primitives.NAT);
		right.checkType(context, StellaType.Primitives.NAT);
		
		return StellaType.Primitives.BOOL;
	}
}
