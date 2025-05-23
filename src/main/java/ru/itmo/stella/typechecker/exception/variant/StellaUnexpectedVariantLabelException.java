package ru.itmo.stella.typechecker.exception.variant;

import java.util.Collection;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaVariantType;

public class StellaUnexpectedVariantLabelException extends StellaException {
	public StellaUnexpectedVariantLabelException(
			Collection<String> unexpectedLabels, 
			StellaVariantType expectedVariantType,
			StellaVariantType actualVariantType,
			StellaExpression expr) 
	{
		super(
			StellaTypeErrorCode.ERROR_UNEXPECTED_VARIANT_LABEL,
			"unexpected labels\\S"
			+ "%s\\s"
			+ "for an expected variant type\\S"
			+ "%s\\s"
			+ "in the variant type\\S"
			+ "%s\\s"
			+ "when typechecking expression\\S"
			+ "%s",
			String.join(", ", unexpectedLabels),
			expectedVariantType,
			actualVariantType,
			expr
		);
	}
	
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
