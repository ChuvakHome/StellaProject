package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public class MultExpr extends StellaExpression {
	private StellaExpression left, right;
	
	public MultExpr(StellaExpression left, StellaExpression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		left.checkType(context, StellaType.Primitives.NAT);
		right.checkType(context, StellaType.Primitives.NAT);
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		StellaType leftExprType = left.inferType(context);
		right.checkType(context, leftExprType);
		
		return leftExprType;
	}

	public String toString() {
		return String.format("%s * %s", left, right);
	}
}
