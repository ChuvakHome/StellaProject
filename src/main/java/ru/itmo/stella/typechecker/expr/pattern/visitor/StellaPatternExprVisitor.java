package ru.itmo.stella.typechecker.expr.pattern.visitor;

import ru.itmo.stella.typechecker.StellaTypechecker;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.util.StellaOptional;

public interface StellaPatternExprVisitor extends ru.itmo.stella.lang.Absyn.Pattern.Visitor<StellaOptional<PatternExpr>, StellaTypechecker.TypecheckContext> {

}
