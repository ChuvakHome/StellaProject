package ru.itmo.stella.typechecker.expr.pattern;

import java.util.Objects;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.pattern.StellaAmbiguousPatternTypeException;
import ru.itmo.stella.typechecker.exception.pattern.StellaUnexpectedNonNullaryVariantPatternException;
import ru.itmo.stella.typechecker.exception.pattern.StellaUnexpectedNullaryVariantPatternException;
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
	public final int hashCode() {
		return Objects.hash(Tag.VARIANT, labelName, labelPattern);
	}
	
	public boolean equalsPattern(PatternExpr p) {
		PatternVariantExpr variantPattern = (PatternVariantExpr) p;
		
		return variantPattern.labelName.equals(labelName) && variantPattern.labelPattern.equals(labelPattern);
	}

	@Override
	public void checkType(ExpressionContext ctx, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.VARIANT)
			throw new StellaUnexpectedPatternForTypeException(this, expected);
		
		StellaVariantType expectedVariantType = (StellaVariantType) expected;
		
		StellaType expectedLabelType = expectedVariantType.getLabelType(labelName);
		
		if (!expectedVariantType.hasLabel(labelName))
			throw new StellaUnexpectedPatternForTypeException(this, expected);
		else if (expectedLabelType == StellaType.NO_TYPE && labelPattern != null)
			throw new StellaUnexpectedNonNullaryVariantPatternException(labelName, expectedVariantType, this);
		else if (expectedLabelType != StellaType.NO_TYPE && labelPattern == null)
			throw new StellaUnexpectedNullaryVariantPatternException(labelName, expectedVariantType, this);
		
		if (labelPattern != null)
			labelPattern.checkType(extendContext(ctx, expectedVariantType), expectedVariantType.getLabelType(labelName));
	}
	
	@Override
	public StellaType inferType(ExpressionContext ctx) throws StellaException {
		throw new StellaAmbiguousPatternTypeException(this);
	}

	@Override
	public ExpressionContext extendContext(ExpressionContext ctx, StellaType expected) throws StellaException {		
		StellaVariantType expectedVariantType = (StellaVariantType) expected;
		
		return labelPattern == null ? ctx : labelPattern.extendContext(ctx, expectedVariantType.getLabelType(labelName)); 
	}
	
	@Override
	public PatternVariantExpr getStubPattern() {
		return new PatternVariantExpr(labelName, labelPattern.getStubPattern());
	}

	@Override
	public String toString() {
		return labelPattern == null
			? String.format("<| %s |>", labelName)
			: String.format("<| %s = %s |>", labelName, labelPattern)
			;
	}
}
