package ru.itmo.stella.typechecker.exception.variant;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaVariantType;

public class StellaUnexpectedVariantLabelException extends StellaException {
	public StellaUnexpectedVariantLabelException(
			String unexpectedLabel, 
			StellaVariantType variantType, 
			StellaExpression variantExpr) 
	{
		super(
			StellaTypeErrorCode.ERROR_UNEXPECTED_VARIANT_LABEL,
			"unexpected label\\S"
			+ "%s\\s"
			+ "for a variant type\\S"
			+ "%s\\s"
			+ "in variant expression\\S"
			+ "%s",
			unexpectedLabel,
			variantType,
			variantExpr
		);
	}
}
