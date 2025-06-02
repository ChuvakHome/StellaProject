package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public class LogicAndExpr extends StellaExpression {
	private StellaExpression left, right;
	
	public LogicAndExpr(StellaExpression left, StellaExpression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	protected void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		left.checkType(context, StellaType.Primitives.BOOL);
		right.checkType(context, StellaType.Primitives.BOOL);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		left.checkType(context, StellaType.Primitives.BOOL);
		right.checkType(context, StellaType.Primitives.BOOL);
		
		return StellaType.Primitives.BOOL;
	}

	public String toString() {
		return String.format("%s and %s", left, right);
	}
}
