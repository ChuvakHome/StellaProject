package ru.itmo.stella.typechecker.type;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import ru.itmo.stella.typechecker.type.StellaType.StellaComplexType;

public class StellaRecordType extends StellaComplexType {
	private Map<String, StellaType> fieldsTypes;
	
	public StellaRecordType(Map<String, StellaType> fieldTypes) {
		super(StellaType.Tag.RECORD);
		
		this.fieldsTypes = Collections.unmodifiableMap(fieldTypes);
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
