package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.StellaUnexpectedTypeWhenUnifyingExpressionException;
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
	protected void doTypeCheckConstrainted(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.REF && expected.getTypeTag() != StellaType.Tag.TYPE_VAR)
			throw new StellaUnexpectedTypeWhenUnifyingExpressionException(this, expected, inferType(context));
		
		if (expected.getTypeTag() == StellaType.Tag.TYPE_VAR) {
			super.doTypeCheckConstrainted(context, expected);
			
			return;
		}
		
		StellaRefType expectedRef = (StellaRefType) expected;
		
		expr.checkType(context, expectedRef.getReferencedType());
	}
	
	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != Tag.REF)
			throw new StellaUnexpectedReferenceException(expected, this);
		
		StellaRefType expectedRef = (StellaRefType) expected;
		
		expr.checkType(context, expectedRef.getReferencedType());
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		return new StellaRefType(expr.inferType(context));
	}

	@Override
	public String toString() {
		return String.format("new (%s)", expr);
	}

}
