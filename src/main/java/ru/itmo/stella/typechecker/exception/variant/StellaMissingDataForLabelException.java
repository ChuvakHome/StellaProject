package ru.itmo.stella.typechecker.exception.variant;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaMissingDataForLabelException extends StellaException {
	private String label;
	private StellaType expectedType; 
	
	public StellaMissingDataForLabelException(String label, StellaType expectedType) {
		super(
			StellaTypeErrorCode.ERROR_MISSING_DATA_FOR_LABEL,
			"expected a unary label %s\\s"
			+ "with associated value of type\\S"
			+ "%s",
			label,
			expectedType
		);
		
		this.label = label;
		this.expectedType = expectedType;
	}

	public String getLabel() {
		return label;
	}
	
	public StellaType getExpectedType() {
		return expectedType;
	}
}
