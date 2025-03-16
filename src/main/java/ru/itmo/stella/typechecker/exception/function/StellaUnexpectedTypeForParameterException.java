package ru.itmo.stella.typechecker.exception.function;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaUnexpectedTypeForParameterException extends StellaException {
	private StellaType expected, actual;
	private String wrongParameterName;
	private StellaExpression expression;
	
	public StellaUnexpectedTypeForParameterException(String message, StellaExpression expression, String wrongParameterName, StellaType expected, StellaType actual) {
		super(StellaTypeErrorCode.ERROR_UNEXPECTED_TYPE_FOR_PARAMETER, message);
		
		this.expression = expression;
		this.wrongParameterName = wrongParameterName;
		this.expected = expected;
		this.actual = actual;
	}
	
	public StellaUnexpectedTypeForParameterException(StellaExpression expression, String wrongParameterName, StellaType expected, StellaType actual) {
		this(
			String.format(
				"expected type\\S"
				+ "%s\\s"
				+ "but got\\S"
				+ "%s\\s"
				+ "for the parameter %s"
				+ "in function\\S"
				+ "%s",
				expected,
				actual,
				wrongParameterName,
				expression
			),
			expression, wrongParameterName, expected, actual
		);
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
