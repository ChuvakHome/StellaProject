package ru.itmo.stella.typechecker.expr.visitor;

import ru.itmo.stella.typechecker.StellaTypechecker;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.util.ThrowingOptional;

public interface StellaExprVisitor extends ru.itmo.stella.lang.Absyn.Expr.Visitor<ThrowingOptional<StellaExpression>, StellaTypechecker.TypecheckContext> {

}
