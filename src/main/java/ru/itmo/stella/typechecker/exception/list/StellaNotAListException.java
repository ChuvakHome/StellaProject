package ru.itmo.stella.typechecker.exception.list;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaNotAListException extends StellaException {
	public StellaNotAListException(
				StellaType actual,
				StellaExpression expr,
				StellaExpression listExpr
			) {
		super(StellaTypeErrorCode.ERROR_NOT_A_LIST,
					"expected a list type but got\\S"
					+ "%s\\s"
					+ "for the expression\\S"
					+ "%s\\s"
					+ "in the expression\\S"
					+ "%s",
					actual,
					expr,
					listExpr
				);
	}
}
