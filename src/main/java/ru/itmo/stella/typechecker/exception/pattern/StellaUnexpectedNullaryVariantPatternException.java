package ru.itmo.stella.typechecker.exception.pattern;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternVariantExpr;
import ru.itmo.stella.typechecker.type.StellaVariantType;

public class StellaUnexpectedNullaryVariantPatternException extends StellaException {
	private String label;
	private StellaVariantType variantType;
	private PatternVariantExpr pattern;
	
	public StellaUnexpectedNullaryVariantPatternException(String label, StellaVariantType variantType, PatternVariantExpr pattern) {
		super(
			StellaTypeErrorCode.ERROR_UNEXPECTED_NULLARY_VARIANT_PATTERN,
			"expected a pattern for non-nullary label %s\\s"
		  + "for a variant of type\\S"
		  + "%s\\s"
		  + "in pattern\\S"
		  + "%s",
			label, variantType, pattern
		);
		
		this.label = label;
		this.variantType = variantType;
		this.pattern = pattern;
	}

	public String getLabel() {
		return label;
	}
	
	public StellaVariantType getVariantType() {
		return variantType;
	}
	
	public PatternVariantExpr getPattern() {
		return pattern;
	}
}
