package ru.itmo.stella.typechecker.expr;

public class NotEqualExpr extends ComparisonExpr {
	public NotEqualExpr(StellaExpression leftExpression, StellaExpression rightExpression) {
		super(leftExpression, rightExpression);
	}

	public String toString() {
		return String.format("%s != %s", left, right);
	}
}
