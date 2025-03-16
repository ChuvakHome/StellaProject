package ru.itmo.stella.typechecker.expr.pattern;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.type.StellaType;

public class PatternBoolExpr extends PatternExpr {
	private boolean boolPattern;
	
	public PatternBoolExpr(boolean boolPattern) {
		super(Tag.BOOL);
		
		this.boolPattern = boolPattern;
	}
	
	public boolean getBoolPattern() {
		return boolPattern;
	}

	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypesEquality(expected, StellaType.Primitives.BOOL);
	}

	@Override
	public ExpressionContext extendContext(ExpressionContext context, StellaType expected) throws StellaException {
		return context;
	}

	@Override
	public String toString() {
		return boolPattern ? "true" : "false";
	}
}
