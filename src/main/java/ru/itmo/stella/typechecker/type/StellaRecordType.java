package ru.itmo.stella.typechecker.type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternRecordExpr;
import ru.itmo.stella.typechecker.type.StellaType.StellaComplexType;

public class StellaRecordType extends StellaComplexType {
	private Map<String, StellaType> fieldsTypes;
	
	public StellaRecordType(Map<String, StellaType> fieldTypes) {
		super(StellaType.Tag.RECORD);
		
//		this.fieldsTypes = Collections.unmodifiableMap(fieldTypes);
		this.fieldsTypes = new LinkedHashMap<>(fieldTypes);
	}
	
	public int getFieldsCount() {
		return fieldsTypes.size();
	}
	
	public Map<String, StellaType> getFieldTypes() {
		return fieldsTypes;
	}
	
	public Set<String> getFields() {
		return fieldsTypes.keySet();
	}
	
	public boolean hasField(String fieldName) {
		return fieldsTypes.containsKey(fieldName);
	}
	
	public StellaType getFieldType(String fieldName) {
		return fieldsTypes.get(fieldName);
	}
	
	@Override
	public StellaType replaceType(StellaType replace, StellaType replacement) {
		for (Map.Entry<String, StellaType> fieldEntry: fieldsTypes.entrySet()) {
			StellaType fieldType = fieldEntry.getValue();
			
			fieldEntry.setValue(
				fieldType.replaceType(replace, replacement)
			);
		}
		
		return this;
	}
	
	private List<? extends PatternExpr> checkPatternsExhaustivenessSingle(Collection<? extends PatternExpr> patterns) throws StellaException {
		Entry<String, StellaType> onlyFieldEntry = fieldsTypes.entrySet().iterator().next();
		
		String fieldName = onlyFieldEntry.getKey();
		
		Collection<PatternExpr> firstComponentPatterns = patterns.stream()
				.map(p -> ((PatternRecordExpr) p).getPattern(fieldName))
				.toList();

		StellaType fieldType = onlyFieldEntry.getValue();
		return fieldType.checkPatternsExhaustivenessForType(firstComponentPatterns).stream()
					.map(p -> new PatternRecordExpr(Map.of(fieldName, p)))
					.toList();
	}
	
	private StellaRecordType subRecord(String... ignoreFields) {
		Arrays.sort(ignoreFields);
		Map<String, StellaType> subrecordFieldsTypes = new HashMap<>();
		
		for (Entry<String, StellaType> fieldEntry: fieldsTypes.entrySet()) {
			if (Arrays.binarySearch(ignoreFields, fieldEntry.getKey()) < 0)
				subrecordFieldsTypes.put(fieldEntry.getKey(), fieldEntry.getValue());
		}
		
		return new StellaRecordType(subrecordFieldsTypes);
	}
	
	private static Map<String, PatternExpr> excludeRecordFieldsPatterns(Map<String, PatternExpr> patterns, String... ignoreFields) {
		Arrays.sort(ignoreFields);
		
		Map<String, PatternExpr> reducedFieldsPatterns = new HashMap<>();
		
		for (Entry<String, PatternExpr> recordFieldEntry: patterns.entrySet()) {
			String recordFieldName = recordFieldEntry.getKey();
			
			if (Arrays.binarySearch(ignoreFields, recordFieldName) < 0)
				reducedFieldsPatterns.put(recordFieldName, recordFieldEntry.getValue());
		}
		
		return reducedFieldsPatterns;
	}
	
	@Override
	protected List<? extends PatternExpr> checkPatternsExhaustivenessForType(Collection<? extends PatternExpr> patterns) throws StellaException {
		if (fieldsTypes.isEmpty())
			return Collections.emptyList();
		else if (fieldsTypes.size() == 1)
			return checkPatternsExhaustivenessSingle(patterns);
		
		String someFieldName = fieldsTypes.keySet().iterator().next();
		
		Map<PatternExpr, List<PatternRecordExpr>> recordFieldsPatterns = new HashMap<>();
		
		for (PatternExpr pattern: patterns) {
			PatternRecordExpr recordPattern = (PatternRecordExpr) pattern;
			
			PatternExpr someFieldPattern = recordPattern.getPattern(someFieldName);
			
			if (!recordFieldsPatterns.containsKey(someFieldPattern))
				recordFieldsPatterns.put(someFieldPattern, new ArrayList<>());
			
			recordFieldsPatterns.get(someFieldPattern).add(
				new PatternRecordExpr(excludeRecordFieldsPatterns(recordPattern.getPatterns(), someFieldName))
			);
		}
		
		List<PatternExpr> missingPatterns = new ArrayList<>();
		
		StellaRecordType subRecordType = subRecord(someFieldName);  
		
		for (Entry<PatternExpr, List<PatternRecordExpr>> recordFieldsEntry: recordFieldsPatterns.entrySet()) {
			PatternExpr someFieldPattern = recordFieldsEntry.getKey();
			List<PatternRecordExpr> reducedRecordPatterns = recordFieldsEntry.getValue();
			
			missingPatterns.addAll(
				subRecordType.checkPatternsExhaustivenessForType(reducedRecordPatterns).stream()
					.map(p -> {
						Map<String, PatternExpr> subRecordFieldsPatterns = new HashMap<>(fieldsTypes.size());
						subRecordFieldsPatterns.put(someFieldName, someFieldPattern);
						subRecordFieldsPatterns.putAll(((PatternRecordExpr) p).getPatterns());
						
						return new PatternRecordExpr(subRecordFieldsPatterns);
					}).toList()
			);
		}
		
		missingPatterns.addAll(
			getFieldType(someFieldName).checkPatternsExhaustivenessForType(recordFieldsPatterns.keySet()).stream()
				.map(p -> {
					Map<String, PatternExpr> missingRecordFieldsPatterns = new HashMap<>();
					
					for (String fieldName: fieldsTypes.keySet()) {
						if (fieldName.equals(someFieldName))
							missingRecordFieldsPatterns.put(someFieldName, p);
						else
							missingRecordFieldsPatterns.put(fieldName, PatternExpr.STUB_PATTERN);
					}
					
					return new PatternRecordExpr(missingRecordFieldsPatterns);
				}).toList()
		);
		
		return missingPatterns;
	}

	@Override
	public boolean equalsType(StellaType type) {
		StellaRecordType recordType = (StellaRecordType) type;
		
//		for (String key: fieldsTypes.keySet()) {
//			if (!recordType.hasField(key))
//				throw 
//		}
		
//		Iterator<String> iter1 = fieldsTypes.keySet().iterator();
//		Iterator<String> iter2 = recordType.fieldsTypes.keySet().iterator();
//		
//		
//		
//		while (iter1.hasNext() && iter2.hasNext()) {
//			String key1 = iter1.next();
//			
//			if (key)
//			
//			String key2 = iter1.next();
//		}
//		
		return recordType.fieldsTypes.equals(fieldsTypes);
	}
	
	@Override
	public final boolean isSubtype(StellaType type) { // TODO: write the correct impl!
		if (super.isSubtype(type))
			return true;
		else if (type.getTypeTag() != Tag.RECORD)
			return false;
		
		StellaRecordType recordType = (StellaRecordType) type;
		
		for (Entry<String, StellaType> entry: recordType.fieldsTypes.entrySet()) {
			String fieldName = entry.getKey();
			StellaType fieldType = entry.getValue();
			
			if (!hasField(fieldName) || !getFieldType(fieldName).isSubtype(fieldType))
				return false;
		}
		
		return true;
	}
	
	public String toString() {
		return String.format(
					"{%s}", 
					String.join(
						", ", 
						fieldsTypes
							.entrySet()
							.stream()
							.map(entry -> String.format("%s : %s", entry.getKey(), entry.getValue()))
							.toList()
					)
				);
	}
}
