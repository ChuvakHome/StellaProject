package ru.itmo.stella.typechecker.expr.pattern;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.pattern.StellaUnexpectedPatternForTypeException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public abstract class PatternExpr extends StellaExpression {
	private final Tag patternTag;
	
	public static enum Tag {
		EMPTY,
		
		ASC,
		
		UNIT,
		
		BOOL,
		
		INT,
		SUCC,
		
		VAR,
		
		TUPLE,
		
		RECORD,
		
		LIST,
		CONS,
		
		INL,
		INR,
		
		VARIANT,
	}
	
	public PatternExpr(Tag patternTag) {
		this.patternTag = patternTag;
	}
	
	public Tag getPatternTag() {
		return patternTag;
	}
	
	protected static boolean areTypesNotEqual(StellaType expected, StellaType actual) {
		return expected.getTypeTag() != actual.getTypeTag() || !expected.equals(actual);
	}
	
	protected static void checkTypesEqualityForPattern(PatternExpr p, StellaType expected, StellaType actual) throws StellaException {
		if (areTypesNotEqual(expected, actual))
			throw new StellaUnexpectedPatternForTypeException(expected, p, actual);
	}
	
	protected void checkTypesEquality(StellaType expected, StellaType actual) throws StellaException {
		if (areTypesNotEqual(expected, actual))
			throw new StellaUnexpectedPatternForTypeException(this, expected);
	}
	
	@Override
	public abstract int hashCode();
	
	public abstract boolean equalsPattern(PatternExpr p);
	
	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		else if (o instanceof PatternExpr p && patternTag == p.patternTag)
			return equalsPattern(p);
			
		return false;
	}
	
//	public abstract void doTypeCheckConstrainted(ExpressionContext ctx, StellaType expected) throws StellaException;
//	
//	public abstract void doTypeCheck(ExpressionContext ctx, StellaType expected) throws StellaException;
//	
//	public abstract void checkType(ExpressionContext ctx, StellaType expected) throws StellaException;
//	
//	public abstract StellaType inferType(ExpressionContext ctx) throws StellaException;
	
//	public abstract ExpressionContext doContextExtend(ExpressionContext ctx, StellaType expected) throws StellaException;
//	
//	public ExpressionContext doContextExtendConstrainted(ExpressionContext ctx, StellaType expected) throws StellaException {
//		return doContextExtend(ctx, expected);
//	}
	
	public abstract ExpressionContext extendContext(ExpressionContext ctx, StellaType expected) throws StellaException;
//		if (ctx.isExtensionUsed(StellaLanguageExtension.TYPE_RECONSTRUCTION))
//			return doContextExtendConstrainted(ctx, expected);
//		else
//			return doContextExtend(ctx, expected);
//	}
	
	public abstract PatternExpr getStubPattern();
	
	@Override
	public abstract String toString();
	
	public static final PatternVarExpr STUB_PATTERN = new PatternVarExpr("__something__");
}
