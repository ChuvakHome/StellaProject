package ru.itmo.stella.typechecker.exception.panic;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaAmbiguousPanicTypeException extends StellaException {
	public StellaAmbiguousPanicTypeException() {
		super(StellaTypeErrorCode.ERROR_AMBIGUOUS_PANIC_TYPE, "cannot infer type for panic");
	}

}
