package ru.itmo.stella.typechecker.expr.visitor;

import ru.itmo.stella.lang.Absyn.TypeAsc;
import ru.itmo.stella.typechecker.BaseStellaTypechecker.StellaTypeVisitor;
import ru.itmo.stella.typechecker.StellaTypechecker;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.expr.TypeAscExpr;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaTypeAscriptionsExprVisitor extends StellaBaseExprVisitor {
	private StellaExprVisitor exprVisitor;
	
	public StellaTypeAscriptionsExprVisitor(StellaTypeVisitor typeVisitor, StellaExprVisitor exprVisitor) {
		super(typeVisitor);
		
		this.exprVisitor = exprVisitor;
	}
	
	@Override
	public StellaExpression visit(TypeAsc p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression expr = p.expr_.accept(exprVisitor, ctx);
		StellaType type = p.type_.accept(typeVisitor, ctx.getExpressionContext());
		
		return new TypeAscExpr(expr, type);
	}
}
