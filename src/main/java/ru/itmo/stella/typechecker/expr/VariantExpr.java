package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.variant.StellaAmbiguousVariantTypeException;
import ru.itmo.stella.typechecker.exception.variant.StellaUnexpectedVariantException;
import ru.itmo.stella.typechecker.exception.variant.StellaUnexpectedVariantLabelException;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaVariantType;

public class VariantExpr extends StellaExpression {
	private String labelName;
	private StellaExpression expr;
	
	public VariantExpr(String labelName, StellaExpression expression) {
		this.labelName = labelName;
		this.expr = expression;
	}

	public String getLabel() {
		return labelName;
	}
	
	public StellaExpression getExpression() {
		return expr;
	}
	
	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.VARIANT)
			throw new StellaUnexpectedVariantException(expected, this);
		
		StellaVariantType expectedVariantType = (StellaVariantType) expected;
		
		if (!expectedVariantType.hasLabel(labelName))
			throw new StellaUnexpectedVariantLabelException(labelName, expectedVariantType, this);
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		throw new StellaAmbiguousVariantTypeException();
	}

	@Override
	public String toString() {
		return String.format("<| %s = %s |>", labelName, expr);
	}
}
