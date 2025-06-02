package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.type.StellaType;

public class TryWithExpr extends StellaExpression {
	private StellaExpression tryExpr;
	private StellaExpression withExpr;
	
	public TryWithExpr(StellaExpression tryExpression, StellaExpression withExpression) {
		this.tryExpr = tryExpression;
		this.withExpr = withExpression;
	}
	
	public StellaExpression getTryExpression() {
		return tryExpr;
	}
	
	public StellaExpression getWithExpression() {
		return withExpr;
	}

	@Override
	protected void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		tryExpr.checkType(context, expected);
		withExpr.checkType(context, expected);
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		StellaType tryExprType = tryExpr.inferType(context);
		
		withExpr.checkType(context, tryExprType);
		
		return tryExprType;
	}

	@Override
	public String toString() {
		return String.format("try {\n  %s\n} with {\n  %s\n}", tryExpr, withExpr);
	}
}
