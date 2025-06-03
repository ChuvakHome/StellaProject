package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public abstract class ArithmeticExpr extends StellaExpression {
	protected StellaExpression left;
	protected StellaExpression right;
	
	public ArithmeticExpr(StellaExpression left, StellaExpression right) {
		this.left = left;
		this.right = right;
	}
	
	public StellaExpression getLeftExpression() {
		return left;
	}
	
	public StellaExpression getRightExpression() {
		return right;
	}
	
	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		left.checkType(context, StellaType.Primitives.NAT);
		right.checkType(context, StellaType.Primitives.NAT);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		left.checkType(context, StellaType.Primitives.NAT);
		right.checkType(context, StellaType.Primitives.NAT);
		
		return StellaType.Primitives.NAT;
	}
}
