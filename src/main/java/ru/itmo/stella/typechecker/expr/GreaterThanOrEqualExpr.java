package ru.itmo.stella.typechecker.expr;

public class GreaterThanOrEqualExpr extends ComparisonExpr {
	public GreaterThanOrEqualExpr(StellaExpression leftExpression, StellaExpression rightExpression) {
		super(leftExpression, rightExpression);
	}

	public String toString() {
		return String.format("%s >= %s", left, right);
	}
}
