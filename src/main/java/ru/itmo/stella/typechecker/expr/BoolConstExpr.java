package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public class BoolConstExpr extends StellaConstExpression {
	private boolean value;
	
	public BoolConstExpr(boolean value) {
		this.value = value;
	}
	
	public BoolConstExpr(String s) {
		this("true".equals(s));
	}
	
	public boolean getValue() {
		return value;
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		return StellaType.Primitives.BOOL;
	}
	
	public String toString() {
		return Boolean.toString(value);
	}
}
