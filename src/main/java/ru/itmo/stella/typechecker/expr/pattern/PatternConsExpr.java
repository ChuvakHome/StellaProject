package ru.itmo.stella.typechecker.expr.pattern;

import java.util.LinkedHashMap;
import java.util.Objects;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.pattern.StellaAmbiguousPatternTypeException;
import ru.itmo.stella.typechecker.exception.pattern.StellaDuplicatePatternVariableException;
import ru.itmo.stella.typechecker.exception.pattern.StellaUnexpectedPatternForTypeException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.type.StellaListType;
import ru.itmo.stella.typechecker.type.StellaType;

public class PatternConsExpr extends PatternExpr {
	private PatternExpr headPattern;
	private PatternExpr tailPattern;
	
	public PatternConsExpr(PatternExpr headPattern, PatternExpr tailPattern) {
		super(Tag.CONS);
		
		this.headPattern = headPattern;
		this.tailPattern = tailPattern;
	}
	
	public PatternExpr getHeadPattern() {
		return headPattern;
	}
	
	public PatternExpr getTailPattern() {
		return tailPattern;
	}
	
	@Override
	public final int hashCode() {
		return Objects.hash(Tag.CONS, headPattern, tailPattern);
	}
	
	public boolean equalsPattern(PatternExpr p) {
		PatternConsExpr consPattern = (PatternConsExpr) p;
		
		return consPattern.headPattern.equals(headPattern) && consPattern.tailPattern.equals(tailPattern); 
	}
	
	@Override
	public void doTypeCheck(ExpressionContext ctx, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.LIST)
			throw new StellaUnexpectedPatternForTypeException(this, expected);
		
		StellaListType expectedListType = (StellaListType) expected;
		
		headPattern.checkType(ctx, expectedListType.getElementType());
		tailPattern.checkType(ctx, expectedListType);
	}
	
	private void extendContext0(ExpressionContext subctx, PatternExpr pattern, StellaType expected) throws StellaException {
		ExpressionContext emptyCtx = new ExpressionContext(subctx.getTypeVarCounter());
		ExpressionContext emptySubctx = new ExpressionContext(emptyCtx, new LinkedHashMap<>());
		
		ExpressionContext extendedCtx = pattern.extendContext(emptySubctx, expected);

		for (String varName: extendedCtx.getDeclaredVars()) {
			if (emptyCtx.hasVarType(varName))
				throw new StellaDuplicatePatternVariableException(varName, this);
		}
		
		subctx.addAll(extendedCtx);
	}
	
	// TODO: Check type inference in master solution!
	@Override
	public StellaType doTypeInference(ExpressionContext context) throws StellaException {
		throw new StellaAmbiguousPatternTypeException(this);
	}
	
	@Override
	public StellaType doTypeInferenceConstrainted(ExpressionContext ctx) throws StellaException {
		StellaType headType = headPattern.inferType(ctx);
		
		StellaListType listType = new StellaListType(headType);
		
		tailPattern.checkType(ctx, listType);
		
		return listType;
	}

	@Override
	public ExpressionContext extendContext(ExpressionContext ctx, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.LIST)
			throw new StellaUnexpectedPatternForTypeException(this, expected);
		
		StellaListType expectedListType = (StellaListType) expected;
		
		ExpressionContext subctx = new ExpressionContext(ctx, new LinkedHashMap<>());
		
		extendContext0(subctx, headPattern, expectedListType.getElementType());
		extendContext0(subctx, tailPattern, expectedListType);
		
		return subctx;
	}
	
	@Override
	public PatternConsExpr getStubPattern() {
		return new PatternConsExpr(headPattern.getStubPattern(), tailPattern.getStubPattern());
	}

	@Override
	public String toString() {
		return String.format(
					"cons(%s, %s)",
					headPattern, tailPattern
				);
	}
}
