package ru.itmo.stella.typechecker.exception.variant;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaAmbiguousVariantTypeException extends StellaException {
	public StellaAmbiguousVariantTypeException() {
		super(StellaTypeErrorCode.ERROR_AMBIGUOUS_VARIANT_TYPE, "type inference for variants is not supported");
	}
}
