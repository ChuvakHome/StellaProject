package ru.itmo.stella.typechecker.exception.generic;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.expr.TypeApplicationExpr;

public class StellaIncorrectNumberOfTypeArguments extends StellaException {
	public StellaIncorrectNumberOfTypeArguments(
		int expectedTypeArgsNumber, 
		StellaExpression expr, 
		int actualTypeArgsNumber,
		TypeApplicationExpr appExpr
	) {
		super(
			StellaTypeErrorCode.ERROR_INCORRECT_NUMBER_OF_TYPE_ARGUMENTS,
			"expected %d type arguments\\s"
			+ "for the expression\\S"
			+ "%s\\s"
			+ "but got %d type arguments\\s"
			+ "in the type application\\S"
			+ "%s",
			expectedTypeArgsNumber,
			expr,
			actualTypeArgsNumber,
			appExpr
		);
	}
}
