package ru.itmo.stella.typechecker.expr.visitor;

import ru.itmo.stella.lang.Absyn.PatternFalse;
import ru.itmo.stella.lang.Absyn.PatternInl;
import ru.itmo.stella.lang.Absyn.PatternInr;
import ru.itmo.stella.lang.Absyn.PatternInt;
import ru.itmo.stella.lang.Absyn.PatternTrue;
import ru.itmo.stella.lang.Absyn.PatternUnit;
import ru.itmo.stella.lang.Absyn.PatternVar;
import ru.itmo.stella.lang.Absyn.PatternVariant;
import ru.itmo.stella.lang.Absyn.SomePatternData;
import ru.itmo.stella.typechecker.BaseStellaTypechecker.StellaTypeVisitor;
import ru.itmo.stella.typechecker.StellaTypechecker.TypecheckContext;
import ru.itmo.stella.typechecker.expr.pattern.PatternBoolExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternInlExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternInrExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternIntExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternUnitExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternVarExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternVariantExpr;

public class StellaCorePatternExprVisitor extends StellaBasePatternExprVisitor {
	public StellaCorePatternExprVisitor(StellaTypeVisitor typeVisitor) {
		super(typeVisitor);
	}
	
	@Override
	public PatternExpr visit(PatternInl p, TypecheckContext arg) {
		PatternExpr argExpr = p.pattern_.accept(this, arg);
		
		return new PatternInlExpr(argExpr);
	}

	@Override
	public PatternExpr visit(PatternInr p, TypecheckContext arg) {
		PatternExpr argExpr = p.pattern_.accept(this, arg);
		
		return new PatternInrExpr(argExpr);
	}
	
	@Override
	public PatternExpr visit(PatternFalse p, TypecheckContext arg) {
		return new PatternBoolExpr(false);
	}

	@Override
	public PatternExpr visit(PatternTrue p, TypecheckContext arg) {
		return new PatternBoolExpr(true);
	}

	@Override
	public PatternExpr visit(PatternUnit p, TypecheckContext arg) {
		return new PatternUnitExpr();
	}

	@Override
	public PatternExpr visit(PatternInt p, TypecheckContext arg) {
		return new PatternIntExpr(p.integer_);
	}
	
	@Override
	public PatternExpr visit(PatternVar p, TypecheckContext arg) {		
		return new PatternVarExpr(p.stellaident_);
	}
	
	@Override
	public PatternExpr visit(PatternVariant p, TypecheckContext arg) {
		String label = p.stellaident_;
		PatternExpr labelPattern = ((SomePatternData) p.patterndata_).pattern_.accept(this, arg);
		
		return new PatternVariantExpr(label, labelPattern);
	}
}
