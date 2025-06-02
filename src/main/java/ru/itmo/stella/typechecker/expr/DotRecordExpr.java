package ru.itmo.stella.typechecker.expr;

import java.util.List;
import java.util.Map;

import ru.itmo.stella.typechecker.constraint.StellaConstraint;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.record.StellaNotARecordException;
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
	protected void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypeMatching(context, expected, inferType(context));
	}

	@Override
	protected StellaType doTypeInference(ExpressionContext context) throws StellaException {
		StellaType exprType = recordExpr.inferType(context);
		
		if (exprType.getTypeTag() != StellaType.Tag.RECORD)
			throw new StellaNotARecordException(exprType, recordExpr, this);
		
		StellaRecordType recordType = (StellaRecordType) exprType;
		
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
