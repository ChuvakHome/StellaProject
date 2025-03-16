package ru.itmo.stella.typechecker.exception.record;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaUnexpectedRecordException extends StellaException {
	private StellaExpression expression;
	private StellaType expected;
	
	public StellaUnexpectedRecordException(String message, StellaType expected, StellaExpression expression) {
		super(StellaTypeErrorCode.ERROR_UNEXPECTED_RECORD, message);
		
		this.expression = expression;
		this.expected = expected;
	}
	
	public StellaUnexpectedRecordException(StellaType expected, StellaExpression expression) {
		this(
			String.format(
				"expected an expression of a non-record type\\S"
				+ "%s\\s"
				+ "but got a record\\S"
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
