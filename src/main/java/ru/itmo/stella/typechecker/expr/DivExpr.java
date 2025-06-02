package ru.itmo.stella.typechecker.expr;

public class DivExpr extends ArithmeticExpr {
	public DivExpr(StellaExpression left, StellaExpression right) {
		super(left, right);
	}

	public String toString() {
		return String.format("%s / %s", left, right);
	}
}
