package ru.itmo.stella.typechecker.exception.tuple;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaTupleType;

public class StellaTupleIndexOutOfBoundsException extends StellaException {
	public StellaTupleIndexOutOfBoundsException(
				int componentNumber,
				StellaExpression tupleExpr,
				StellaTupleType tupleType
			) {
		super(StellaTypeErrorCode.ERROR_TUPLE_INDEX_OUT_OF_BOUNDS,
					"unexpected access to component number %d\\s"
					+ "in a tuple\\S"
					+ "%s\\s"
					+ "of length %d\\s"
					+ "of type\\S"
					+ "%s",
					componentNumber,
					tupleExpr,
					tupleType.getFieldsCount(),
					tupleType
				);
	}
}
