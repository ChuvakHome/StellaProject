package ru.itmo.stella.typechecker.util;

import java.util.HashSet;
import java.util.Set;

import ru.itmo.stella.typechecker.type.StellaFunctionType;
import ru.itmo.stella.typechecker.type.StellaListType;
import ru.itmo.stella.typechecker.type.StellaRecordType;
import ru.itmo.stella.typechecker.type.StellaSumType;
import ru.itmo.stella.typechecker.type.StellaTupleType;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaTypeVar;

public class TypeVarUtils {
	public static Set<StellaTypeVar> collectVarTypes(StellaType type) {
		switch (type.getTypeTag()) {
			case FUNCTION: {
				StellaFunctionType fnType = (StellaFunctionType) type; 
				
				Set<StellaTypeVar> deps = new HashSet<>();
				
				fnType.getArgumensTypes().values().forEach(arg -> 
					deps.addAll(collectVarTypes(arg))
				);
				
				deps.addAll(
					collectVarTypes(fnType.getReturnType())
				);
				
				return deps;
			} case LIST: {
				StellaListType listType = (StellaListType) type;
				
				return collectVarTypes(listType.getElementType());
			} case SUM: {
				StellaSumType sumType = (StellaSumType) type;
				
				Set<StellaTypeVar> deps = new HashSet<>();
				
				deps.addAll(
					collectVarTypes(sumType.getLeftType())
				);
				
				deps.addAll(
					collectVarTypes(sumType.getRightType())
				);
				
				return deps;
			} case TUPLE: {
				StellaTupleType tupleType = (StellaTupleType) type;
				
				Set<StellaTypeVar> deps = new HashSet<>();
				
				tupleType.getFieldTypes().forEach(fieldType -> {
					deps.addAll(
						collectVarTypes(fieldType)
					);
				});
				
				return deps;
			} case RECORD: {
				StellaRecordType recordType = (StellaRecordType) type; 
				
				Set<StellaTypeVar> deps = new HashSet<>();
				
				recordType.getFieldTypes().values().forEach(fieldType -> {
				deps.addAll(
						collectVarTypes(fieldType)
					);
				});
				
				return deps;
			} case TYPE_VAR: {
				return Set.of((StellaTypeVar) type);
			} default:
				return Set.of();
		}
	}
}
