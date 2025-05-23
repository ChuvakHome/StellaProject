package ru.itmo.stella.typechecker.expr.pattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.pattern.StellaAmbiguousPatternTypeException;
import ru.itmo.stella.typechecker.exception.pattern.StellaDuplicatePatternVariableException;
import ru.itmo.stella.typechecker.exception.pattern.StellaUnexpectedPatternForTypeException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.type.StellaListType;
import ru.itmo.stella.typechecker.type.StellaType;

public class PatternListExpr extends PatternExpr {
	private List<PatternExpr> patterns;
	
	public PatternListExpr(List<PatternExpr> patterns) {
		super(Tag.LIST);
		
		this.patterns = Collections.unmodifiableList(patterns);
	}
	
	public PatternListExpr(PatternExpr... patterns) {
		this(Arrays.asList(patterns));
	}
	
	public PatternListExpr() {
		this(List.of());
	}
	
	public List<PatternExpr> getPatterns() {
		return patterns;
	}
	
	public PatternExpr getPattern(int i) {
		return patterns.get(i);
	}
	
	@Override
	public final int hashCode() {
		return Objects.hash(Tag.LIST, patterns);
	}
	
	@Override
	public final boolean equalsPattern(PatternExpr p) {
		PatternListExpr listPattern = (PatternListExpr) p;
		
		if (listPattern.patterns.size() != patterns.size())
			return false;
			
		Iterator<PatternExpr> iter = patterns.iterator();
		Iterator<PatternExpr> otherListIter = listPattern.patterns.iterator();
		
		while (iter.hasNext() && otherListIter.hasNext()) {
			PatternExpr pattern = iter.next();
			PatternExpr otherPattern = otherListIter.next();
			
			if (!otherPattern.equals(pattern))
				return false;
		}
		
		return true; 
	}

	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.LIST)
			throw new StellaUnexpectedPatternForTypeException(this, expected);
		
		StellaListType expectedListType = (StellaListType) expected;
		
		for (PatternExpr pattern: patterns)
			pattern.checkType(context, expectedListType.getElementType());
	}
	
	//  TODO: Check type inference in master solution!
	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		throw new StellaAmbiguousPatternTypeException(this);
	}

	@Override
	public ExpressionContext extendContext(ExpressionContext context, StellaType expected) throws StellaException {
		StellaListType expectedListType = (StellaListType) expected;
		
		ExpressionContext emptyCtx = new ExpressionContext();
		ExpressionContext subctx = new ExpressionContext(context, new LinkedHashMap<>());
		
		for (PatternExpr pattern: patterns) {
			ExpressionContext emptySubctx = new ExpressionContext(emptyCtx, new LinkedHashMap<>());
			
			ExpressionContext extendedCtx = pattern.extendContext(emptySubctx, expectedListType.getElementType());
	
			for (String varName: extendedCtx.getDeclaredVars()) {
				if (subctx.hasVarType(varName))
					throw new StellaDuplicatePatternVariableException(varName, this);
			}
			
			subctx.addAll(extendedCtx);
		}
		
		return subctx;
	}
	
	// TODO: Review the impl
	@Override
	public PatternListExpr getStubPattern() {
		return new PatternListExpr(patterns.stream().map(p -> p.getStubPattern()).toList());
	}

	@Override
	public String toString() {
		return String.format(
					"[%s]",
					String.join(", ", patterns.stream().map(PatternExpr::toString).toList())
				);
	}
}
