package ru.itmo.stella.typechecker.expr;

public class SubtractExpr extends ArithmeticExpr {
	public SubtractExpr(StellaExpression left, StellaExpression right) {
		super(left, right);
	}

	public String toString() {
		return String.format("%s - %s", left, right);
	}
}
