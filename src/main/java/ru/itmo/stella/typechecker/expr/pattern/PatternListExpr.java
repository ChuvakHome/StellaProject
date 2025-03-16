package ru.itmo.stella.typechecker.expr.pattern;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

import ru.itmo.stella.typechecker.exception.StellaException;
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
	
	public List<PatternExpr> getPatterns() {
		return patterns;
	}
	
	public PatternExpr getPattern(int i) {
		return patterns.get(i);
	}

	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.LIST)
			throw new StellaUnexpectedPatternForTypeException(this, expected);
		
		StellaListType expectedListType = (StellaListType) expected;
		
		for (PatternExpr pattern: patterns)
			pattern.checkType(context, expectedListType.getElementType());
	}

	@Override
	public ExpressionContext extendContext(ExpressionContext context, StellaType expected) throws StellaException {
		StellaListType expectedListType = (StellaListType) expected;
		
		ExpressionContext subctx = new ExpressionContext(context, new LinkedHashMap<>());
		
		for (PatternExpr pattern: patterns) {
			ExpressionContext emptySubctx = new ExpressionContext(subctx, new LinkedHashMap<>());
			
			ExpressionContext extendedCtx = pattern.extendContext(emptySubctx, expectedListType.getElementType());
	
			for (String varName: extendedCtx.getDeclaredVars()) {
				if (!subctx.hasVarType(varName))
					throw new StellaDuplicatePatternVariableException(varName, this);
			}
			
			subctx.addAll(extendedCtx);
		}
		
		return subctx;
	}

	@Override
	public String toString() {
		return String.format(
					"[%s]",
					String.join(", ", patterns.stream().map(PatternExpr::toString).toList())
				);
	}
}
