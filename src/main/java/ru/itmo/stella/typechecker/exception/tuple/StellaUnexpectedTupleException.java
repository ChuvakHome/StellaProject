package ru.itmo.stella.typechecker.exception.tuple;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.ConsListExpr;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaUnexpectedTupleException extends StellaException {
	private StellaExpression expression;
	private StellaType expected;
	
	public StellaUnexpectedTupleException(String message, StellaType expected, StellaExpression expression) {
		super(StellaTypeErrorCode.ERROR_UNEXPECTED_TUPLE, message);
		
		this.expression = expression;
		this.expected = expected;
	}
	
	public StellaUnexpectedTupleException(StellaType expected, StellaExpression expression) {
		this(
			String.format(
				"expected an expression of a non-tuple type\\S"
				+ "%s\\s"
				+ "but got a tuple\\S"
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
