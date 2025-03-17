package ru.itmo.stella.typechecker.expr.pattern;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.pattern.StellaUnexpectedPatternForTypeException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaVariantType;

public class PatternVariantExpr extends PatternExpr {
	private String labelName;
	private PatternExpr labelPattern;
	
	public PatternVariantExpr(String labelName, PatternExpr labelPattern) {
		super(Tag.VARIANT);
		
		this.labelName = labelName;
		this.labelPattern = labelPattern;
	}
	
	public String getLabelName() {
		return labelName;
	}
	
	public PatternExpr getLabelPattern() {
		return labelPattern;
	}

	@Override
	public void checkType(ExpressionContext ctx, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.VARIANT)
			throw new StellaUnexpectedPatternForTypeException(this, expected);
		
		StellaVariantType expectedVariantType = (StellaVariantType) expected;
		
		if (!expectedVariantType.hasLabel(labelName))
			throw new StellaUnexpectedPatternForTypeException(this, expected);
		
		labelPattern.checkType(extendContext(ctx, expectedVariantType), expectedVariantType.getLabelType(labelName));
	}

	@Override
	public ExpressionContext extendContext(ExpressionContext ctx, StellaType expected) throws StellaException {		
		StellaVariantType expectedVariantType = (StellaVariantType) expected;
		
		return labelPattern.extendContext(ctx, expectedVariantType.getLabelType(labelName)); 
	}

	@Override
	public String toString() {
		return String.format("<| %s = %s |>", labelName, labelPattern);
	}
}
