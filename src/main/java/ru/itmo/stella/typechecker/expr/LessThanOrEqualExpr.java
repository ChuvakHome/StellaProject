package ru.itmo.stella.typechecker.expr;

public class LessThanOrEqualExpr extends ComparisonExpr {
	public LessThanOrEqualExpr(StellaExpression leftExpression, StellaExpression rightExpression) {
		super(leftExpression, rightExpression);
	}

	public String toString() {
		return String.format("%s <= %s", left, right);
	}
}
