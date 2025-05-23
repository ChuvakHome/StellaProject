package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public class LogicNotExpr extends StellaExpression {
	private StellaExpression argument;
	
	public LogicNotExpr(StellaExpression argument) {
		this.argument = argument;
	}
	
	public StellaExpression getArgument() {
		return argument;
	}

	@Override
	public void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		argument.checkType(context, StellaType.Primitives.BOOL);
	}

	@Override
	public StellaType inferType(ExpressionContext context) {
		return StellaType.Primitives.BOOL;
	}
	
	public String toString() {
		return String.format("not(%s)", argument);
	}
}
