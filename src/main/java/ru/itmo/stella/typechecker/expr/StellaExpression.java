package ru.itmo.stella.typechecker.expr;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.StellaUnexpectedTypeForExpressionException;
import ru.itmo.stella.typechecker.type.StellaType;

public abstract class StellaExpression {
	public abstract void checkType(ExpressionContext context, StellaType expected) throws StellaException;
	
	public abstract StellaType inferType(ExpressionContext context) throws StellaException;
	
	protected void checkTypesEquality(StellaType expected, StellaType actual) throws StellaException {
		if (expected.getTypeTag() != actual.getTypeTag() || !expected.equals(actual))
			throw new StellaUnexpectedTypeForExpressionException(this, expected, actual);
	}
	
	@Override
	public abstract String toString();
	
//	public static void checkTypesEquality(StellaExpression expr, StellaType expected, StellaType actual) throws StellaException {
//		if (!expected.equals(actual))
//			throw new StellaUnexpectedTypeException(expr, expected, actual);
//	}
	
//	public static void requireType(StellaExpression expr, StellaType type, StellaType.Tag... tags) throws StellaException {
//		boolean[] flags = new boolean[StellaType.Tag.values().length];
//		
//		for (StellaType.Tag tag: tags)
//			flags[tag.ordinal()] = false;
//		
//		requireTypeNot(
//				expr, 
//				type, 
//				Arrays.stream(StellaType.Tag.values())
//					.filter(t -> flags[t.ordinal()])
//					.toArray(StellaType.Tag[]::new)
//			);
//	}
//	
//	public static void requireTypeNot(StellaExpression expr, StellaType type, StellaType.Tag... tags) throws StellaException {
//		StellaType.Tag typeTag = type.getTypeTag();
//		
//		for (StellaType.Tag tag: tags) {
//			if (tag.equals(typeTag)) {
//				switch (tag) {
//					case FUNCTION:
//						throw new StellaUnexpectedLambdaException(type, expr);
//					case LIST:
//						throw new StellaUnexpectedListException(type, expr);
//					default:
//						break;
//				}
//			}
//		}
//	}
}
