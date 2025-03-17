package ru.itmo.stella.typechecker.exception.variant;

import java.util.Collection;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaDuplicateVariantTypeFieldsException extends StellaException {
	public StellaDuplicateVariantTypeFieldsException(
			Collection<String> duplicateFields, 
			String variantTypeStr) 
	{
		super(
			StellaTypeErrorCode.ERROR_DUPLICATE_VARIANT_TYPE_FIELDS,
			"duplicate variant labels\\S"
			+ "%s\\s"
			+ "in variant type\\S"
			+ "%s",
			String.join(", ", duplicateFields),
			variantTypeStr
		);
	}
}
