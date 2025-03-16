package ru.itmo.stella.typechecker.exception.function;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaFunctionType;

public class StellaIncorrectNumberOfArgumentsException extends StellaException {
	public StellaIncorrectNumberOfArgumentsException(
				StellaExpression fnExpr,
				StellaFunctionType fnType,
				int actualArgsNumber,
				StellaExpression callExpr
			) {
		super(StellaTypeErrorCode.ERROR_INCORRECT_NUMBER_OF_ARGUMENTS,
					"expected %d argument(s)\\s"
					+ "for the function\\S"
					+ "%s as (%s)\\s"
					+ "but got %d argument(s)\\s"
					+ "in the function call\\S"
					+ "%s",
					fnType.getArity(),
					fnExpr, fnType,
					actualArgsNumber,
					callExpr
				);
	}
}
