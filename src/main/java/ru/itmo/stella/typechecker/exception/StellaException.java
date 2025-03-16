package ru.itmo.stella.typechecker.exception;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;

public class StellaException extends Exception {
	private final String message;
	private final StellaTypeErrorCode errorCode;
	
	public StellaException(StellaTypeErrorCode errorCode, String format, Object... args) {
		super(
			String.format(format, args).replace("\\s", " ").replace("\\S", " ")
		);
		
		this.message = String.format(
					format, args
				).replace("\\s", "\n")
				.replace("\\S", "\n  ");
		this.errorCode = errorCode;
	}
	
	public StellaTypeErrorCode getErrorCode() {
		return errorCode;
	}
	
	public String getRecordMessage() {
		return message;
	}
}
