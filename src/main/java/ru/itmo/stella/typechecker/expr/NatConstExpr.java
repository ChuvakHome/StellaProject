package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public class NatConstExpr extends StellaConstExpression {
	private final long value;
	
	public NatConstExpr(long value) {
		this.value = value;
	}
	
	public NatConstExpr(String s) {
		this(Long.parseLong(s));
	}
	
	public long getValue() {
		return value;
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		return StellaType.Primitives.NAT;
	}
	
	public String toString() {
		return String.valueOf(value);
	}
}
