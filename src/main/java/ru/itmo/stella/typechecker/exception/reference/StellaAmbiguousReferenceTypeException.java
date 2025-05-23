package ru.itmo.stella.typechecker.exception.reference;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaAmbiguousReferenceTypeException extends StellaException {
	public StellaAmbiguousReferenceTypeException() {
		super(StellaTypeErrorCode.ERROR_AMBIGUOUS_REFERENCE_TYPE, "cannot infer a type of a bare memory address");
	}
}
