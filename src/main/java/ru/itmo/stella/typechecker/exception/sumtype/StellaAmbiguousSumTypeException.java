package ru.itmo.stella.typechecker.exception.sumtype;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaAmbiguousSumTypeException extends StellaException {
	public StellaAmbiguousSumTypeException() {
		super(StellaTypeErrorCode.ERROR_AMBIGUOUS_SUM_TYPE, "type inference of sum types is not supported");
	}
}
