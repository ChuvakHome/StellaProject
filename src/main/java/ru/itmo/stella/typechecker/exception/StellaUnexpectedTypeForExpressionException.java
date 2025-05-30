package ru.itmo.stella.typechecker.exception;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaUnexpectedTypeForExpressionException extends StellaException {
	private StellaExpression expression;
	private StellaType expected, actual;
	
	public StellaUnexpectedTypeForExpressionException(StellaExpression expression, StellaType expected, StellaType actual) {
		super(
			StellaTypeErrorCode.ERROR_UNEXPECTED_TYPE_FOR_EXPRESSION,
			"expected type\\S"
			+ "%s\\s"
			+ "but got\\S"
			+ "%s\\s"
			+ "when typechecking the expression\\S"
			+ "%s",
			expected,
			actual,
			expression
		);
		
		this.expression = expression;
		this.expected = expected;
		this.actual = actual;
	}
	
	public StellaExpression getExpression() {
		return expression;
	}
	
	public StellaType getExpectedType() {
		return expected;
	}
	
	public StellaType getActualType() {
		return actual;
	}
}
