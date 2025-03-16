package ru.itmo.stella.typechecker.exception.record;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaNotARecordException extends StellaException {
	public StellaNotARecordException(
				StellaType recordType,
				StellaExpression recordExpr,
				StellaExpression dotRecordExpr
			) {
		super(StellaTypeErrorCode.ERROR_NOT_A_RECORD,
					"expected an expression of record type but got\\S"
					+ "%s\\s"
					+ "for the expression\\S"
					+ "%s\\s"
					+ "in the expression\\S"
					+ "%s",
					recordType,
					recordExpr,
					dotRecordExpr
				);
	}
}
