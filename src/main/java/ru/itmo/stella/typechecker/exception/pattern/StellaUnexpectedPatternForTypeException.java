package ru.itmo.stella.typechecker.exception.pattern;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaUnexpectedPatternForTypeException extends StellaException {
	private PatternExpr expression;
	private StellaType expected;
	
	public StellaUnexpectedPatternForTypeException(String message, PatternExpr expression, StellaType expected) {
		super(StellaTypeErrorCode.ERROR_UNEXPECTED_PATTERN_FOR_TYPE, message);
		
		this.expression = expression;
		this.expected = expected;
	}
	
	public StellaUnexpectedPatternForTypeException(PatternExpr expression, StellaType expected) {
		this(
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
	
	public PatternExpr getPatternExpression() {
		return expression;
	}
	
	public StellaType getExpectedType() {
		return expected;
	}
}
