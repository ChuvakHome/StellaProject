package ru.itmo.stella.typechecker.exception.tuple;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaNotATupleException extends StellaException {
	public StellaNotATupleException(
				StellaExpression expr,
				StellaType actual,
				StellaExpression dotTupleExpr
			) {
		super(StellaTypeErrorCode.ERROR_NOT_A_TUPLE,
					"expected an expression of tuple type\\s"
					+ "but got expression\\S"
					+ "%s\\s"
					+ "of type\\S"
					+ "%s\\s"
					+ "in expression\\S"
					+ "%s",
					expr,
					actual,
					dotTupleExpr
				);
	}
}
