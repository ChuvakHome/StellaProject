package ru.itmo.stella.typechecker.exception.record;

import java.util.Collection;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaDuplicateRecordTypeFieldsException extends StellaException {
	public StellaDuplicateRecordTypeFieldsException(
			Collection<String> duplicateFields, 
			String recordTypeStr) 
	{
		super(
			StellaTypeErrorCode.ERROR_DUPLICATE_RECORD_TYPE_FIELDS,
			"duplicate record fields\\S"
			+ "%s\\s"
			+ "in record type\\S"
			+ "%s",
			String.join(", ", duplicateFields),
			recordTypeStr
		);
	}
}
