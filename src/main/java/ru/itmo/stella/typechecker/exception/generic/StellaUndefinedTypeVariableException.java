package ru.itmo.stella.typechecker.exception.generic;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaUndefinedTypeVariableException extends StellaException {

	public StellaUndefinedTypeVariableException(String typeVariable) {
		super(
			StellaTypeErrorCode.ERROR_UNDEFINED_TYPE_VARIABLE,
			"undefined type variable %s",
			typeVariable
		);
	}

}
