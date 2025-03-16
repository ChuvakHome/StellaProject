package ru.itmo.stella.typechecker.expr.visitor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import ru.itmo.stella.lang.Absyn.ABinding;
import ru.itmo.stella.lang.Absyn.AMatchCase;
import ru.itmo.stella.lang.Absyn.AParamDecl;
import ru.itmo.stella.lang.Absyn.APatternBinding;
import ru.itmo.stella.lang.Absyn.Abstraction;
import ru.itmo.stella.lang.Absyn.Application;
import ru.itmo.stella.lang.Absyn.Binding;
import ru.itmo.stella.lang.Absyn.ConsList;
import ru.itmo.stella.lang.Absyn.ConstFalse;
import ru.itmo.stella.lang.Absyn.ConstInt;
import ru.itmo.stella.lang.Absyn.ConstTrue;
import ru.itmo.stella.lang.Absyn.ConstUnit;
import ru.itmo.stella.lang.Absyn.DotRecord;
import ru.itmo.stella.lang.Absyn.DotTuple;
import ru.itmo.stella.lang.Absyn.Expr;
import ru.itmo.stella.lang.Absyn.Fix;
import ru.itmo.stella.lang.Absyn.Head;
import ru.itmo.stella.lang.Absyn.If;
import ru.itmo.stella.lang.Absyn.Inl;
import ru.itmo.stella.lang.Absyn.Inr;
import ru.itmo.stella.lang.Absyn.IsEmpty;
import ru.itmo.stella.lang.Absyn.IsZero;
import ru.itmo.stella.lang.Absyn.Let;
import ru.itmo.stella.lang.Absyn.Match;
import ru.itmo.stella.lang.Absyn.MatchCase;
import ru.itmo.stella.lang.Absyn.NatRec;
import ru.itmo.stella.lang.Absyn.ParamDecl;
import ru.itmo.stella.lang.Absyn.PatternVar;
import ru.itmo.stella.lang.Absyn.Pred;
import ru.itmo.stella.lang.Absyn.SomeExprData;
import ru.itmo.stella.lang.Absyn.Succ;
import ru.itmo.stella.lang.Absyn.Tail;
import ru.itmo.stella.lang.Absyn.Tuple;
import ru.itmo.stella.lang.Absyn.TypeAsc;
import ru.itmo.stella.lang.Absyn.Var;
import ru.itmo.stella.lang.Absyn.Variant;
import ru.itmo.stella.typechecker.BaseStellaTypechecker.StellaTypeVisitor;
import ru.itmo.stella.typechecker.StellaTypechecker;
import ru.itmo.stella.typechecker.expr.AbstractionExpr;
import ru.itmo.stella.typechecker.expr.ApplicationExpr;
import ru.itmo.stella.typechecker.expr.BoolConstExpr;
import ru.itmo.stella.typechecker.expr.ConsListExpr;
import ru.itmo.stella.typechecker.expr.DotRecordExpr;
import ru.itmo.stella.typechecker.expr.DotTupleExpr;
import ru.itmo.stella.typechecker.expr.FixExpr;
import ru.itmo.stella.typechecker.expr.HeadExpr;
import ru.itmo.stella.typechecker.expr.IfThenStellaExpr;
import ru.itmo.stella.typechecker.expr.InlExpr;
import ru.itmo.stella.typechecker.expr.InrExpr;
import ru.itmo.stella.typechecker.expr.IsEmptyExpr;
import ru.itmo.stella.typechecker.expr.IsZeroExpr;
import ru.itmo.stella.typechecker.expr.LetExpr;
import ru.itmo.stella.typechecker.expr.ListExpr;
import ru.itmo.stella.typechecker.expr.MatchExpr;
import ru.itmo.stella.typechecker.expr.NatConstExpr;
import ru.itmo.stella.typechecker.expr.NatRecExpr;
import ru.itmo.stella.typechecker.expr.PredExpr;
import ru.itmo.stella.typechecker.expr.RecordExpr;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.expr.SuccExpr;
import ru.itmo.stella.typechecker.expr.TailExpr;
import ru.itmo.stella.typechecker.expr.TupleExpr;
import ru.itmo.stella.typechecker.expr.TypeAscExpr;
import ru.itmo.stella.typechecker.expr.UnitConstExpr;
import ru.itmo.stella.typechecker.expr.VarExpr;
import ru.itmo.stella.typechecker.expr.VariantExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.type.StellaType;

public class StellaCoreExprVisitor extends StellaBaseExprVisitor {
	public StellaCoreExprVisitor(StellaTypeVisitor typeVisitor) {
		super(typeVisitor);
	}
	
	@Override
	public StellaExpression visit(If p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression condition = p.expr_1.accept(this, ctx);
		StellaExpression trueExpr = p.expr_2.accept(this, ctx);
		StellaExpression falseExpr = p.expr_3.accept(this, ctx);
		
		return new IfThenStellaExpr(condition, trueExpr, falseExpr);
	}

	@Override
	public StellaExpression visit(Abstraction p, StellaTypechecker.TypecheckContext ctx) {
		Map<String, StellaType> funArgs = new LinkedHashMap<>();
		
		for (ParamDecl paramDecl: p.listparamdecl_) {
			AParamDecl param = (AParamDecl) paramDecl;
			
			funArgs.put(
						param.stellaident_,
						param.type_.accept(typeVisitor, ctx.getExpressionContext())
					);
		}
		
		StellaExpression fnBody = p.expr_.accept(this, ctx);
		
		return new AbstractionExpr(funArgs, fnBody);
	}
	
	@Override
	public StellaExpression visit(Application p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression abstraction = p.expr_.accept(this, ctx);
		
		int exprCount = p.listexpr_.size();
		
		List<StellaExpression> argsList = new ArrayList<>(exprCount);
		
		for (Expr expr: p.listexpr_)
			argsList.add(expr.accept(this, ctx));
		
		return new ApplicationExpr(
				abstraction,
				argsList
			);
	}

	@Override
	public StellaExpression visit(Succ p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression argument = p.expr_.accept(this, ctx);
		
		return new SuccExpr(argument);
	}

	@Override
	public StellaExpression visit(Pred p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression argument = p.expr_.accept(this, ctx);
		
		return new PredExpr(argument);
	}

	@Override
	public StellaExpression visit(IsZero p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression argument = p.expr_.accept(this, ctx);
		
		return new IsZeroExpr(argument);
	}

	@Override
	public StellaExpression visit(NatRec p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression itersCount = p.expr_1.accept(this, ctx);
		StellaExpression initVal = p.expr_2.accept(this, ctx);
		StellaExpression iterFunc = p.expr_3.accept(this, ctx);
		
		return new NatRecExpr(itersCount, initVal, iterFunc);
	}

	@Override
	public StellaExpression visit(ConstTrue p, StellaTypechecker.TypecheckContext ctx) {
		return new BoolConstExpr(true);
	}

	@Override
	public StellaExpression visit(ConstFalse p, StellaTypechecker.TypecheckContext ctx) {
		return new BoolConstExpr(false);
	}

	@Override
	public StellaExpression visit(ConstUnit p, StellaTypechecker.TypecheckContext ctx) {
		return new UnitConstExpr();
	}

	@Override
	public StellaExpression visit(ConstInt p, StellaTypechecker.TypecheckContext ctx) {
		return new NatConstExpr(p.integer_);
	}

	@Override
	public StellaExpression visit(Var p, StellaTypechecker.TypecheckContext ctx) {
		return new VarExpr(p.stellaident_);
	}
	
	@Override
	public StellaExpression visit(TypeAsc p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression expr = p.expr_.accept(this, ctx);
		StellaType type = p.type_.accept(typeVisitor, ctx.getExpressionContext());
		
		return new TypeAscExpr(expr, type);
	}
	
	@Override
	public StellaExpression visit(ru.itmo.stella.lang.Absyn.List p, StellaTypechecker.TypecheckContext ctx) {
		List<StellaExpression> listElements = new ArrayList<>();
		
		for (Expr expr: p.listexpr_)
			listElements.add(expr.accept(this, ctx));
		
		return new ListExpr(listElements);
	}
	
	@Override
	public StellaExpression visit(ConsList p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression head = p.expr_1.accept(this, ctx);
		StellaExpression tail = p.expr_2.accept(this, ctx);
		
		return new ConsListExpr(head, tail);
	}

	@Override
	public StellaExpression visit(Head p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression expr = p.expr_.accept(this, ctx);
		
		return new HeadExpr(expr);
	}

	@Override
	public StellaExpression visit(IsEmpty p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression expr = p.expr_.accept(this, ctx);
		
		return new IsEmptyExpr(expr);
	}

	@Override
	public StellaExpression visit(Tail p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression expr = p.expr_.accept(this, ctx);
		
		return new TailExpr(expr);
	}
	
	@Override
	public StellaExpression visit(Tuple p, StellaTypechecker.TypecheckContext ctx) {
		return new TupleExpr(
					p.listexpr_.stream().map(expr -> expr.accept(this, ctx)).toList()
				);
	}
	
	@Override
	public StellaExpression visit(DotTuple p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression expr = p.expr_.accept(this, ctx);
		int number = p.integer_;
		
		return new DotTupleExpr(expr, number);
	}
	
	@Override
	public StellaExpression visit(ru.itmo.stella.lang.Absyn.Record p, StellaTypechecker.TypecheckContext ctx) {
		Map<String, StellaExpression> fields = new LinkedHashMap<>(p.listbinding_.size());
		
		for (Binding bind: p.listbinding_) {
			ABinding abind = (ABinding) bind;
			
			fields.put(abind.stellaident_, abind.expr_.accept(this, ctx));
		}
		
		return new RecordExpr(fields);
	}
	
	@Override
	public StellaExpression visit(DotRecord p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression expr = p.expr_.accept(this, ctx);
		String field = p.stellaident_;
		
		return new DotRecordExpr(expr, field);
	}
	
	@Override
	public StellaExpression visit(Fix p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression expr = p.expr_.accept(this, ctx);
		
		return new FixExpr(expr);
	}
	
	@Override
	public StellaExpression visit(Inl p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression expr = p.expr_.accept(this, ctx);
		
		return new InlExpr(expr);
	}
	
	@Override
	public StellaExpression visit(Inr p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression expr = p.expr_.accept(this, ctx);
		
		return new InrExpr(expr);
	}
	
	@Override
	public StellaExpression visit(Let p, StellaTypechecker.TypecheckContext ctx) {
		APatternBinding pb = (APatternBinding) p.listpatternbinding_.getFirst();
		
		PatternVar patternVar = (PatternVar) pb.pattern_;
		
		String replaceName = patternVar.stellaident_;
		StellaExpression subexpr = pb.expr_.accept(this, ctx);
		
		StellaExpression expr = p.expr_.accept(this, ctx);
		
		return new LetExpr(replaceName, subexpr, expr);
	}
	
	@Override
	public StellaExpression visit(Match p, StellaTypechecker.TypecheckContext ctx) {
		StellaExpression matchExpr = p.expr_.accept(this, ctx);
		
		List<MatchExpr.MatchCase> matchExprCases = new ArrayList<>();
		
		StellaPatternExprVisitor patternVisitor = new StellaCorePatternExprVisitor(typeVisitor); 
		
		for (MatchCase matchCase: p.listmatchcase_) {
			AMatchCase acase = (AMatchCase) matchCase;
			
			PatternExpr patternExpr = acase.pattern_.accept(patternVisitor, ctx);
			StellaExpression matchCaseExpr = acase.expr_.accept(this, ctx);
			
			matchExprCases.add(new MatchExpr.MatchCase(patternExpr, matchCaseExpr));
		}
		
		return new MatchExpr(matchExpr, matchExprCases);
	}
	
	@Override
	public StellaExpression visit(Variant p, StellaTypechecker.TypecheckContext ctx) {
		String label = p.stellaident_;
		StellaExpression expr = ((SomeExprData) p.exprdata_).expr_.accept(this, ctx);
		
		return new VariantExpr(label, expr);
	}
}
