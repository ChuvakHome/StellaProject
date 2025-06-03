package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.type.StellaType;

public class TryCastAsExpr extends StellaExpression {
	private StellaExpression castExpr;
	private StellaType castType;
	
	private PatternExpr tryPattern;
	private StellaExpression patternExpr;
	
	private StellaExpression withExpr;
	
	public TryCastAsExpr(StellaExpression castExpr, StellaType castType, PatternExpr tryPattern, StellaExpression patternExpr, StellaExpression withExpr) {
		this.castExpr = castExpr;
		this.castType = castType;
		this.tryPattern = tryPattern;
		this.patternExpr = patternExpr;
		this.withExpr = withExpr;
	}
	
	public StellaExpression getCastExpression() {
		return castExpr;
	}
	
	public StellaType getCastType() {
		return castType;
	}
	
	public PatternExpr getTryPattern() {
		return tryPattern;
	}
	
	public StellaExpression getPatternExpression() {
		return patternExpr;
	}
	
	public StellaExpression getWithExpression() {
		return withExpr;
	}

	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		tryPattern.checkType(context, castType);
		
		patternExpr.checkType(context, expected);
		withExpr.checkType(context, expected);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		tryPattern.checkType(context, castType);
		
		StellaType patternExprType = patternExpr.inferType(context);
		withExpr.checkType(context, patternExprType);
		
		return patternExprType;
	}

	@Override
	public String toString() {
		return String.format(
			"try %s cast as %s { %s => %s } with { %s }",
			castExpr, castType,
			tryPattern, patternExpr,
			withExpr
		);
	}
}
