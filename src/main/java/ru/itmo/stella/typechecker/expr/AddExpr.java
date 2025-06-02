package ru.itmo.stella.typechecker.expr;

public class AddExpr extends ArithmeticExpr {
	public AddExpr(StellaExpression left, StellaExpression right) {
		super(left, right);
	}
	
	public String toString() {
		return String.format("%s + %s", left, right);
	}
}
