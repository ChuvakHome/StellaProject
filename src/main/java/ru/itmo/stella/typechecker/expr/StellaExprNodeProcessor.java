package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.lang.StellaParser;
import ru.itmo.stella.typechecker.exception.StellaException;

public interface StellaExprNodeProcessor {
	StellaExpression processExpr(ExpressionContext expressionContex, StellaParser.ExprContext ctx) throws StellaException;
	
	StellaExpression processExpr(ExpressionContext expressionContex, StellaParser.Expr1Context ctx) throws StellaException;
	
	StellaExpression processExpr(ExpressionContext expressionContex, StellaParser.Expr2Context ctx) throws StellaException;
	
	StellaExpression processExpr(ExpressionContext expressionContex, StellaParser.Expr3Context ctx) throws StellaException;
	
	StellaExpression processExpr(ExpressionContext expressionContex, StellaParser.Expr4Context ctx) throws StellaException;
	
	StellaExpression processExpr(ExpressionContext expressionContex, StellaParser.Expr5Context ctx) throws StellaException;
	
	StellaExpression processExpr(ExpressionContext expressionContex, StellaParser.Expr6Context ctx) throws StellaException;
	
	StellaExpression processExpr(ExpressionContext expressionContex, StellaParser.Expr7Context ctx) throws StellaException;
}
