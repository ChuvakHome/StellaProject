package ru.itmo.stella.typechecker.exception.generic;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.expr.TypeApplicationExpr;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaNotAGenericFunctionException extends StellaException {

	public StellaNotAGenericFunctionException(StellaType actualType, StellaExpression callExpr, TypeApplicationExpr appExpr) {
		super(
			StellaTypeErrorCode.ERROR_NOT_A_GENERIC_FUNCTION,
			"expected a universal type but got\\S"
			+ "%s\\s"
			+ "for the expression\\S"
			+ "%s\\s"
			+ "in the type application\\S"
			+ "%s",
			actualType,
			callExpr,
			appExpr
		);
	}
}
