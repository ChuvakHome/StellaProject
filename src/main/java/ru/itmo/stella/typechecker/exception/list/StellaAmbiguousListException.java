package ru.itmo.stella.typechecker.exception.list;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaAmbiguousListException extends StellaException {
	public StellaAmbiguousListException(String format, Object... args) {
		super(StellaTypeErrorCode.ERROR_AMBIGUOUS_LIST, format, args);
	}
	
	public static class StellaEmptyListIsAmbiguousException extends StellaAmbiguousListException {
		public StellaEmptyListIsAmbiguousException() {
			super("type inference of empty lists is not supported");
		}
	}
}
