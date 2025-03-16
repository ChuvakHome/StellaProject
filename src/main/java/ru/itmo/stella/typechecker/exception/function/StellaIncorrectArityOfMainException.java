package ru.itmo.stella.typechecker.exception.function;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaIncorrectArityOfMainException extends StellaException {
	public StellaIncorrectArityOfMainException() {
		super(StellaTypeErrorCode.ERROR_INCORRECT_ARITY_OF_MAIN, "main function must have exactly one parameter");
	}
}
