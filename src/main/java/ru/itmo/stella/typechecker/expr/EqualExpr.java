package ru.itmo.stella.typechecker.expr;

public class EqualExpr extends ComparisonExpr {
	public EqualExpr(StellaExpression leftExpression, StellaExpression rightExpression) {
		super(leftExpression, rightExpression);
	}

	public String toString() {
		return String.format("%s == %s", left, right);
	}
}
