package ru.itmo.stella.typechecker.type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Predicate;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternVariantExpr;
import ru.itmo.stella.typechecker.type.StellaType.StellaComplexType;

public class StellaVariantType extends StellaComplexType {
	private Map<String, StellaType> variantLabelsTypes;
	
	public StellaVariantType(Map<String, StellaType> labelsTypes) {
		super(StellaType.Tag.VARIANT);
		
		this.variantLabelsTypes = Collections.unmodifiableMap(labelsTypes);
	}
	
	public int getLabelsCount() {
		return variantLabelsTypes.size();
	}
	
	public Map<String, StellaType> getLabelsTypes() {
		return variantLabelsTypes;
	}
	
	public Set<String> getLabels() {
		return variantLabelsTypes.keySet();
	}
	
	public boolean hasLabel(String labelName) {
		return variantLabelsTypes.containsKey(labelName);
	}
	
	public StellaType getLabelType(String labelName) {
		return variantLabelsTypes.get(labelName );
	}
	
	@Override
	public StellaType replaceType(StellaType replace, StellaType replacement) {
		for (Map.Entry<String, StellaType> labelEntry: variantLabelsTypes.entrySet()) {
			StellaType argType = labelEntry.getValue();
			
			labelEntry.setValue(
				argType.replaceType(replace, replacement)
			);
		}
		
		return this;
	}
	
	@Override
	protected List<? extends PatternExpr> checkPatternsExhaustivenessForType(Collection<? extends PatternExpr> patterns) throws StellaException {
		Map<String, List<PatternExpr>> fieldsPatterns = new LinkedHashMap<>();
		
		for (String label: getLabels())
			fieldsPatterns.put(label, new ArrayList<>());
		
		for (PatternExpr pattern: patterns) {
			switch (pattern.getPatternTag()) {
				case VAR:
					return Collections.emptyList();
				case VARIANT:
					PatternVariantExpr variantPattern = (PatternVariantExpr) pattern;
					
					String label = variantPattern.getLabelName();
					
					fieldsPatterns.get(label).add(variantPattern.getLabelPattern());
					break;
				default:
					break;
			}
		}
		
		List<PatternExpr> missingPatterns = new ArrayList<>();
		
		for (String label: getLabels()) {
			List<PatternExpr> labelPatterns = fieldsPatterns.get(label);
			
			if (labelPatterns.isEmpty())
				missingPatterns.add(new PatternVariantExpr(label, PatternExpr.STUB_PATTERN));
			else
				missingPatterns.addAll(
						getLabelType(label).checkPatternsExhaustiveness(labelPatterns)
								.stream()
								.map(p -> new PatternVariantExpr(label, p))
								.toList()
						);
		}
		
		return missingPatterns;
	}

	@Override
	public boolean equalsType(StellaType type) {
		StellaVariantType variantType = (StellaVariantType) type;
		
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
		return variantType.variantLabelsTypes.equals(variantLabelsTypes);
	}
	
	@Override
	public final boolean isSubtype(StellaType type) { // TODO: write the correct impl!
		if (super.isSubtype(type))
			return true;
		else if (type.getTypeTag() != Tag.VARIANT)
			return false;
		
		StellaVariantType variantType = (StellaVariantType) type;
		
		List<String> unexpectedLabels = getLabels().stream()
				.filter(Predicate.not(variantType::hasLabel))
				.toList();
		
		if (!unexpectedLabels.isEmpty())
			return false;
			
		for (Entry<String, StellaType> fieldEntry: getLabelsTypes().entrySet()) {
			String fieldLabel = fieldEntry.getKey();
			StellaType actualFieldType = fieldEntry.getValue();
			
			StellaType expectedFieldType = variantType.getLabelType(fieldLabel);
			
			if (!actualFieldType.isSubtype(expectedFieldType))
				return false;
		}
		
		return true;
	}
	
	public String toString() {
		return String.format(
					"<| %s |>", 
					String.join(
						", ", 
						variantLabelsTypes
							.entrySet()
							.stream()
							.map(entry -> 
									entry.getValue() == StellaType.NO_TYPE
									? entry.getKey()
									: String.format("%s : %s", entry.getKey(), entry.getValue())
								)
							.toList()
					)
				);
	}
}
