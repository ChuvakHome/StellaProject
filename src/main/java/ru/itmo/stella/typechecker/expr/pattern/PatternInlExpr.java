package ru.itmo.stella.typechecker.expr.pattern;

import java.util.Objects;

import ru.itmo.stella.typechecker.StellaLanguageExtension;
import ru.itmo.stella.typechecker.constraint.StellaConstraint;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.pattern.StellaAmbiguousPatternTypeException;
import ru.itmo.stella.typechecker.exception.pattern.StellaUnexpectedPatternForTypeException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.type.StellaSumType;
import ru.itmo.stella.typechecker.type.StellaType;

public class PatternInlExpr extends PatternExpr {
	private PatternExpr inlExpr;
	
	public PatternInlExpr(PatternExpr inlExpr) {
		super(Tag.INL);
		
		this.inlExpr = inlExpr;
	}
	
	public PatternExpr getInlPattern() {
		return inlExpr;
	}
	
	@Override
	public final int hashCode() {
		return Objects.hash(Tag.INL, inlExpr);
	}
	
	public boolean equalsPattern(PatternExpr p) {
		return ((PatternInlExpr) p).inlExpr == inlExpr;
	}

	@Override
	public void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.SUM)
			throw new StellaUnexpectedPatternForTypeException(this, expected);
		
		StellaSumType expectedSumType = (StellaSumType) expected;
		
		inlExpr.checkType(context, expectedSumType.getLeftType());
	}
	
	@Override
	public StellaType doTypeInference(ExpressionContext context) throws StellaException {
		if (context.isExtensionUsed(StellaLanguageExtension.AMBIGUOUS_TYPE_AS_BOTTOM)) {
			StellaType leftType = inlExpr.inferType(context);
			
			return new StellaSumType(leftType, StellaType.BOTTOM);
		} else 
			throw new StellaAmbiguousPatternTypeException(this);
	}
	
	@Override
	public StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		StellaType leftType = inlExpr.inferType(context);
		
		return new StellaSumType(leftType, getCachedType(context));
	}
	
	@Override
	public ExpressionContext extendContext(ExpressionContext context, StellaType expected) throws StellaException {
		StellaSumType expectedSumType;
		
		if (expected.getTypeTag() == StellaType.Tag.TYPE_VAR) {
			expectedSumType = new StellaSumType(context.newAutoTypeVar(), context.newAutoTypeVar());
			
			context.addConstraint(
						new StellaConstraint(expected, expectedSumType, this)
					);
		} else if (expected.getTypeTag() == StellaType.Tag.SUM)
			expectedSumType = (StellaSumType) expected;
		else
			throw new StellaUnexpectedPatternForTypeException(this, expected);
		
		return inlExpr.extendContext(context, expectedSumType.getLeftType());
	}
	
	@Override
	public PatternInlExpr getStubPattern() {
		return new PatternInlExpr(inlExpr.getStubPattern());
	}

	@Override
	public String toString() {
		return String.format("inl(%s)", inlExpr);
	}
}
