package ru.itmo.stella.typechecker.expr.pattern;

import ru.itmo.stella.typechecker.expr.StellaExpression;

public class PatternMatchCase {
	private final PatternExpr pattern;
	private final StellaExpression expr;
	
	public PatternMatchCase(PatternExpr pattern, StellaExpression expression) {
		this.pattern = pattern;
		this.expr = expression;
	}
	
	public PatternExpr getPattern() {
		return pattern;
	}
	
	public StellaExpression getExpression() {
		return expr;
	}
	
	@Override
	public String toString() {
		return String.format("%s => %s", pattern, expr);
	}
}
