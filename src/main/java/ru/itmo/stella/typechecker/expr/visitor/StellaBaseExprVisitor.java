package ru.itmo.stella.typechecker.expr.visitor;

import ru.itmo.stella.lang.Absyn.Abstraction;
import ru.itmo.stella.lang.Absyn.Add;
import ru.itmo.stella.lang.Absyn.Application;
import ru.itmo.stella.lang.Absyn.Assign;
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
import ru.itmo.stella.lang.Absyn.Equal;
import ru.itmo.stella.lang.Absyn.Fix;
import ru.itmo.stella.lang.Absyn.Fold;
import ru.itmo.stella.lang.Absyn.GreaterThan;
import ru.itmo.stella.lang.Absyn.GreaterThanOrEqual;
import ru.itmo.stella.lang.Absyn.Head;
import ru.itmo.stella.lang.Absyn.If;
import ru.itmo.stella.lang.Absyn.Inl;
import ru.itmo.stella.lang.Absyn.Inr;
import ru.itmo.stella.lang.Absyn.IsEmpty;
import ru.itmo.stella.lang.Absyn.IsZero;
import ru.itmo.stella.lang.Absyn.LessThan;
import ru.itmo.stella.lang.Absyn.LessThanOrEqual;
import ru.itmo.stella.lang.Absyn.Let;
import ru.itmo.stella.lang.Absyn.LetRec;
import ru.itmo.stella.lang.Absyn.List;
import ru.itmo.stella.lang.Absyn.LogicAnd;
import ru.itmo.stella.lang.Absyn.LogicNot;
import ru.itmo.stella.lang.Absyn.LogicOr;
import ru.itmo.stella.lang.Absyn.Match;
import ru.itmo.stella.lang.Absyn.Multiply;
import ru.itmo.stella.lang.Absyn.NatRec;
import ru.itmo.stella.lang.Absyn.NotEqual;
import ru.itmo.stella.lang.Absyn.Panic;
import ru.itmo.stella.lang.Absyn.Pred;
import ru.itmo.stella.lang.Absyn.Record;
import ru.itmo.stella.lang.Absyn.Ref;
import ru.itmo.stella.lang.Absyn.Sequence;
import ru.itmo.stella.lang.Absyn.Subtract;
import ru.itmo.stella.lang.Absyn.Succ;
import ru.itmo.stella.lang.Absyn.Tail;
import ru.itmo.stella.lang.Absyn.Throw;
import ru.itmo.stella.lang.Absyn.TryCastAs;
import ru.itmo.stella.lang.Absyn.TryCatch;
import ru.itmo.stella.lang.Absyn.TryWith;
import ru.itmo.stella.lang.Absyn.Tuple;
import ru.itmo.stella.lang.Absyn.TypeAbstraction;
import ru.itmo.stella.lang.Absyn.TypeApplication;
import ru.itmo.stella.lang.Absyn.TypeAsc;
import ru.itmo.stella.lang.Absyn.TypeCast;
import ru.itmo.stella.lang.Absyn.Unfold;
import ru.itmo.stella.lang.Absyn.Var;
import ru.itmo.stella.lang.Absyn.Variant;
import ru.itmo.stella.typechecker.StellaTypechecker;
import ru.itmo.stella.typechecker.BaseStellaTypechecker.StellaTypeVisitor;
import ru.itmo.stella.typechecker.expr.StellaExpression;

public class StellaBaseExprVisitor implements StellaExprVisitor {
	protected StellaTypeVisitor typeVisitor;
	
	public StellaBaseExprVisitor(StellaTypeVisitor typeVisitor) {
		this.typeVisitor = typeVisitor;
	}
	
	@Override
	public StellaExpression visit(Sequence p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Assign p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(If p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Let p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(LetRec p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(TypeAbstraction p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(LessThan p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(LessThanOrEqual p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(GreaterThan p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(GreaterThanOrEqual p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Equal p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(NotEqual p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(TypeAsc p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(TypeCast p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Abstraction p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Variant p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Match p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(List p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Add p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Subtract p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(LogicOr p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Multiply p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Divide p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(LogicAnd p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Ref p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Deref p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Application p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(TypeApplication p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(DotRecord p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(DotTuple p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Tuple p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Record p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(ConsList p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Head p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(IsEmpty p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Tail p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Panic p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Throw p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(TryCatch p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(TryWith p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(TryCastAs p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Inl p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Inr p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Succ p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(LogicNot p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Pred p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(IsZero p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Fix p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(NatRec p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Fold p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Unfold p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(ConstTrue p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(ConstFalse p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(ConstUnit p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(ConstInt p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(ConstMemory p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaExpression visit(Var p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}
}
