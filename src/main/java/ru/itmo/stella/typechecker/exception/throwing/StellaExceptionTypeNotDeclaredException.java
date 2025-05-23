package ru.itmo.stella.typechecker.exception.throwing;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaExceptionTypeNotDeclaredException extends StellaException {
	public StellaExceptionTypeNotDeclaredException() {
		super(StellaTypeErrorCode.ERROR_EXCEPTION_TYPE_NOT_DECLARED, "cannot throw exceptions, because exception type is not declared");
	}
}
