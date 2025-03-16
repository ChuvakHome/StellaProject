package ru.itmo.stella.typechecker.exception.record;

import java.util.List;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaRecordType;

public class StellaMissingRecordFieldsException extends StellaException {
	public StellaMissingRecordFieldsException(
			List<String> missingFields, 
			StellaRecordType recordType, 
			StellaExpression recordExpr) 
	{
		super(
			StellaTypeErrorCode.ERROR_MISSING_RECORD_FIELDS,
			"missing fields\\S"
			+ "%s\\s"
			+ "for an expected record of type\\S"
			+ "%s\\s"
			+ "in the record\\S"
			+ "%s",
			String.join(", ", missingFields),
			recordType,
			recordExpr
		);
	}
}
