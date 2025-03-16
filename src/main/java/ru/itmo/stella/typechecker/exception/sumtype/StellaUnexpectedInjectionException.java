package ru.itmo.stella.typechecker.exception.sumtype;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaUnexpectedInjectionException extends StellaException {
	private StellaExpression expression;
	private StellaType expected;
	
	public StellaUnexpectedInjectionException(String message, StellaType expected, StellaExpression injectionExpression) {
		super(StellaTypeErrorCode.ERROR_UNEXPECTED_INJECTION, message);
		
		this.expected = expected;
		this.expression = injectionExpression;
	}
	
	public StellaUnexpectedInjectionException(StellaType expected, StellaExpression injectionExpression) {
		this(
			String.format(
				"expected an expression of a non-sum type\\S"
				+ "%s\\s"
				+ "but got an injection into a sum type\\S"
				+ "%s\\s",
				expected,
				injectionExpression
			),
			expected, injectionExpression
		);
	}
	
	public StellaExpression getExpression() {
		return expression;
	}
	
	public StellaType getExpectedType() {
		return expected;
	}
}
