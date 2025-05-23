package ru.itmo.stella.typechecker.expr;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

import ru.itmo.stella.typechecker.StellaLanguageExtension;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.record.StellaMissingRecordFieldsException;
import ru.itmo.stella.typechecker.exception.record.StellaUnexpectedRecordException;
import ru.itmo.stella.typechecker.exception.record.StellaUnexpectedRecordFieldsException;
import ru.itmo.stella.typechecker.type.StellaRecordType;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaType.Tag;

public class RecordExpr extends StellaExpression {
	private Map<String, StellaExpression> recordFields;
	
	public RecordExpr(Map<String, StellaExpression> recordFields) {
		this.recordFields = Collections.unmodifiableMap(recordFields);
	}
	
	public Map<String, StellaExpression> getRecordFields() {
		return recordFields;
	}
	
	public StellaExpression getField(String fieldName) {
		return recordFields.get(fieldName);
	}
	
	@Override
	public void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected.getTypeTag() != Tag.RECORD)
			throw new StellaUnexpectedRecordException(expected, this);
		
		StellaRecordType expectedRecordType = (StellaRecordType) expected;
		
		List<String> missingFields = findMissingFields(expectedRecordType);
		
		if (!missingFields.isEmpty())
			throw new StellaMissingRecordFieldsException(missingFields, expectedRecordType, this);
		
		List<String> unexpectedFields = findMissingFieldsInRecord(recordFields.keySet(), expectedRecordType);
		
		if (!unexpectedFields.isEmpty() && !context.isExtensionUsed(StellaLanguageExtension.STRUCTUAL_SUBTYPING))
			throw new StellaUnexpectedRecordFieldsException(unexpectedFields, expectedRecordType, this);
			
		for (Entry<String, StellaType> recordFieldEntry: expectedRecordType.getFieldTypes().entrySet()) {
			String fieldName = recordFieldEntry.getKey();
			StellaType expectedFieldType = recordFieldEntry.getValue();
			
			StellaExpression fieldValue = recordFields.get(fieldName);
			
			fieldValue.checkType(context, expectedFieldType);
		}
		
		if (!unexpectedFields.isEmpty()) {
			for (String extraFieldName: unexpectedFields) {
				StellaExpression extraFieldValue = recordFields.get(extraFieldName);
				extraFieldValue.inferType(context);
			}
		}
	}

	@Override
	public StellaRecordType inferType(ExpressionContext context) throws StellaException {
		Map<String, StellaType> fieldsTypes = new LinkedHashMap<>(recordFields.size());
		
		for (Map.Entry<String, StellaExpression> recordEntry: recordFields.entrySet()) {
			String fieldName = recordEntry.getKey();
			StellaExpression fieldValue = recordEntry.getValue();
			
			StellaType fieldType = fieldValue.inferType(context);
			
			fieldsTypes.put(fieldName, fieldType);
		}
		
		return new StellaRecordType(fieldsTypes);
	}

	@Override
	public String toString() {
		return String.format("{%s}",
					String.join(
						", ",
						recordFields
							.entrySet()
							.stream()
							.map(entry -> String.format("%s = %s", entry.getKey(), entry.getValue()))
							.toList()
					)
				);
	}

	private static List<String> findMissingFieldsInRecord(Collection<String> fields, StellaRecordType where) {
		return 
			fields
			.stream()
			.filter(field -> !where.hasField(field))
			.toList();
	}
	
	private List<String> findMissingFields(StellaRecordType where) {
		return where.getFieldTypes().keySet()
				.stream()
				.filter(Predicate.not(recordFields::containsKey))
				.toList();
	}
}
