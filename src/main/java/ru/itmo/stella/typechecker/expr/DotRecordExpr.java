package ru.itmo.stella.typechecker.expr;

import java.util.List;
import java.util.Map;

import ru.itmo.stella.typechecker.StellaLanguageExtension;
import ru.itmo.stella.typechecker.constraint.StellaConstraint;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.function.StellaNotAFunctionException;
import ru.itmo.stella.typechecker.exception.record.StellaUnexpectedFieldAccessException;
import ru.itmo.stella.typechecker.type.StellaRecordType;
import ru.itmo.stella.typechecker.type.StellaType;

public class DotRecordExpr extends StellaExpression {
	private StellaExpression recordExpr;
	private String fieldName;
	
	public DotRecordExpr(StellaExpression recordExpr, String fieldName) {
		this.recordExpr = recordExpr;
		this.fieldName = fieldName;
	}
	
	@Override
	protected void doTypeCheckConstrainted(ExpressionContext context, StellaType expected) throws StellaException {
		StellaType recordExprType = recordExpr.inferType(context);
		
		StellaType fieldType = getCachedType(context);
		StellaRecordType requiredRecordType = new StellaRecordType(Map.of(fieldName, fieldType));
		
		context.addConstraints(
					List.of(
						new StellaConstraint(recordExprType, requiredRecordType, recordExpr),
						new StellaConstraint(fieldType, expected, this)
					)
				);
	}
	
	@Override
	protected void doTypeCheckSimple(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypeMatching(context, expected, inferType(context));
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		StellaType exprType = recordExpr.inferType(context);
		
		if (exprType.getTypeTag() != StellaType.Tag.RECORD) {
			if (exprType.getTypeTag() != StellaType.Tag.TYPE_VAR || !context.isExtensionUsed(StellaLanguageExtension.TYPE_RECONSTRUCTION))
				throw new StellaNotAFunctionException(exprType, recordExpr, this);
			
			return doTypeInferenceConstrainted(context);
		}
		
		return doTypeInference(context);
	}
	
	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		StellaRecordType recordType = (StellaRecordType) recordExpr.inferType(context);
		
		if (!recordType.hasField(fieldName))
			throw new StellaUnexpectedFieldAccessException(fieldName, recordType, recordExpr);
		
		return recordType.getFieldType(fieldName);
	}
	
	@Override
	protected StellaType doTypeInferenceConstrainted(ExpressionContext context) throws StellaException {
		StellaType recordExprType = recordExpr.inferType(context);
		
		StellaType fieldType = getCachedType(context);
		StellaRecordType requiredRecordType = new StellaRecordType(Map.of(fieldName, fieldType));
		
		context.addConstraint(
					new StellaConstraint(recordExprType, requiredRecordType, recordExpr)
				);
		
		return fieldType;
	}

	@Override
	public String toString() {
		return String.format("%s.%s", recordExpr, fieldName);
	}
}
