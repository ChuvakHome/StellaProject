package ru.itmo.stella.typechecker.exception.function;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaFunctionType;

public class StellaUnexpectedNumberOfParametersInLambdaException extends StellaException {
	public StellaUnexpectedNumberOfParametersInLambdaException(
				StellaFunctionType fnType,
				int actualArgsNumber,
				StellaExpression fnExpr
			) {
		super(StellaTypeErrorCode.ERROR_UNEXPECTED_NUMBER_OF_PARAMETERS_IN_LAMBDA,
					"expected %d argument(s)\\s"
					+ "for a function type\\S"
					+ "%s\\s"
					+ "but got %d argument(s)\\s"
					+ "in function\\S"
					+ "%s",
					fnType.getArity(),
					fnType,
					actualArgsNumber,
					fnExpr
				);
	}
}
