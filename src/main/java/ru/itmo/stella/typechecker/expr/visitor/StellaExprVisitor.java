package ru.itmo.stella.typechecker.expr.visitor;

import ru.itmo.stella.typechecker.StellaTypechecker;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.util.StellaOptional;

public interface StellaExprVisitor extends ru.itmo.stella.lang.Absyn.Expr.Visitor<StellaOptional<StellaExpression>, StellaTypechecker.TypecheckContext> {

}
