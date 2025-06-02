package ru.itmo.stella.typechecker.expr.pattern;

import java.util.ArrayList;
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
import ru.itmo.stella.typechecker.type.StellaTupleType;
import ru.itmo.stella.typechecker.type.StellaType;

public class PatternTupleExpr extends PatternExpr {
	private List<PatternExpr> patterns;
	
	public PatternTupleExpr(List<PatternExpr> patterns) {
		super(Tag.TUPLE);
		
		this.patterns = Collections.unmodifiableList(patterns);
	}
	
	public PatternTupleExpr() {
		this(List.of());
	}
	
	public List<PatternExpr> getPatterns() {
		return patterns;
	}
	
	public PatternExpr getPattern(int i) {
		return patterns.get(i);
	}

	@Override
	public int hashCode() {
		return Objects.hash(Tag.TUPLE, patterns);
	}

	@Override
	public final boolean equalsPattern(PatternExpr p) {
		PatternTupleExpr tuplePattern = (PatternTupleExpr) p;
		
		if (tuplePattern.patterns.size() != patterns.size())
			return false;
			
		Iterator<PatternExpr> iter = patterns.iterator();
		Iterator<PatternExpr> otherListIter = tuplePattern.patterns.iterator();
		
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
		if (expected.getTypeTag() != StellaType.Tag.TUPLE)
			throw new StellaUnexpectedPatternForTypeException(this, expected);
		
		StellaTupleType expectedTupleType = (StellaTupleType) expected;
		
		for (int i = 0; i < patterns.size(); ++i) {
			PatternExpr pattern = patterns.get(i);
			pattern.checkType(context, expectedTupleType.getFieldType(i));
		}
	}
	
	// TODO: Check type inference in master solution!
	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		throw new StellaAmbiguousPatternTypeException(this);
	}

	@Override
	public ExpressionContext extendContext(ExpressionContext context, StellaType expected) throws StellaException {
		StellaTupleType expecteTupleType = (StellaTupleType) expected;
		
		ExpressionContext emptyCtx = new ExpressionContext(context.getTypeVarCounter());
		ExpressionContext subctx = new ExpressionContext(context, new LinkedHashMap<>());
		
		Iterator<PatternExpr> patternIter = patterns.iterator();
		Iterator<StellaType> tupleComponentsIter = expecteTupleType.getFieldTypes().iterator();
		
		while (patternIter.hasNext() && tupleComponentsIter.hasNext()) {
			PatternExpr pattern = patternIter.next();
			StellaType componentType = tupleComponentsIter.next();
			
			ExpressionContext emptySubctx = new ExpressionContext(emptyCtx, new LinkedHashMap<>());
			
			ExpressionContext extendedCtx = pattern.extendContext(emptySubctx, componentType);
	
			for (String varName: extendedCtx.getDeclaredVars()) {
				if (subctx.hasVarType(varName))
					throw new StellaDuplicatePatternVariableException(varName, this);
			}
			
			subctx.addAll(extendedCtx);
		}
		
		return subctx;
	}
	
	@Override
	public PatternTupleExpr getStubPattern() {
		List<PatternExpr> componentsStubPatterns = new ArrayList<>();
		
		for (PatternExpr p: patterns)
			componentsStubPatterns.add(p.getStubPattern());
		
		return new PatternTupleExpr(componentsStubPatterns);
	}

	@Override
	public String toString() {
		return String.format(
					"{ %s }",
					String.join(", ", patterns.stream().map(PatternExpr::toString).toList())
				);
	}
}
