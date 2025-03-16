package ru.itmo.stella.typechecker.expr.pattern;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.pattern.StellaUnexpectedPatternForTypeException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.type.StellaType;

public abstract class PatternExpr {
	private final Tag patternTag;
	
	public static enum Tag {
		UNIT,
		BOOL,
		INT,
		TRUE,
		FALSE,
		VAR,
		INL,
		INR,
		LIST,
		CONS,
		VARIANT,
	}
	
	public PatternExpr(Tag patternTag) {
		this.patternTag = patternTag;
	}
	
	public Tag getPatternTag() {
		return patternTag;
	}
	
	protected void checkTypesEquality(StellaType expected, StellaType actual) throws StellaException {
		if (expected.getTypeTag() != actual.getTypeTag() || !expected.equals(actual))
			throw new StellaUnexpectedPatternForTypeException(this, expected);
	}
	
	public abstract void checkType(ExpressionContext ctx, StellaType expected) throws StellaException;
	
	public abstract ExpressionContext extendContext(ExpressionContext ctx, StellaType expected) throws StellaException;
	
	@Override
	public abstract String toString();
}
