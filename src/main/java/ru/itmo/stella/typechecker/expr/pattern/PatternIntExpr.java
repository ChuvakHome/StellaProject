package ru.itmo.stella.typechecker.expr.pattern;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.type.StellaType;

public class PatternIntExpr extends PatternExpr {
	private int intPattern;
	
	public PatternIntExpr(int intPattern) {
		super(Tag.INT);
		
		this.intPattern = intPattern;
	}
	
	public int getIntPattern() {
		return intPattern;
	}

	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypesEquality(expected, StellaType.Primitives.NAT);
	}
	
	@Override
	public ExpressionContext extendContext(ExpressionContext context, StellaType expected) throws StellaException {
		return context;
	}

	@Override
	public String toString() {
		return String.valueOf(intPattern);
	}
}
