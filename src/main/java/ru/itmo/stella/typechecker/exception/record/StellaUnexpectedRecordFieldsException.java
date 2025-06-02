package ru.itmo.stella.typechecker.exception.record;

import java.util.List;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaRecordType;

public class StellaUnexpectedRecordFieldsException extends StellaException {
	public StellaUnexpectedRecordFieldsException(
			List<String> unexpectedFields, 
			StellaRecordType recordType, 
			StellaExpression recordExpr) 
	{
		super(
			StellaTypeErrorCode.ERROR_UNEXPECTED_RECORD_FIELDS,
			"unexpected fields\\S"
			+ "%s\\s"
			+ "for an expected record of type\\S"
			+ "%s\\s"
			+ "in the record\\S"
			+ "%s",
			String.join(", ", unexpectedFields),
			recordType,
			recordExpr
		);
	}
	
	public StellaUnexpectedRecordFieldsException(
			List<String> unexpectedFields, 
			StellaRecordType expectedType,
			StellaRecordType actualType,
			StellaExpression recordExpr) 
	{
		super(
			StellaTypeErrorCode.ERROR_UNEXPECTED_RECORD_FIELDS,
			"unexpected fields\\S"
			+ "%s\\s"
			+ "for an expected record type\\S"
			+ "%s\\s"
			+ "in the actual type\\S"
			+ "%s\\s"
			+ "when typechecking the expression\\S"
			+ "%s",
			String.join(", ", unexpectedFields),
			expectedType,
			actualType,
			recordExpr
		);
	}
}
