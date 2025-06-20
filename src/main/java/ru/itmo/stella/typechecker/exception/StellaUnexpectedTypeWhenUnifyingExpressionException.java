package ru.itmo.stella.typechecker.exception;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaUnexpectedTypeWhenUnifyingExpressionException extends StellaException {
	private StellaExpression expression;
	private StellaType expected, actual;
	
	public StellaUnexpectedTypeWhenUnifyingExpressionException(StellaExpression expression, StellaType expected, StellaType actual) {
		super(
			StellaTypeErrorCode.ERROR_UNEXPECTED_TYPE_FOR_EXPRESSION,
			"when unifying expected type\\S"
			+ "%s\\s"
			+ "against actual type\\S"
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
