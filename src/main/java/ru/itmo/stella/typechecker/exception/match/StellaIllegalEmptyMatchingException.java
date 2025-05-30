package ru.itmo.stella.typechecker.exception.match;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;

public class StellaIllegalEmptyMatchingException extends StellaException {
	public StellaIllegalEmptyMatchingException(
				StellaExpression matchExpr
			) {
		super(StellaTypeErrorCode.ERROR_ILLEGAL_EMPTY_MATCHING,
					"illegal empty matching\\s"
					+ "in expression\\S"
					+ "%s",
					matchExpr
				);
	}
}
