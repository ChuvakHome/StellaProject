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
import ru.itmo.stella.typechecker.BaseStellaTypechecker.StellaTypeVisitor;
import ru.itmo.stella.typechecker.StellaTypechecker;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.util.StellaOptional;

public class StellaBaseExprVisitor implements StellaExprVisitor {
	protected StellaTypeVisitor typeVisitor;
	
	public StellaBaseExprVisitor(StellaTypeVisitor typeVisitor) {
		this.typeVisitor = typeVisitor;
	}
	
	@Override
	public StellaOptional<StellaExpression> visit(Sequence p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Sequence p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Assign p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Assign p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(If p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(If p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Let p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Let p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(LetRec p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(LetRec p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(TypeAbstraction p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(TypeAbstraction p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(LessThan p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(LessThan p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(LessThanOrEqual p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(LessThanOrEqual p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(GreaterThan p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(GreaterThan p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(GreaterThanOrEqual p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(GreaterThanOrEqual p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Equal p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Equal p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(NotEqual p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(NotEqual p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(TypeAsc p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(TypeAsc p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(TypeCast p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(TypeCast p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Abstraction p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Abstraction p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Variant p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Variant p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Match p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Match p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(List p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(List p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Add p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Add p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Subtract p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Subtract p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(LogicOr p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(LogicOr p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Multiply p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Multiply p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Divide p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Divide p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(LogicAnd p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(LogicAnd p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Ref p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Ref p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Deref p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Deref p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Application p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Application p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(TypeApplication p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(TypeApplication p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(DotRecord p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(DotRecord p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(DotTuple p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(DotTuple p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Tuple p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Tuple p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Record p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Record p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(ConsList p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(ConsList p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Head p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Head p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(IsEmpty p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(IsEmpty p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Tail p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Tail p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Panic p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Panic p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Throw p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Throw p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(TryCatch p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(TryCatch p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(TryWith p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(TryWith p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(TryCastAs p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(TryCastAs p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Inl p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Inl p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Inr p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Inr p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Succ p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Succ p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(LogicNot p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(LogicNot p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Pred p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Pred p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(IsZero p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(IsZero p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Fix p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Fix p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(NatRec p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(NatRec p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Fold p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Unfold p, StellaTypechecker.TypecheckContext ctx) {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(ConstTrue p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(ConstTrue p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(ConstFalse p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(ConstFalse p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(ConstUnit p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(ConstUnit p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(ConstInt p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(ConstInt p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(ConstMemory p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(ConstMemory p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}

	@Override
	public StellaOptional<StellaExpression> visit(Var p, StellaTypechecker.TypecheckContext ctx) {
		try {
			return StellaOptional.of(doVisit(p, ctx));
		} catch (StellaException e) {
			return StellaOptional.of(StellaExpression.class, e);
		}
	}
	
	protected StellaExpression doVisit(Var p, StellaTypechecker.TypecheckContext ctx) throws StellaException {
		return null;
	}
}
