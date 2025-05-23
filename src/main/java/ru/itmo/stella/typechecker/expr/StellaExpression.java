package ru.itmo.stella.typechecker.expr;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Predicate;

import ru.itmo.stella.typechecker.StellaLanguageExtension;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.StellaUnexpectedSubtypeException;
import ru.itmo.stella.typechecker.exception.StellaUnexpectedTypeForExpressionException;
import ru.itmo.stella.typechecker.exception.function.StellaIncorrectNumberOfArgumentsException;
import ru.itmo.stella.typechecker.exception.record.StellaMissingRecordFieldsException;
import ru.itmo.stella.typechecker.exception.tuple.StellaUnexpectedTupleLengthException;
import ru.itmo.stella.typechecker.exception.variant.StellaUnexpectedVariantLabelException;
import ru.itmo.stella.typechecker.type.StellaFunctionType;
import ru.itmo.stella.typechecker.type.StellaListType;
import ru.itmo.stella.typechecker.type.StellaRecordType;
import ru.itmo.stella.typechecker.type.StellaRefType;
import ru.itmo.stella.typechecker.type.StellaSumType;
import ru.itmo.stella.typechecker.type.StellaTupleType;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaVariantType;

public abstract class StellaExpression {
	protected abstract void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException;
	
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		if (expected == StellaType.TOP)
			checkTypeMatching(context, expected, inferType(context));
		else
			doTypeCheck(context, expected);
	}
	
	public abstract StellaType inferType(ExpressionContext context) throws StellaException;
	
	protected void checkTypeMatching(ExpressionContext ctx, StellaType expected, StellaType actual) throws StellaException {
//		if (ctx.isExtensionUsed(StellaLanguageExtension.STRUCTUAL_SUBTYPING)) {
//			if (!actual.isSubtype(expected))
//				throw new StellaUnexpectedSubtypeException(this, expected, actual);
//		} else if (!actual.equals(expected))
//			throw new StellaUnexpectedTypeForExpressionException(this, expected, actual);
		
		if (!actual.equals(expected)) {
			if (expected.getTypeTag() != actual.getTypeTag()) {
				checkTypesSimple(ctx, expected, actual);
			} else {
				switch (expected.getTypeTag()) {
					case REF:
						checkTypesEqualitySpecialized(ctx, (StellaRefType) expected, (StellaRefType) actual);
						break;
					case LIST:
						checkTypesEqualitySpecialized(ctx, (StellaListType) expected, (StellaListType) actual);
						break;
					case TUPLE:
						checkTypesEqualitySpecialized(ctx, (StellaTupleType) expected, (StellaTupleType) actual);
						break;
					case RECORD:
						checkTypesEqualitySpecialized(ctx, (StellaRecordType) expected, (StellaRecordType) actual);
						break;
					case SUM:
						checkTypesEqualitySpecialized(ctx, (StellaSumType) expected, (StellaSumType) actual);
						break;
					case VARIANT:
						checkTypesEqualitySpecialized(ctx, (StellaVariantType) expected, (StellaVariantType) actual);
						break;
					case FUNCTION:
						checkTypesEqualitySpecialized(ctx, (StellaFunctionType) expected, (StellaFunctionType) actual);
						break;
					default:
						checkTypesSimple(ctx, expected, actual);
				}
			}
		}
	}
	
	private void checkTypesSimple(ExpressionContext ctx, StellaType expected, StellaType actual) throws StellaException {
		if (ctx.isExtensionUsed(StellaLanguageExtension.STRUCTUAL_SUBTYPING)) {
			if (!actual.isSubtype(expected))
				throw new StellaUnexpectedSubtypeException(this, expected, actual);
		} else if (!actual.equals(expected))
			throw new StellaUnexpectedTypeForExpressionException(this, expected, actual);
	}
	
	private void checkTypesEqualitySpecialized(ExpressionContext ctx, StellaRefType expected, StellaRefType actual) throws StellaException {
		checkTypeMatching(ctx, expected.getReferencedType(), actual.getReferencedType());
		checkTypeMatching(ctx, actual.getReferencedType(), expected.getReferencedType());
	}
	
	private void checkTypesEqualitySpecialized(ExpressionContext ctx, StellaListType expected, StellaListType actual) throws StellaException {
		checkTypeMatching(ctx, expected.getElementType(), actual.getElementType());
	}
	
	private void checkTypesEqualitySpecialized(ExpressionContext ctx, StellaTupleType expected, StellaTupleType actual) throws StellaException {		
		if (expected.getFieldsCount() != actual.getFieldsCount())
			throw new StellaUnexpectedTupleLengthException(expected, actual, this);
		
		Iterator<StellaType> iter = actual.getFieldTypes().iterator();
		Iterator<StellaType> otherIter = expected.getFieldTypes().iterator();
		
		while (iter.hasNext() && otherIter.hasNext()) {
			StellaType actualFieldType = iter.next();
			StellaType expectedFieldType = otherIter.next();
			
			checkTypeMatching(ctx, expectedFieldType, actualFieldType);
		}
	}
	
	private void checkTypesEqualitySpecialized(ExpressionContext ctx, StellaRecordType expected, StellaRecordType actual) throws StellaException {
		List<String> missingFields = expected.getFields()
				.stream()
				.filter(Predicate.not(actual::hasField))
				.toList();
		
		if (missingFields.isEmpty()) {
			for (Entry<String, StellaType> fieldEntry: expected.getFieldTypes().entrySet()) {
				String fieldName = fieldEntry.getKey();
				StellaType expectedFieldType = fieldEntry.getValue();
				
				checkTypeMatching(ctx, expectedFieldType, actual.getFieldType(fieldName));
			}
		} else {
			if (ctx.isExtensionUsed(StellaLanguageExtension.STRUCTUAL_SUBTYPING))
				throw new StellaMissingRecordFieldsException(missingFields, expected, actual, this);
			else
				throw new StellaUnexpectedTypeForExpressionException(this, expected, actual);
		}
	}
	
	private void checkTypesEqualitySpecialized(ExpressionContext ctx, StellaSumType expected, StellaSumType actual) throws StellaException {
		checkTypeMatching(ctx, expected.getLeftType(), actual.getLeftType());
		checkTypeMatching(ctx, expected.getRightType(), actual.getRightType());
	}
	
	private void checkTypesEqualitySpecialized(ExpressionContext ctx, StellaVariantType expected, StellaVariantType actual) throws StellaException {
		List<String> unexpectedLabels = actual.getLabels()
				.stream()
				.filter(Predicate.not(expected::hasLabel))
				.toList();
		
		if (unexpectedLabels.isEmpty()) {			
			for (Entry<String, StellaType> fieldEntry: actual.getLabelsTypes().entrySet()) {
				String fieldLabel = fieldEntry.getKey();
				StellaType actualFieldType = fieldEntry.getValue();
				
				StellaType expectedFieldType = expected.getLabelType(fieldLabel);
				
				checkTypeMatching(ctx, expectedFieldType, actualFieldType);
			}
		} else {
			if (ctx.isExtensionUsed(StellaLanguageExtension.STRUCTUAL_SUBTYPING))
				throw new StellaUnexpectedVariantLabelException(unexpectedLabels, expected, actual, this);
			else
				throw new StellaUnexpectedTypeForExpressionException(this, expected, actual);
		}
	}
	
	private void checkTypesEqualitySpecialized(ExpressionContext ctx, StellaFunctionType expected, StellaFunctionType actual) throws StellaException {
		if (expected.getArity() != actual.getArity()) {
			if (ctx.isExtensionUsed(StellaLanguageExtension.STRUCTUAL_SUBTYPING))
				throw new StellaIncorrectNumberOfArgumentsException(expected, actual, this);
			else
				throw new StellaUnexpectedTypeForExpressionException(this, expected, actual);
		}
		
		Iterator<StellaType> it1 = expected.getArgumensTypesList().iterator();
		Iterator<StellaType> it2 = actual.getArgumensTypesList().iterator();
	
		while (it1.hasNext() && it2.hasNext()) {
			StellaType expectedargType = it1.next();
			StellaType actualArgType = it2.next();
			
			checkTypeMatching(ctx, expectedargType, actualArgType);
		}
		
		checkTypeMatching(ctx, expected.getReturnType(), actual.getReturnType());
	}
	
	@Override
	public abstract String toString();
}
