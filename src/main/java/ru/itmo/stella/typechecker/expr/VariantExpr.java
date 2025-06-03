package ru.itmo.stella.typechecker.expr;

import java.util.Map;

import ru.itmo.stella.typechecker.StellaLanguageExtension;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.variant.StellaAmbiguousVariantTypeException;
import ru.itmo.stella.typechecker.exception.variant.StellaMissingDataForLabelException;
import ru.itmo.stella.typechecker.exception.variant.StellaUnexpectedDataForNullaryLabelException;
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
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.VARIANT)
			throw new StellaUnexpectedVariantException(expected, this);
		
		StellaVariantType expectedVariantType = (StellaVariantType) expected;
		
		if (!expectedVariantType.hasLabel(labelName))
			throw new StellaUnexpectedVariantLabelException(labelName, expectedVariantType, this);
		
		StellaType expectedLabelType = expectedVariantType.getLabelType(labelName);
		
		if (expectedLabelType == StellaType.NO_TYPE && expr != null)
			throw new StellaUnexpectedDataForNullaryLabelException(labelName);
		else if (expectedLabelType != StellaType.NO_TYPE && expr == null)
			throw new StellaMissingDataForLabelException(labelName, expectedLabelType);
		
		if (expr != null)
			expr.checkType(context, expectedLabelType);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		if (context.isExtensionUsed(StellaLanguageExtension.STRUCTUAL_SUBTYPING))
			return new StellaVariantType(Map.of(labelName, expr.inferType(context)));
		
		throw new StellaAmbiguousVariantTypeException();
	}

	@Override
	public String toString() {
		return String.format("<| %s = %s |>", labelName, expr);
	}
}
