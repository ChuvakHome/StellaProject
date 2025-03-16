package ru.itmo.stella.typechecker.exception.record;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaRecordType;

public class StellaUnexpectedFieldAccessException extends StellaException {
	public StellaUnexpectedFieldAccessException(
			String accessField, 
			StellaRecordType recordType, 
			StellaExpression recordExpr) 
	{
		super(
			StellaTypeErrorCode.ERROR_UNEXPECTED_FIELD_ACCESS,
			"unexpected access to field %s\\s"
			+ "in a record of type\\S"
			+ "%s\\s"
			+ "in the expression\\S"
			+ "%s",
			accessField,
			recordType,
			recordExpr
		);
	}
}
