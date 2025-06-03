package ru.itmo.stella.typechecker.expr.pattern;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import ru.itmo.stella.typechecker.constraint.StellaConstraint;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.pattern.StellaAmbiguousPatternTypeException;
import ru.itmo.stella.typechecker.exception.pattern.StellaDuplicatePatternVariableException;
import ru.itmo.stella.typechecker.exception.pattern.StellaUnexpectedPatternForTypeException;
import ru.itmo.stella.typechecker.expr.ExpressionContext;
import ru.itmo.stella.typechecker.type.StellaRecordType;
import ru.itmo.stella.typechecker.type.StellaType;

public class PatternRecordExpr extends PatternExpr {
	private Map<String, PatternExpr> patterns;
	
	public PatternRecordExpr(Map<String, PatternExpr> patterns) {
		super(Tag.RECORD);
		
		this.patterns = Collections.unmodifiableMap(patterns);
	}
	
	public PatternRecordExpr() {
		this(Map.of());
	}
	
	public Map<String, PatternExpr> getPatterns() {
		return patterns;
	}
	
	public Collection<String> getFieldNames() {
		return patterns.keySet();
	}
	
	public PatternExpr getPattern(String fieldName) {
		return patterns.get(fieldName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(Tag.RECORD, patterns);
	}

	@Override
	public final boolean equalsPattern(PatternExpr p) {
		PatternRecordExpr recordPattern = (PatternRecordExpr) p;
		
		if (recordPattern.patterns.size() != patterns.size())
			return false;
			
		Iterator<Entry<String, PatternExpr>> iter = patterns.entrySet().iterator();
		Iterator<Entry<String, PatternExpr>> otherListIter = recordPattern.patterns.entrySet().iterator();
		
		while (iter.hasNext() && otherListIter.hasNext()) {
			Entry<String, PatternExpr> patternEntry = iter.next();
			String fieldName = patternEntry.getKey();
			PatternExpr fieldPattern = patternEntry.getValue();
			
			Entry<String, PatternExpr> otherPatternEntry = otherListIter.next();
			String otherFieldName = otherPatternEntry.getKey();
			PatternExpr otherFieldPattern = otherPatternEntry.getValue();
			
			if (!otherFieldName.equals(fieldName) || !otherFieldPattern.equals(fieldPattern))
				return false;
		}
		
		return true; 
	}

	@Override
	public void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != StellaType.Tag.RECORD)
			throw new StellaUnexpectedPatternForTypeException(this, expected);
		
		StellaRecordType expectedRecordType = (StellaRecordType) expected;
		
		for (Entry<String, StellaType> recordFieldEntry: expectedRecordType.getFieldTypes().entrySet()) {
			String recordFieldName = recordFieldEntry.getKey();
			PatternExpr pattern = patterns.get(recordFieldName);
			
			StellaType recordFieldType = recordFieldEntry.getValue();
			pattern.checkType(context, recordFieldType);
		}
	}
	
	// TODO: Check type inference in master solution!
	@Override
	public StellaType doTypeInference(ExpressionContext context) throws StellaException {
		throw new StellaAmbiguousPatternTypeException(this);
	}

	@Override
	public ExpressionContext extendContext(ExpressionContext context, StellaType expected) throws StellaException {
		StellaRecordType expectedRecordType;
		
		if (expected.getTypeTag() == StellaType.Tag.TYPE_VAR) {
			Map<String, StellaType> recordComponents = new HashMap<>();
			
			for (Map.Entry<String, PatternExpr> patternEntry: patterns.entrySet()) {
				String fieldName = patternEntry.getKey();
				PatternExpr fieldPattern = patternEntry.getValue();
				
				StellaType fieldType = fieldPattern.inferType(context);
				
				recordComponents.put(fieldName, fieldType);
			}
			
			expectedRecordType = new StellaRecordType(recordComponents);
			
			context.addConstraint(
						new StellaConstraint(expected, expectedRecordType, this)
					);
		} else if (expected.getTypeTag() == StellaType.Tag.RECORD)
			expectedRecordType = (StellaRecordType) expected;
		else
			throw new StellaUnexpectedPatternForTypeException(this, expected);
		
		ExpressionContext emptyCtx = new ExpressionContext(context.getTypeVarCounter());
		ExpressionContext subctx = new ExpressionContext(context, new LinkedHashMap<>());
		
		for (Entry<String, StellaType> recordFieldEntry: expectedRecordType.getFieldTypes().entrySet()) {
			String recordFieldName = recordFieldEntry.getKey();
			PatternExpr pattern = patterns.get(recordFieldName);
			
			StellaType recordFieldType = recordFieldEntry.getValue();
			pattern.checkType(context, recordFieldType);
			
			ExpressionContext emptySubctx = new ExpressionContext(emptyCtx, new LinkedHashMap<>());
			
			ExpressionContext extendedCtx = pattern.extendContext(emptySubctx, recordFieldType);
			
			for (String varName: extendedCtx.getDeclaredVars()) {
				if (subctx.hasVarType(varName))
					throw new StellaDuplicatePatternVariableException(varName, this);
			}
			
			subctx.addAll(extendedCtx);
		}
		
		return subctx;
	}
	
	@Override
	public PatternRecordExpr getStubPattern() {
		Map<String, PatternExpr> fieldsStubPatterns = new LinkedHashMap<>();
		
		patterns.forEach((label, pattern) -> {
			fieldsStubPatterns.put(label, pattern.getStubPattern());
		});
		
		return new PatternRecordExpr(fieldsStubPatterns);
	}

	@Override
	public String toString() {
		return String.format(
					"{ %s }",
					String.join(", ", patterns.entrySet().stream().map(e -> e.getKey() + " = " + e.getValue()).toList())
				);
	}
}
