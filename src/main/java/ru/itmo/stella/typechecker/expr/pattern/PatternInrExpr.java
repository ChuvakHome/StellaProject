package ru.itmo.stella.typechecker.expr.pattern;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.pattern.StellaUnexpectedPatternForTypeException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.type.StellaSumType;
import ru.itmo.stella.typechecker.type.StellaType;

public class PatternInrExpr extends PatternExpr {
	private PatternExpr inrExpr;
	
	public PatternInrExpr(PatternExpr inrExpr) {
		super(Tag.INR);
		
		this.inrExpr = inrExpr;
	}
	
	public PatternExpr getInrPattern() {
		return inrExpr;
	}

	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.SUM)
			throw new StellaUnexpectedPatternForTypeException(this, expected);
		
		StellaSumType expectedSumType = (StellaSumType) expected;
		
		inrExpr.checkType(context, expectedSumType.getRightType());
	}
	
	@Override
	public ExpressionContext extendContext(ExpressionContext context, StellaType expected) throws StellaException {
		StellaSumType expectedSumType = (StellaSumType) expected;
		
		return inrExpr.extendContext(context, expectedSumType.getRightType());
	}

	@Override
	public String toString() {
		return String.format("inr(%s)", inrExpr);
	}
}
