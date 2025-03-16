package ru.itmo.stella.typechecker.exception.function;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaMissingMainException extends StellaException {
	public StellaMissingMainException() {
		super(StellaTypeErrorCode.ERROR_MISSING_MAIN, "Missing main function");
	}
}
