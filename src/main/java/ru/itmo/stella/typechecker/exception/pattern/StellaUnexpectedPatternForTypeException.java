package ru.itmo.stella.typechecker.exception.pattern;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaUnexpectedPatternForTypeException extends StellaException {
	private PatternExpr expression;
	private StellaType expected;
	
	public StellaUnexpectedPatternForTypeException(PatternExpr expression, StellaType expected) {
		super(
				StellaTypeErrorCode.ERROR_UNEXPECTED_PATTERN_FOR_TYPE,
			String.format(
				"unexpected pattern\\S"
				+ "%s\\s"
				+ "when pattern matching is expected for type\\S"
				+ "%s",
				expression,
				expected
			),
			expression, expected
		);
	}
	
	public StellaUnexpectedPatternForTypeException(StellaType expected, PatternExpr expression, StellaType actual) {
		super(
				StellaTypeErrorCode.ERROR_UNEXPECTED_PATTERN_FOR_TYPE,
			String.format(
				"expected a pattern for %s\\s"
				+ "but got\\S"
				+ "%s\\s"
				+ "with actual type\\S"
				+ "%s",
				expected,
				expression,
				actual
			),
			expression, expected
		);
	}
	
	public PatternExpr getPatternExpression() {
		return expression;
	}
	
	public StellaType getExpectedType() {
		return expected;
	}
}
