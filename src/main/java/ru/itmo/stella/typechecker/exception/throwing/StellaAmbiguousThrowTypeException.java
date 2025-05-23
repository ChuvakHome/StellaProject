package ru.itmo.stella.typechecker.exception.throwing;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaAmbiguousThrowTypeException extends StellaException {
	public StellaAmbiguousThrowTypeException() {
		super(StellaTypeErrorCode.ERROR_AMBIGUOUS_THROW_TYPE, "cannot infer type for throw");
	}

}
