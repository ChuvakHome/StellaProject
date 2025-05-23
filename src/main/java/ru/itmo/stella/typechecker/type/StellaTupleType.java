package ru.itmo.stella.typechecker.type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternTupleExpr;
import ru.itmo.stella.typechecker.type.StellaType.StellaComplexType;

public class StellaTupleType extends StellaComplexType {
	private List<StellaType> fieldTypes;
	
	public StellaTupleType(List<StellaType> fieldTypes) {
		super(StellaType.Tag.TUPLE);
		
		this.fieldTypes = Collections.unmodifiableList(fieldTypes);
	}
	
	public int getFieldsCount() {
		return fieldTypes.size();
	}
	
	public List<StellaType> getFieldTypes() {
		return fieldTypes;
	}
	
	public StellaType getFieldType(int i) {
		return fieldTypes.get(i);
	}
	
	private List<? extends PatternExpr> checkPatternsExhaustivenessSingle(Collection<? extends PatternExpr> patterns) throws StellaException {
		Collection<PatternExpr> firstComponentPatterns = patterns.stream()
				.map(p -> ((PatternTupleExpr) p).getPattern(0))
				.toList();

		return fieldTypes.get(0).checkPatternsExhaustivenessForType(firstComponentPatterns).stream()
					.map(p -> new PatternTupleExpr(List.of(p)))
					.toList();
	}
	
	private StellaTupleType subTuple(int... ignoreComponents) {
		Arrays.sort(ignoreComponents);
		List<StellaType> subtupleComponentsType = new ArrayList<>();
		
		for (int i = 0; i < fieldTypes.size(); ++i) {
			if (Arrays.binarySearch(ignoreComponents, i) < 0)
				subtupleComponentsType.add(fieldTypes.get(i));
		}
		
		return new StellaTupleType(subtupleComponentsType);
	}
	
	@Override
	protected List<? extends PatternExpr> checkPatternsExhaustivenessForType(Collection<? extends PatternExpr> patterns) throws StellaException {
		if (fieldTypes.size() == 1)
			return checkPatternsExhaustivenessSingle(patterns);
		
		Map<PatternExpr, List<PatternTupleExpr>> tupleComponentsPatterns = new HashMap<>();
		
		for (PatternExpr pattern: patterns) {
			PatternTupleExpr tuplePattern = (PatternTupleExpr) pattern;
			
			List<PatternExpr> componentsPatterns = tuplePattern.getPatterns();
			PatternExpr firstCompPattern = tuplePattern.getPattern(0);
			
			if (!tupleComponentsPatterns.containsKey(firstCompPattern))
				tupleComponentsPatterns.put(firstCompPattern, new ArrayList<>());
			
			tupleComponentsPatterns.get(firstCompPattern).add(new PatternTupleExpr(
				componentsPatterns.subList(1, componentsPatterns.size())
			));
		}
		
		List<PatternExpr> missingPatterns = new ArrayList<>();
		
		StellaTupleType subTupleType = subTuple(0);
		
		for (Entry<PatternExpr, List<PatternTupleExpr>> tupleComponentEntry: tupleComponentsPatterns.entrySet()) {
			PatternExpr firstCompPattern = tupleComponentEntry.getKey();
			List<PatternTupleExpr> componentsPatterns = tupleComponentEntry.getValue();
			
			missingPatterns.addAll(
				subTupleType.checkPatternsExhaustivenessForType(componentsPatterns).stream()
					.map(p -> {
						List<PatternExpr> subtuplePatterns = new ArrayList<>(fieldTypes.size());
						subtuplePatterns.add(firstCompPattern);
						subtuplePatterns.addAll(((PatternTupleExpr) p).getPatterns());
						
						return new PatternTupleExpr(subtuplePatterns);
					})
					.toList()
			);
		}
		
		missingPatterns.addAll(
			getFieldType(0).checkPatternsExhaustivenessForType(tupleComponentsPatterns.keySet()).stream()
				.map(p -> {
					int fieldsCount = fieldTypes.size();
					List<PatternExpr> missingComponentsPattern = new ArrayList<>(fieldsCount);
					
					missingComponentsPattern.add(p);
					
					for (int i = 1; i < fieldsCount; ++i)
						missingComponentsPattern.add(PatternExpr.STUB_PATTERN);
					
					return new PatternTupleExpr(missingComponentsPattern);
				}).toList()
		);
		
		return missingPatterns;
	}

	@Override
	public boolean equalsType(StellaType type) {
		StellaTupleType tupleType = (StellaTupleType) type;
		
		return tupleType.fieldTypes.equals(fieldTypes);
	}
	
	@Override
	public final boolean isSubtype(StellaType type) { // TODO: write the correct impl!
		if (super.isSubtype(type))
			return true;
		else if (type.getTypeTag() != Tag.TUPLE)
			return false;
		
		StellaTupleType tupleType = (StellaTupleType) type;
		
		if (fieldTypes.size() != tupleType.fieldTypes.size())
			return false;
		
		Iterator<StellaType> iter = fieldTypes.iterator();
		Iterator<StellaType> otherIter = tupleType.fieldTypes.iterator();
		
		while (iter.hasNext() && otherIter.hasNext()) {
			StellaType fieldType = iter.next();
			StellaType otherFieldType = otherIter.next();
			
			if (!fieldType.isSubtype(otherFieldType))
				return false;
		}
		
		return true;
	}
	
	public String toString() {
		return String.format(
					"{%s}", 
					String.join(
						", ", 
						fieldTypes.stream().map(StellaType::toString).toList()
					)
				);
	}
}
