package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public class CastAsExpr extends StellaExpression {
	private StellaExpression castExpr;
	private StellaType castType;
	
	public CastAsExpr(StellaExpression castExpr, StellaType castType) {
		this.castExpr = castExpr;
		this.castType = castType;
	}
	
	public StellaExpression getCastExpression() {
		return castExpr;
	}
	
	public StellaType getCastType() {
		return castType;
	}
	
	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypeMatching(context, expected, castType);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		return castType;
	}

	@Override
	public String toString() {
		return String.format(
				"%s cast as %s",
				castExpr,
				castType
			);
	}
}
