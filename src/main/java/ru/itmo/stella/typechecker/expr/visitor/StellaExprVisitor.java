package ru.itmo.stella.typechecker.expr.visitor;

import ru.itmo.stella.typechecker.StellaTypechecker;
import ru.itmo.stella.typechecker.expr.StellaExpression;

public interface StellaExprVisitor extends ru.itmo.stella.lang.Absyn.Expr.Visitor<StellaExpression, StellaTypechecker.TypecheckContext> {

}
