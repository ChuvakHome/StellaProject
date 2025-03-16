package ru.itmo.stella.typechecker.expr.pattern;

import ru.itmo.stella.typechecker.exception.StellaException;
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
	
	public PatternExpr getInlExpression() {
		return inlExpr;
	}

	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.SUM)
			throw new StellaUnexpectedPatternForTypeException(this, expected);
		
		StellaSumType expectedSumType = (StellaSumType) expected;
		
		inlExpr.checkType(context, expectedSumType.getLeftType());
	}
	
	@Override
	public ExpressionContext extendContext(ExpressionContext context, StellaType expected) throws StellaException {
		StellaSumType expectedSumType = (StellaSumType) expected;
		
		return inlExpr.extendContext(context, expectedSumType.getLeftType());
	}

	@Override
	public String toString() {
		return String.format("inl(%s)", inlExpr);
	}
}
