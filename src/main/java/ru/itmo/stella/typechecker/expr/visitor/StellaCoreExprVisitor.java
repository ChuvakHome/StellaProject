package ru.itmo.stella.typechecker.expr.visitor;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.record.StellaDuplicateRecordFieldsException;
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
	public StellaExpression doVisit(If p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression condition = p.expr_1.accept(this, ctx).get();
		StellaExpression trueExpr = p.expr_2.accept(this, ctx).get();
		StellaExpression falseExpr = p.expr_3.accept(this, ctx).get();
		
		return new IfThenStellaExpr(condition, trueExpr, falseExpr);
	}

	@Override
	public StellaExpression doVisit(Abstraction p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		Map<String, StellaType> funArgs = new LinkedHashMap<>();
		
		for (ParamDecl paramDecl: p.listparamdecl_) {
			AParamDecl param = (AParamDecl) paramDecl;
			
			funArgs.put(
						param.stellaident_,
						param.type_.accept(typeVisitor, ctx.getExpressionContext()).get()
					);
		}
		
		StellaExpression fnBody = p.expr_.accept(this, ctx).get();
		
		return new AbstractionExpr(funArgs, fnBody);
	}
	
	@Override
	public StellaExpression doVisit(Application p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression abstraction = p.expr_.accept(this, ctx).get();
		
		int exprCount = p.listexpr_.size();
		
		List<StellaExpression> argsList = new ArrayList<>(exprCount);
		
		for (Expr expr: p.listexpr_)
			argsList.add(expr.accept(this, ctx).get());
		
		return new ApplicationExpr(
				abstraction,
				argsList
			);
	}

	@Override
	public StellaExpression doVisit(Succ p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression argument = p.expr_.accept(this, ctx).get();
		
		return new SuccExpr(argument);
	}

	@Override
	public StellaExpression doVisit(Pred p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression argument = p.expr_.accept(this, ctx).get();
		
		return new PredExpr(argument);
	}

	@Override
	public StellaExpression doVisit(IsZero p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression argument = p.expr_.accept(this, ctx).get();
		
		return new IsZeroExpr(argument);
	}

	@Override
	public StellaExpression doVisit(NatRec p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression itersCount = p.expr_1.accept(this, ctx).get();
		StellaExpression initVal = p.expr_2.accept(this, ctx).get();
		StellaExpression iterFunc = p.expr_3.accept(this, ctx).get();
		
		return new NatRecExpr(itersCount, initVal, iterFunc);
	}

	@Override
	public StellaExpression doVisit(ConstTrue p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return new BoolConstExpr(true);
	}

	@Override
	public StellaExpression doVisit(ConstFalse p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return new BoolConstExpr(false);
	}

	@Override
	public StellaExpression doVisit(ConstUnit p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return new UnitConstExpr();
	}

	@Override
	public StellaExpression doVisit(ConstInt p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return new NatConstExpr(p.integer_);
	}

	@Override
	public StellaExpression doVisit(Var p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return new VarExpr(p.stellaident_);
	}
	
	@Override
	public StellaExpression doVisit(TypeAsc p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression expr = p.expr_.accept(this, ctx).get();
		StellaType type = p.type_.accept(typeVisitor, ctx.getExpressionContext()).get();
		
		return new TypeAscExpr(expr, type);
	}
	
	@Override
	public StellaExpression doVisit(ru.itmo.stella.lang.Absyn.List p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		List<StellaExpression> listElements = new ArrayList<>();
		
		for (Expr expr: p.listexpr_)
			listElements.add(expr.accept(this, ctx).get());
		
		return new ListExpr(listElements);
	}
	
	@Override
	public StellaExpression doVisit(ConsList p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression head = p.expr_1.accept(this, ctx).get();
		StellaExpression tail = p.expr_2.accept(this, ctx).get();
		
		return new ConsListExpr(head, tail);
	}

	@Override
	public StellaExpression doVisit(Head p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression expr = p.expr_.accept(this, ctx).get();
		
		return new HeadExpr(expr);
	}

	@Override
	public StellaExpression doVisit(IsEmpty p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression expr = p.expr_.accept(this, ctx).get();
		
		return new IsEmptyExpr(expr);
	}

	@Override
	public StellaExpression doVisit(Tail p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression expr = p.expr_.accept(this, ctx).get();
		
		return new TailExpr(expr);
	}
	
	@Override
	public StellaExpression doVisit(Tuple p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		List<StellaExpression> tupleComponents = new ArrayList<>();
		
		for (Expr expr: p.listexpr_)
			tupleComponents.add(expr.accept(this, ctx).get());
		
		return new TupleExpr(tupleComponents);
	}
	
	@Override
	public StellaExpression doVisit(DotTuple p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression expr = p.expr_.accept(this, ctx).get();
		int number = p.integer_;
		
		return new DotTupleExpr(expr, number);
	}
	
	@Override
	public StellaExpression doVisit(ru.itmo.stella.lang.Absyn.Record p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		Map<String, StellaExpression> distinctFields = new LinkedHashMap<>(p.listbinding_.size());
		List<Map.Entry<String, StellaExpression>> fieldsValuesList = new ArrayList<>(p.listbinding_.size());
		
		Set<String> duplicateRecordFields = new LinkedHashSet<>();
		
		for (Binding bind: p.listbinding_) {
			ABinding abind = (ABinding) bind;
			
			String fieldName = abind.stellaident_;
			StellaExpression fieldValue = abind.expr_.accept(this, ctx).get();
			
			if (distinctFields.containsKey(fieldName))
				duplicateRecordFields.add(fieldName);
				
			distinctFields.put(fieldName, fieldValue);
			fieldsValuesList.add(Map.entry(fieldName, fieldValue));
		}
		
		if (duplicateRecordFields.isEmpty())
			return new RecordExpr(distinctFields);
		else {
			String recordStr = String.format(
						"{ %s }",
						String.join(
								", ",
								fieldsValuesList.stream().map(entry -> entry.getKey() + " = " + entry.getValue() ).toList()
							)
					);
			
			throw new StellaDuplicateRecordFieldsException(duplicateRecordFields, recordStr);
		}
	}
	
	@Override
	public StellaExpression doVisit(DotRecord p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression expr = p.expr_.accept(this, ctx).get();
		String field = p.stellaident_;
		
		return new DotRecordExpr(expr, field);
	}
	
	@Override
	public StellaExpression doVisit(Fix p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression expr = p.expr_.accept(this, ctx).get();
		
		return new FixExpr(expr);
	}
	
	@Override
	public StellaExpression doVisit(Inl p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression expr = p.expr_.accept(this, ctx).get();
		
		return new InlExpr(expr);
	}
	
	@Override
	public StellaExpression doVisit(Inr p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression expr = p.expr_.accept(this, ctx).get();
		
		return new InrExpr(expr);
	}
	
	@Override
	public StellaExpression doVisit(Let p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		APatternBinding pb = (APatternBinding) p.listpatternbinding_.getFirst();
		
		PatternVar patternVar = (PatternVar) pb.pattern_;
		
		String replaceName = patternVar.stellaident_;
		StellaExpression subexpr = pb.expr_.accept(this, ctx).get();
		
		StellaExpression expr = p.expr_.accept(this, ctx).get();
		
		return new LetExpr(replaceName, subexpr, expr);
	}
	
	@Override
	public StellaExpression doVisit(Match p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression matchExpr = p.expr_.accept(this, ctx).get();
		
		List<MatchExpr.MatchCase> matchExprCases = new ArrayList<>();
		
		StellaPatternExprVisitor patternVisitor = new StellaCorePatternExprVisitor(typeVisitor); 
		
		for (MatchCase matchCase: p.listmatchcase_) {
			AMatchCase acase = (AMatchCase) matchCase;
			
			PatternExpr patternExpr = acase.pattern_.accept(patternVisitor, ctx);
			StellaExpression matchCaseExpr = acase.expr_.accept(this, ctx).get();
			
			matchExprCases.add(new MatchExpr.MatchCase(patternExpr, matchCaseExpr));
		}
		
		return new MatchExpr(matchExpr, matchExprCases);
	}
	
	@Override
	public StellaExpression doVisit(Variant p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		String label = p.stellaident_;
		StellaExpression expr = ((SomeExprData) p.exprdata_).expr_.accept(this, ctx).get();
		
		return new VariantExpr(label, expr);
	}
}
