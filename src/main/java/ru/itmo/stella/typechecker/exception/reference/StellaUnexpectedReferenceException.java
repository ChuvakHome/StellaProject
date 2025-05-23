package ru.itmo.stella.typechecker.exception.reference;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.ConstMemoryExpr;
import ru.itmo.stella.typechecker.expr.RefExpr;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaUnexpectedReferenceException extends StellaException {
	private StellaExpression expression;
	private StellaType expected;

	public StellaUnexpectedReferenceException(StellaType expected, RefExpr expression) {
		super(
			StellaTypeErrorCode.ERROR_UNEXPECTED_REFERENCE,
			String.format(
				"expected an expression of a non-reference type\\S"
				+ "%s\\s"
				+ "but got a new reference\\S"
				+ "%s",
				expected,
				expression.getExpression()
			),
			expected, expression
		);
		
		this.expected = expected;
		this.expression = expression;
	}
	
	public StellaUnexpectedReferenceException(StellaType expected, ConstMemoryExpr expression) {
		super(
			StellaTypeErrorCode.ERROR_UNEXPECTED_MEMORY_ADDRESS,
			String.format(
				"expected an expression of a non-reference type\\S"
				+ "%s\\s"
				+ "but got a bare memory address\\S"
				+ "%s",
				expected,
				expression
			),
			expected, expression
		);
		
		this.expected = expected;
		this.expression = expression;
	}

	public StellaExpression getExpression() {
		return expression;
	}
	
	public StellaType getExpectedType() {
		return expected;
	}
}
