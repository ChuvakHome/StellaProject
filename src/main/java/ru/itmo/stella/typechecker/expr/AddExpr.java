package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public class AddExpr extends StellaExpression {
	private StellaExpression left, right;
	
	public AddExpr(StellaExpression left, StellaExpression right) {
		this.left = left;
		this.right = right;
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
		
		return StellaType.Primitives.NAT;
	}

	public String toString() {
		return String.format("%s + %s", left, right);
	}
}
