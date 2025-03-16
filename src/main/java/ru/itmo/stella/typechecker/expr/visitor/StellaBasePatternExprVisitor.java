package ru.itmo.stella.typechecker.expr.visitor;

import ru.itmo.stella.lang.Absyn.PatternAsc;
import ru.itmo.stella.lang.Absyn.PatternCastAs;
import ru.itmo.stella.lang.Absyn.PatternCons;
import ru.itmo.stella.lang.Absyn.PatternFalse;
import ru.itmo.stella.lang.Absyn.PatternInl;
import ru.itmo.stella.lang.Absyn.PatternInr;
import ru.itmo.stella.lang.Absyn.PatternInt;
import ru.itmo.stella.lang.Absyn.PatternList;
import ru.itmo.stella.lang.Absyn.PatternRecord;
import ru.itmo.stella.lang.Absyn.PatternSucc;
import ru.itmo.stella.lang.Absyn.PatternTrue;
import ru.itmo.stella.lang.Absyn.PatternTuple;
import ru.itmo.stella.lang.Absyn.PatternUnit;
import ru.itmo.stella.lang.Absyn.PatternVar;
import ru.itmo.stella.lang.Absyn.PatternVariant;
import ru.itmo.stella.typechecker.BaseStellaTypechecker.StellaTypeVisitor;
import ru.itmo.stella.typechecker.StellaTypechecker.TypecheckContext;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public class StellaBasePatternExprVisitor implements StellaPatternExprVisitor {
	protected StellaTypeVisitor typeVisitor;
	
	public StellaBasePatternExprVisitor(StellaTypeVisitor typeVisitor) {
		this.typeVisitor = typeVisitor;
	}
	
	@Override
	public PatternExpr visit(PatternCastAs p, TypecheckContext arg) {
		return null;
	}

	@Override
	public PatternExpr visit(PatternAsc p, TypecheckContext arg) {
		return null;
	}

	@Override
	public PatternExpr visit(PatternVariant p, TypecheckContext arg) {
		return null;
	}

	@Override
	public PatternExpr visit(PatternInl p, TypecheckContext arg) {
		return null;
	}

	@Override
	public PatternExpr visit(PatternInr p, TypecheckContext arg) {
		return null;
	}

	@Override
	public PatternExpr visit(PatternTuple p, TypecheckContext arg) {
		return null;
	}

	@Override
	public PatternExpr visit(PatternRecord p, TypecheckContext arg) {
		return null;
	}

	@Override
	public PatternExpr visit(PatternList p, TypecheckContext arg) {
		return null;
	}

	@Override
	public PatternExpr visit(PatternCons p, TypecheckContext arg) {
		return null;
	}

	@Override
	public PatternExpr visit(PatternFalse p, TypecheckContext arg) {
		return null;
	}

	@Override
	public PatternExpr visit(PatternTrue p, TypecheckContext arg) {
		return null;
	}

	@Override
	public PatternExpr visit(PatternUnit p, TypecheckContext arg) {
		return null;
	}

	@Override
	public PatternExpr visit(PatternInt p, TypecheckContext arg) {
		return null;
	}

	@Override
	public PatternExpr visit(PatternSucc p, TypecheckContext arg) {
		return null;
	}

	@Override
	public PatternExpr visit(PatternVar p, TypecheckContext arg) {
		return null;
	}
}
