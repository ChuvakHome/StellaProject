package ru.itmo.stella.typechecker.exception;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;

public class StellaUndefinedVariableException extends StellaException {
	public StellaUndefinedVariableException(String varName) {
		super(StellaTypeErrorCode.ERROR_UNDEFINED_VARIABLE, "undefined variable %s", varName);
	}
}
