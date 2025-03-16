package ru.itmo.stella.typechecker.exception.function;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaUnexpectedLambdaException extends StellaException {
	private StellaExpression expression;
	private StellaType expected;
	
	public StellaUnexpectedLambdaException(String message, StellaType expected, StellaExpression expression) {
		super(StellaTypeErrorCode.ERROR_UNEXPECTED_LAMBDA, message);
		
		this.expression = expression;
		this.expected = expected;
	}
	
	public StellaUnexpectedLambdaException(StellaType expected, StellaExpression lambdaExpression) {
		this(
			String.format(
				"expected an expression of a non-function type\\S"
				+ "%s\\s"
				+ "but got an anonymous function\\S"
				+ "%s",
				expected,
				lambdaExpression
			),
			expected, lambdaExpression
		);
	}
	
	public StellaExpression getExpression() {
		return expression;
	}
	
	public StellaType getExpectedType() {
		return expected;
	}
}
