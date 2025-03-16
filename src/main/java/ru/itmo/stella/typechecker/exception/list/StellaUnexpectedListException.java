package ru.itmo.stella.typechecker.exception.list;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.ConsListExpr;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaUnexpectedListException extends StellaException {
	private StellaExpression expression;
	private StellaType expected;
	
	public StellaUnexpectedListException(String message, StellaType expected, StellaExpression expression) {
		super(StellaTypeErrorCode.ERROR_UNEXPECTED_LIST, message);
		
		this.expression = expression;
		this.expected = expected;
	}
	
	public StellaUnexpectedListException(StellaType expected, StellaExpression expression) {
		this(
			String.format(
				"expected an expression of a non-list type\\S"
				+ "%s\\s"
				+ "but got a list\\S"
				+ "%s",
				expected,
				expression
			),
			expected, expression
		);
	}
	
	public StellaUnexpectedListException(StellaType expected, ConsListExpr expression) {
		this(
			String.format(
				"expected an expression of a non-list type\\S"
				+ "%s\\s"
				+ "but got a non-empty list\\S"
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
