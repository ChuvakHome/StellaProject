package ru.itmo.stella.typechecker.exception.variant;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaUnexpectedVariantException extends StellaException {
	private StellaExpression expression;
	private StellaType expected;
	
	public StellaUnexpectedVariantException(String message, StellaType expected, StellaExpression expression) {
		super(StellaTypeErrorCode.ERROR_UNEXPECTED_VARIANT, message);
		
		this.expression = expression;
		this.expected = expected;
	}
	
	public StellaUnexpectedVariantException(StellaType expected, StellaExpression expression) {
		this(
			String.format(
				"expected an expression of a non-variant type\\S"
				+ "%s\\s"
				+ "but got a variant\\S"
				+ "%s",
				expected,
				expression
			),
			expected, expression
		);
	}
	
	public StellaExpression getExpression() {
		return expression;
	}
	
	public StellaType getExpectedType() {
		return expected;
	}
}
