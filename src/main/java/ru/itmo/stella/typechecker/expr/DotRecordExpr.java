package ru.itmo.stella.typechecker.expr;

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
	public void doTypeCheck(ExpressionContext context, StellaType expected) throws StellaException {
		checkTypeMatching(context, expected, inferType(context));
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		StellaType exprType = recordExpr.inferType(context);
		
		if (exprType.getTypeTag() != StellaType.Tag.RECORD)
			throw new StellaNotARecordException(exprType, recordExpr, this);
		
		StellaRecordType recordType = (StellaRecordType) exprType;
		
		if (!recordType.hasField(fieldName))
			throw new StellaUnexpectedFieldAccessException(fieldName, recordType, recordExpr);
		
		return recordType.getFieldType(fieldName);
	}

	@Override
	public String toString() {
		return String.format("%s.%s", recordExpr, fieldName);
	}
}
