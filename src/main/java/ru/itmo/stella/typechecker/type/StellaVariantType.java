package ru.itmo.stella.typechecker.type;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

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
	
	public String toString() {
		return String.format(
					"<| %s |>", 
					String.join(
						", ", 
						variantLabelsTypes
							.entrySet()
							.stream()
							.map(entry -> String.format("%s : %s", entry.getKey(), entry.getValue()))
							.toList()
					)
				);
	}
}
