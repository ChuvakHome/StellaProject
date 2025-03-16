package ru.itmo.stella.typechecker.exception.tuple;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaTupleType;

public class StellaUnexpectedTupleLengthException extends StellaException {
	public StellaUnexpectedTupleLengthException(
				StellaTupleType expectedTupleType,
				int actualComponentsCount,
				StellaExpression actualTupleExpr
			) {
		super(StellaTypeErrorCode.ERROR_UNEXPECTED_TUPLE_LENGTH,
					"expected %d component(s)\\s"
					+ "for a tuple of type\\S"
					+ "%s\\s"
					+ "but got %d component(s)\\s"
					+ "in tuple\\S"
					+ "%s",
					expectedTupleType.getFieldsCount(),
					expectedTupleType,
					actualComponentsCount,
					actualTupleExpr
				);
	}
}
