package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.reference.StellaUnexpectedReferenceException;
import ru.itmo.stella.typechecker.type.StellaRefType;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaType.Tag;

public class RefExpr extends StellaExpression {
	private StellaExpression expr;
	
	public RefExpr(StellaExpression expression) {
		this.expr = expression;
	}
	
	public StellaExpression getExpression() {
		return expr;
	}
	
	@Override
	public void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != Tag.REF)
			throw new StellaUnexpectedReferenceException(expected, this);
		
		StellaRefType expectedRef = (StellaRefType) expected;
		
		expr.checkType(context, expectedRef.getReferencedType());
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		return new StellaRefType(expr.inferType(context));
	}

	@Override
	public String toString() {
		return String.format("new (%s)", expr);
	}

}
