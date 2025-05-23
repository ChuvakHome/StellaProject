package ru.itmo.stella.typechecker.expr.pattern.visitor;

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
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.util.StellaOptional;

public class StellaBasePatternExprVisitor implements StellaPatternExprVisitor {
	protected StellaTypeVisitor typeVisitor;
	
	public StellaBasePatternExprVisitor(StellaTypeVisitor typeVisitor) {
		this.typeVisitor = typeVisitor;
	}
	
	@Override
	public StellaOptional<PatternExpr> visit(PatternCastAs p, TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(PatternExpr.class, e);
		}
	}
	
	public PatternExpr doVisit(PatternCastAs p, TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<PatternExpr> visit(PatternAsc p, TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(PatternExpr.class, e);
		}
	}
	
	public PatternExpr doVisit(PatternAsc p, TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<PatternExpr> visit(PatternVariant p, TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(PatternExpr.class, e);
		}
	}
	
	public PatternExpr doVisit(PatternVariant p, TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<PatternExpr> visit(PatternInl p, TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(PatternExpr.class, e);
		}
	}
	
	public PatternExpr doVisit(PatternInl p, TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<PatternExpr> visit(PatternInr p, TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(PatternExpr.class, e);
		}
	}
	
	public PatternExpr doVisit(PatternInr p, TypecheckContext ctx) throws StellaException {
		return null;
	}
	
	@Override
	public StellaOptional<PatternExpr> visit(PatternTuple p, TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(PatternExpr.class, e);
		}
	}

	public PatternExpr doVisit(PatternTuple p, TypecheckContext ctx) throws StellaException {
		return null;
	}
	
	@Override
	public StellaOptional<PatternExpr> visit(PatternRecord p, TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(PatternExpr.class, e);
		}
	}
	
	public PatternExpr doVisit(PatternRecord p, TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<PatternExpr> visit(PatternList p, TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(PatternExpr.class, e);
		}
	}
	
	public PatternExpr doVisit(PatternList p, TypecheckContext ctx) throws StellaException {
		return null;
	}
	
	@Override
	public StellaOptional<PatternExpr> visit(PatternCons p, TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(PatternExpr.class, e);
		}
	}

	public PatternExpr doVisit(PatternCons p, TypecheckContext ctx) throws StellaException {
		return null;
	}
	
	@Override
	public StellaOptional<PatternExpr> visit(PatternFalse p, TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(PatternExpr.class, e);
		}
	}

	public PatternExpr doVisit(PatternFalse p, TypecheckContext ctx) throws StellaException {
		return null;
	}
	
	@Override
	public StellaOptional<PatternExpr> visit(PatternTrue p, TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(PatternExpr.class, e);
		}
	}

	public PatternExpr doVisit(PatternTrue p, TypecheckContext ctx) throws StellaException {
		return null;
	}
	
	@Override
	public StellaOptional<PatternExpr> visit(PatternUnit p, TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(PatternExpr.class, e);
		}
	}

	public PatternExpr doVisit(PatternUnit p, TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<PatternExpr> visit(PatternInt p, TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(PatternExpr.class, e);
		}
	}
	
	public PatternExpr doVisit(PatternInt p, TypecheckContext ctx) throws StellaException {
		return null;
	}
	
	@Override
	public StellaOptional<PatternExpr> visit(PatternSucc p, TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(PatternExpr.class, e);
		}
	}

	public PatternExpr doVisit(PatternSucc p, TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<PatternExpr> visit(PatternVar p, TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(PatternExpr.class, e);
		}
	}
	
	public PatternExpr doVisit(PatternVar p, TypecheckContext ctx) throws StellaException {
		return null;
	}
}
