package ru.itmo.stella.typechecker.expr.pattern;

import java.util.Objects;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.type.StellaType;

public class PatternAscExpr extends PatternExpr {
	private PatternExpr ascPattern;
	private StellaType ascType;
	
	public PatternAscExpr(PatternExpr ascPattern, StellaType ascType) {
		super(Tag.ASC);
		
		this.ascPattern = ascPattern;
		this.ascType = ascType;
	}
	
	public PatternExpr getAscriptionPattern() {
		return ascPattern;
	}
	
	public StellaType getAscriptionType() {
		return ascType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ascPattern, ascType);
	}

	@Override
	public boolean equalsPattern(PatternExpr p) {
		PatternAscExpr ascPatternExpr = (PatternAscExpr) p; 
		
		return ascPatternExpr.ascPattern.equals(ascPattern) && ascPatternExpr.ascType.equals(ascType);
	}

	@Override
	public void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypesEqualityForPattern(ascPattern, expected, ascType);
		
		ascPattern.checkType(context, ascType);
	}
	
	@Override
	public StellaType doTypeInference(ExpressionContext context) throws StellaException {
		ascPattern.checkType(context, ascType);
		
		return ascType;
	}

	@Override
	public ExpressionContext extendContext(ExpressionContext ctx, StellaType expected) throws StellaException {
		checkTypesEquality(expected, ascType);
		
		return ascPattern.extendContext(ctx, ascType);
	}
	
	@Override
	public PatternAscExpr getStubPattern() {
		return new PatternAscExpr(ascPattern.getStubPattern(), ascType);
	}

	@Override
	public String toString() {
		return String.format("%s as %s", ascPattern, ascType);
	}
}
