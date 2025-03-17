package ru.itmo.stella.typechecker.expr.pattern.visitor;

import ru.itmo.stella.typechecker.StellaTypechecker;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public interface StellaPatternExprVisitor extends ru.itmo.stella.lang.Absyn.Pattern.Visitor<PatternExpr, StellaTypechecker.TypecheckContext> {

}
