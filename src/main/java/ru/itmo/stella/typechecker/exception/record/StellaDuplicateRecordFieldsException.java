package ru.itmo.stella.typechecker.exception.record;

import java.util.Collection;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaDuplicateRecordFieldsException extends StellaException {
	public StellaDuplicateRecordFieldsException(
			Collection<String> duplicateFields, 
			String recordExprStr) 
	{
		super(
			StellaTypeErrorCode.ERROR_DUPLICATE_RECORD_FIELDS,
			"duplicate record fields\\S"
			+ "%s\\s"
			+ "in record\\S"
			+ "%s",
			String.join(", ", duplicateFields),
			recordExprStr
		);
	}
}
