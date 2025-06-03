package ru.itmo.stella.typechecker.expr;

public class GreaterThanExpr extends ComparisonExpr {
	public GreaterThanExpr(StellaExpression leftExpression, StellaExpression rightExpression) {
		super(leftExpression, rightExpression);
	}

	public String toString() {
		return String.format("%s > %s", left, right);
	}
}
