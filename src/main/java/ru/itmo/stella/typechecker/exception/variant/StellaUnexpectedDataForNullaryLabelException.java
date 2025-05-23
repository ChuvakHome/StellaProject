package ru.itmo.stella.typechecker.exception.variant;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaUnexpectedDataForNullaryLabelException extends StellaException {
	private String nullaryLabel;
	
	public StellaUnexpectedDataForNullaryLabelException(String nullaryLabel) {
		super(
			StellaTypeErrorCode.ERROR_UNEXPECTED_DATA_FOR_NULLARY_LABEL,
			"expected a nullary label %s",
			nullaryLabel
		);
		
		this.nullaryLabel = nullaryLabel;
	}

	public String getNullaryLabel() {
		return nullaryLabel;
	}
}
