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
import ru.itmo.stella.lang.Absyn.Add;
import ru.itmo.stella.lang.Absyn.Application;
import ru.itmo.stella.lang.Absyn.Assign;
import ru.itmo.stella.lang.Absyn.Binding;
import ru.itmo.stella.lang.Absyn.ConsList;
import ru.itmo.stella.lang.Absyn.ConstFalse;
import ru.itmo.stella.lang.Absyn.ConstInt;
import ru.itmo.stella.lang.Absyn.ConstMemory;
import ru.itmo.stella.lang.Absyn.ConstTrue;
import ru.itmo.stella.lang.Absyn.ConstUnit;
import ru.itmo.stella.lang.Absyn.Deref;
import ru.itmo.stella.lang.Absyn.Divide;
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
import ru.itmo.stella.lang.Absyn.LetRec;
import ru.itmo.stella.lang.Absyn.LogicAnd;
import ru.itmo.stella.lang.Absyn.LogicNot;
import ru.itmo.stella.lang.Absyn.LogicOr;
import ru.itmo.stella.lang.Absyn.Match;
import ru.itmo.stella.lang.Absyn.MatchCase;
import ru.itmo.stella.lang.Absyn.Multiply;
import ru.itmo.stella.lang.Absyn.NatRec;
import ru.itmo.stella.lang.Absyn.Panic;
import ru.itmo.stella.lang.Absyn.ParamDecl;
import ru.itmo.stella.lang.Absyn.PatternBinding;
import ru.itmo.stella.lang.Absyn.Pred;
import ru.itmo.stella.lang.Absyn.Ref;
import ru.itmo.stella.lang.Absyn.Sequence;
import ru.itmo.stella.lang.Absyn.SomeExprData;
import ru.itmo.stella.lang.Absyn.Subtract;
import ru.itmo.stella.lang.Absyn.Succ;
import ru.itmo.stella.lang.Absyn.Tail;
import ru.itmo.stella.lang.Absyn.Throw;
import ru.itmo.stella.lang.Absyn.TryCastAs;
import ru.itmo.stella.lang.Absyn.TryCatch;
import ru.itmo.stella.lang.Absyn.TryWith;
import ru.itmo.stella.lang.Absyn.Tuple;
import ru.itmo.stella.lang.Absyn.Type;
import ru.itmo.stella.lang.Absyn.TypeAbstraction;
import ru.itmo.stella.lang.Absyn.TypeApplication;
import ru.itmo.stella.lang.Absyn.TypeAsc;
import ru.itmo.stella.lang.Absyn.TypeCast;
import ru.itmo.stella.lang.Absyn.Var;
import ru.itmo.stella.lang.Absyn.Variant;
import ru.itmo.stella.typechecker.BaseStellaTypechecker.StellaTypeVisitor;
import ru.itmo.stella.typechecker.StellaTypechecker;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.record.StellaDuplicateRecordFieldsException;
import ru.itmo.stella.typechecker.expr.AbstractionExpr;
import ru.itmo.stella.typechecker.expr.AddExpr;
import ru.itmo.stella.typechecker.expr.ApplicationExpr;
import ru.itmo.stella.typechecker.expr.AssignExpr;
import ru.itmo.stella.typechecker.expr.BoolConstExpr;
import ru.itmo.stella.typechecker.expr.CastAsExpr;
import ru.itmo.stella.typechecker.expr.ConsListExpr;
import ru.itmo.stella.typechecker.expr.ConstMemoryExpr;
import ru.itmo.stella.typechecker.expr.DerefExpr;
import ru.itmo.stella.typechecker.expr.DivExpr;
import ru.itmo.stella.typechecker.expr.DotRecordExpr;
import ru.itmo.stella.typechecker.expr.DotTupleExpr;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.expr.FixExpr;
import ru.itmo.stella.typechecker.expr.HeadExpr;
import ru.itmo.stella.typechecker.expr.IfThenStellaExpr;
import ru.itmo.stella.typechecker.expr.InlExpr;
import ru.itmo.stella.typechecker.expr.InrExpr;
import ru.itmo.stella.typechecker.expr.IsEmptyExpr;
import ru.itmo.stella.typechecker.expr.IsZeroExpr;
import ru.itmo.stella.typechecker.expr.LetExpr;
import ru.itmo.stella.typechecker.expr.LetRecExpr;
import ru.itmo.stella.typechecker.expr.ListExpr;
import ru.itmo.stella.typechecker.expr.LogicAndExpr;
import ru.itmo.stella.typechecker.expr.LogicNotExpr;
import ru.itmo.stella.typechecker.expr.LogicOrExpr;
import ru.itmo.stella.typechecker.expr.MatchExpr;
import ru.itmo.stella.typechecker.expr.MultExpr;
import ru.itmo.stella.typechecker.expr.NatConstExpr;
import ru.itmo.stella.typechecker.expr.NatRecExpr;
import ru.itmo.stella.typechecker.expr.PanicExpr;
import ru.itmo.stella.typechecker.expr.PredExpr;
import ru.itmo.stella.typechecker.expr.RecordExpr;
import ru.itmo.stella.typechecker.expr.RefExpr;
import ru.itmo.stella.typechecker.expr.SequenceExpr;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.expr.SubtractExpr;
import ru.itmo.stella.typechecker.expr.SuccExpr;
import ru.itmo.stella.typechecker.expr.TailExpr;
import ru.itmo.stella.typechecker.expr.ThrowExpr;
import ru.itmo.stella.typechecker.expr.TryCastAsExpr;
import ru.itmo.stella.typechecker.expr.TryCatchExpr;
import ru.itmo.stella.typechecker.expr.TryWithExpr;
import ru.itmo.stella.typechecker.expr.TupleExpr;
import ru.itmo.stella.typechecker.expr.TypeAbstractionExpr;
import ru.itmo.stella.typechecker.expr.TypeApplicationExpr;
import ru.itmo.stella.typechecker.expr.TypeAscExpr;
import ru.itmo.stella.typechecker.expr.UnitConstExpr;
import ru.itmo.stella.typechecker.expr.VarExpr;
import ru.itmo.stella.typechecker.expr.VariantExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternMatchCase;
import ru.itmo.stella.typechecker.expr.pattern.visitor.StellaCorePatternExprVisitor;
import ru.itmo.stella.typechecker.expr.pattern.visitor.StellaPatternExprVisitor;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaTypeVar;

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
	public StellaExpression doVisit(TypeCast p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression castExpr = p.expr_.accept(this, ctx).get();
		StellaType castType = p.type_.accept(typeVisitor, ctx.getExpressionContext()).get();
		
		return new CastAsExpr(castExpr, castType);
	}
	
	@Override
	public StellaExpression doVisit(ru.itmo.stella.lang.Absyn.List p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		List<StellaExpression> listElements = new ArrayList<>();
		
		for (Expr expr: p.listexpr_)
			listElements.add(expr.accept(this, ctx).get());
		
		return new ListExpr(listElements);
	}
	
	@Override
	public StellaExpression doVisit(Add p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression left = p.expr_1.accept(this, ctx).get();
		StellaExpression right = p.expr_2.accept(this, ctx).get();
		
		return new AddExpr(left, right);
	}
	
	@Override
	public StellaExpression doVisit(Subtract p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression left = p.expr_1.accept(this, ctx).get();
		StellaExpression right = p.expr_2.accept(this, ctx).get();
		
		return new SubtractExpr(left, right);
	}
	
	@Override
	public StellaExpression doVisit(Multiply p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression left = p.expr_1.accept(this, ctx).get();
		StellaExpression right = p.expr_2.accept(this, ctx).get();
		
		return new MultExpr(left, right);
	}
	
	@Override
	public StellaExpression doVisit(Divide p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression left = p.expr_1.accept(this, ctx).get();
		StellaExpression right = p.expr_2.accept(this, ctx).get();
		
		return new DivExpr(left, right);
	}
	
	@Override
	public StellaExpression doVisit(LogicOr p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression left = p.expr_1.accept(this, ctx).get();
		StellaExpression right = p.expr_2.accept(this, ctx).get();
		
		return new LogicOrExpr(left, right);
	}
	
	@Override
	public StellaExpression doVisit(LogicAnd p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression left = p.expr_1.accept(this, ctx).get();
		StellaExpression right = p.expr_2.accept(this, ctx).get();
		
		return new LogicAndExpr(left, right);
	}
	
	@Override
	public StellaExpression doVisit(LogicNot p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression arg = p.expr_.accept(this, ctx).get();
		
		return new LogicNotExpr(arg);
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
	public StellaExpression doVisit(TypeApplication p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		List<StellaType> typesList = new ArrayList<>();
		
		for (Type type: p.listtype_) {
			StellaType stellaType = type.accept(typeVisitor, ctx.getExpressionContext()).get();
			
			typesList.add(stellaType);
		}
		
		StellaExpression expr = p.expr_.accept(this, ctx).get();
		
		return new TypeApplicationExpr(typesList, expr);
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
		StellaCorePatternExprVisitor patternVisitor = new StellaCorePatternExprVisitor(typeVisitor);
		
		List<PatternMatchCase> cases = new ArrayList<>();
		
		for (PatternBinding patternBinding: p.listpatternbinding_) {
			APatternBinding pb = (APatternBinding) patternBinding;
			
			PatternExpr pattern = pb.pattern_.accept(patternVisitor, ctx).get();
			StellaExpression expr = pb.expr_.accept(this, ctx).get();
			
			cases.add(new PatternMatchCase(pattern, expr));
		}
		
		StellaExpression expr = p.expr_.accept(this, ctx).get();
		
		return new LetExpr(cases, expr);
	}
	
	@Override
	public StellaExpression doVisit(LetRec p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaCorePatternExprVisitor patternVisitor = new StellaCorePatternExprVisitor(typeVisitor);
		
		List<PatternMatchCase> cases = new ArrayList<>();
		
		for (PatternBinding patternBinding: p.listpatternbinding_) {
			APatternBinding pb = (APatternBinding) patternBinding;
			
			PatternExpr pattern = pb.pattern_.accept(patternVisitor, ctx).get();
			StellaExpression expr = pb.expr_.accept(this, ctx).get();
			
			cases.add(new PatternMatchCase(pattern, expr));
		}
		
		StellaExpression expr = p.expr_.accept(this, ctx).get();
		
		return new LetRecExpr(cases, expr);
	}
	
	@Override
	public StellaExpression doVisit(TypeAbstraction p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		List<StellaTypeVar> typeVariables = p.liststellaident_.stream().map(StellaTypeVar::new).toList();
		
		ExpressionContext subctx = new ExpressionContext(ctx.getExpressionContext());
		typeVariables.forEach(subctx::addTypeVariable);
		
		List<StellaException> subErrorsList = new ArrayList<>();
		StellaTypechecker.TypecheckContext subTypecheckContext = new StellaTypechecker.TypecheckContext(subErrorsList, subctx);
		
		StellaExpression expr = p.expr_.accept(this, subTypecheckContext).get();
		
		subErrorsList.forEach(ctx::addTypecheckError);
		
		return new TypeAbstractionExpr(typeVariables, expr);
	}
	
	@Override
	public StellaExpression doVisit(Match p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression matchExpr = p.expr_.accept(this, ctx).get();
		
		List<PatternMatchCase> matchExprCases = new ArrayList<>();
		
		StellaPatternExprVisitor patternVisitor = new StellaCorePatternExprVisitor(typeVisitor); 
		
		for (MatchCase matchCase: p.listmatchcase_) {
			AMatchCase acase = (AMatchCase) matchCase;
			
			PatternExpr patternExpr = acase.pattern_.accept(patternVisitor, ctx).get();
			StellaExpression matchCaseExpr = acase.expr_.accept(this, ctx).get();
			
			matchExprCases.add(new PatternMatchCase(patternExpr, matchCaseExpr));
		}
		
		return new MatchExpr(matchExpr, matchExprCases);
	}
	
	@Override
	public StellaExpression doVisit(Variant p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		String label = p.stellaident_;
				
		StellaExpression expr = null;
		
		if (p.exprdata_ instanceof SomeExprData someExpr)
			expr = someExpr.expr_.accept(this, ctx).get();
			
		return new VariantExpr(label, expr);
	}
	
	@Override
	public StellaExpression doVisit(ConstMemory p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return new ConstMemoryExpr(p.memoryaddress_);
	}
	
	@Override
	public StellaExpression doVisit(Ref p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression expr = p.expr_.accept(this, ctx).get();
		
		return new RefExpr(expr);
	}
	
	@Override
	public StellaExpression doVisit(Deref p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression expr = p.expr_.accept(this, ctx).get();
		
		return new DerefExpr(expr);
	}
	
	@Override
	public StellaExpression doVisit(Assign p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression lhs = p.expr_1.accept(this, ctx).get();
		StellaExpression rhs = p.expr_2.accept(this, ctx).get();
		
		return new AssignExpr(lhs, rhs);
	}
	
	@Override
	public StellaExpression doVisit(Sequence p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression expr1 = p.expr_1.accept(this, ctx).get();
		StellaExpression expr2 = p.expr_2.accept(this, ctx).get();
		
		return new SequenceExpr(expr1, expr2);
	}
	
	@Override
	public StellaExpression doVisit(Panic p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return new PanicExpr();
	}
	
	@Override
	public StellaExpression doVisit(Throw p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression expr = p.expr_.accept(this, ctx).get();
		
		return new ThrowExpr(expr);
	}
	
	@Override
	public StellaExpression doVisit(TryWith p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression tryExpr = p.expr_1.accept(this, ctx).get();
		StellaExpression withExpr = p.expr_2.accept(this, ctx).get();
		
		return new TryWithExpr(tryExpr, withExpr);
	}
	
	@Override
	public StellaExpression doVisit(TryCatch p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression tryExpr = p.expr_1.accept(this, ctx).get();
		
		StellaPatternExprVisitor patternVisitor = new StellaCorePatternExprVisitor(typeVisitor);
		
		PatternExpr patternExpr = p.pattern_.accept(patternVisitor, ctx).get();
		StellaExpression withExpr = p.expr_2.accept(this, ctx).get();
		
		return new TryCatchExpr(tryExpr, new PatternMatchCase(patternExpr, withExpr));
	}
	
	@Override
	public StellaExpression doVisit(TryCastAs p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		StellaExpression castExpr = p.expr_1.accept(this, ctx).get();
		StellaType castType = p.type_.accept(typeVisitor, ctx.getExpressionContext()).get();
		
		StellaCorePatternExprVisitor patternVisitor = new StellaCorePatternExprVisitor(typeVisitor);
		PatternExpr tryPattern = p.pattern_.accept(patternVisitor, ctx).get();
		StellaExpression patternExpr = p.expr_2.accept(this, ctx).get();
		
		StellaExpression withExpr = p.expr_3.accept(this, ctx).get();
		
		return new TryCastAsExpr(castExpr, castType, tryPattern, patternExpr, withExpr);
	}
}
