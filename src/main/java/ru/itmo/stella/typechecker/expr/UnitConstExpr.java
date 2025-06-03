package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.type.StellaType;

public class UnitConstExpr extends StellaConstExpression {
	@Override
	public StellaType doTypeInference(ExpressionContext context) {
		return StellaType.Primitives.UNIT;
	}
	
	public String toString() {
		return "unit";
	}
}
