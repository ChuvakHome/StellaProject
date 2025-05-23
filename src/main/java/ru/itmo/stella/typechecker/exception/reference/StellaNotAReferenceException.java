package ru.itmo.stella.typechecker.exception.reference;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.AssignExpr;
import ru.itmo.stella.typechecker.expr.DerefExpr;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaNotAReferenceException extends StellaException {
	private StellaExpression expr;
	
	public StellaNotAReferenceException(DerefExpr expression, StellaType expressionType) {
		super(
			StellaTypeErrorCode.ERROR_NOT_A_REFERENCE,
				"cannot dereference an expression\\S"
			  + "%s\\s"
			  + "of a non-reference type\\S"
			  + "%s",
			expression.getExpression(), expressionType
		);
		
		this.expr = expression;
	}
	
	public StellaNotAReferenceException(AssignExpr expression) {
		super(
			StellaTypeErrorCode.ERROR_NOT_A_REFERENCE,
			"cannot assign a value to a non-reference %s", 
			expression.getLeftPart()
		);
		
		this.expr = expression;
	}
	
	public StellaExpression getExpression() {
		return expr;
	}
}
