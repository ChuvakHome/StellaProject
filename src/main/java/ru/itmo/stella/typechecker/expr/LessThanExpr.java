package ru.itmo.stella.typechecker.expr;

public class LessThanExpr extends ComparisonExpr {
	public LessThanExpr(StellaExpression leftExpression, StellaExpression rightExpression) {
		super(leftExpression, rightExpression);
	}

	public String toString() {
		return String.format("%s < %s", left, right);
	}
}
