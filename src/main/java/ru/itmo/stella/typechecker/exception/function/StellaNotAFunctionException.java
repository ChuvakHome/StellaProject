package ru.itmo.stella.typechecker.exception.function;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaNotAFunctionException extends StellaException {
	public StellaNotAFunctionException(
				StellaType actual,
				StellaExpression expr,
				StellaExpression callExpr
			) {
		super(StellaTypeErrorCode.ERROR_NOT_A_FUNCTION,
					"expected a function type but got\\S"
					+ "%s\\s"
					+ "for the expression\\S"
					+ "%s\\s"
					+ "in the function call\\S"
					+ "%s",
					actual,
					expr,
					callExpr
				);
	}
}
