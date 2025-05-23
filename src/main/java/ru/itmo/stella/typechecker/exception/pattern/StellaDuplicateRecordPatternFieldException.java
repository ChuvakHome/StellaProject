package ru.itmo.stella.typechecker.exception.pattern;

import java.util.Collection;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaDuplicateRecordPatternFieldException extends StellaException {
	public StellaDuplicateRecordPatternFieldException(Collection<String> duplicateField, String recordPatternStr) {
		super(
			StellaTypeErrorCode.ERROR_DUPLICATE_RECORD_PATTERN_FIELDS, 
			"duplicate record fields\\S"
			+ "%s\\s"
			+ "in record pattern\\S"
			+ "%s",
			String.join(", ", duplicateField),
			recordPatternStr
		);
	}
}
