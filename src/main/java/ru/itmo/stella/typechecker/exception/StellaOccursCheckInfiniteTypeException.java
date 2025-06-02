package ru.itmo.stella.typechecker.exception;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaOccursCheckInfiniteTypeException extends StellaException {
	public StellaOccursCheckInfiniteTypeException(StellaType baseType, StellaType infiniteType, StellaExpression expr) {
		super(StellaTypeErrorCode.ERROR_OCCURS_CHECK_INFINITE_TYPE,
			"cannot construct an infinite type when type\\S"
			+ "%s\\s"
			+ "is expected to unify with\\S"
			+ "%s\\s"
			+ "when typechecking the expression\\S"
			+ "%s",
			baseType,
			infiniteType,
			expr
		);
	}
}
