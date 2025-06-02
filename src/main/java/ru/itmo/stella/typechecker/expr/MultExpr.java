package ru.itmo.stella.typechecker.expr;

public class MultExpr extends ArithmeticExpr {
	public MultExpr(StellaExpression left, StellaExpression right) {
		super(left, right);
	}

	public String toString() {
		return String.format("%s * %s", left, right);
	}
}
