package ru.itmo.stella.typechecker.expr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.match.StellaIllegalEmptryMatchingException;
import ru.itmo.stella.typechecker.exception.match.StellaNonExhaustiveMatchPatternsException;
import ru.itmo.stella.typechecker.expr.pattern.PatternBoolExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr.Tag;
import ru.itmo.stella.typechecker.expr.pattern.PatternInlExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternInrExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternIntExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternSuccExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternUnitExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternVarExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternVariantExpr;
import ru.itmo.stella.typechecker.type.StellaBoolType;
import ru.itmo.stella.typechecker.type.StellaNatType;
import ru.itmo.stella.typechecker.type.StellaSumType;
import ru.itmo.stella.typechecker.type.StellaType;
import ru.itmo.stella.typechecker.type.StellaUnitType;
import ru.itmo.stella.typechecker.type.StellaVariantType;

public class MatchExpr extends StellaExpression {
	private StellaExpression matchExpr;
	private List<MatchCase> matchCases;
	
	public MatchExpr(StellaExpression matchExpression, List<MatchCase> matchCases) {
		this.matchExpr = matchExpression;
		this.matchCases = Collections.unmodifiableList(matchCases);
	}

	@Override
	public void checkType(ExpressionContext context, StellaType expected) throws StellaException {
		if (matchCases.isEmpty())
			throw new StellaIllegalEmptryMatchingException(this);
		
		StellaType matchExprType = matchExpr.inferType(context);
		
		for (MatchCase matchCase: matchCases) {
			matchCase.pattern.checkType(context, matchExprType);
			
			ExpressionContext subctx = matchCase.pattern.extendContext(context, matchExprType);
			
			matchCase.expr.checkType(subctx, expected);
		}
		
		List<PatternExpr> missingPatterns = checkPatternsExhaustiveness(matchExprType, matchCases.stream().map(MatchCase::getPattern).toList());
		
		if (!missingPatterns.isEmpty())
			throw new StellaNonExhaustiveMatchPatternsException(
					matchExpr,
					missingPatterns
				);
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		if (matchCases.isEmpty())
			throw new StellaIllegalEmptryMatchingException(this);
		
		StellaType matchExprType = matchExpr.inferType(context);
		
		StellaType patternExprType = null;
		
		for (MatchCase matchCase: matchCases) {
			matchCase.pattern.checkType(context, matchExprType);
			
			ExpressionContext subctx = matchCase.pattern.extendContext(context, matchExprType);
			
			if (patternExprType == null)
				patternExprType = matchCase.expr.inferType(subctx);
			else
				matchCase.expr.checkType(subctx, patternExprType);
		}
		
		return patternExprType;
	}

	@Override
	public String toString() {
		return String.format(
					"match %s\n{%s\n}",
					matchExpr,
					String.join("\n|", matchCases.stream().map(MatchCase::toString).toList())
				);
	}
	
	public static class MatchCase {
		private final PatternExpr pattern;
		private final StellaExpression expr;
		
		public MatchCase(PatternExpr pattern, StellaExpression expression) {
			this.pattern = pattern;
			this.expr = expression;
		}
		
		public PatternExpr getPattern() {
			return pattern;
		}
		
		public StellaExpression getExpression() {
			return expr;
		}
		
		@Override
		public String toString() {
			return String.format("%s => %s", pattern, expr);
		}
	}
	
	private static List<PatternExpr> checkPatternsExhaustiveness(StellaType type, List<PatternExpr> patterns) throws StellaException {
		if (patterns.stream().anyMatch(p -> p.getPatternTag() == Tag.VAR))
			return Collections.emptyList();
		
		switch (type.getTypeTag()) {
			case PRIMITIVE:
				if (type == StellaType.Primitives.NAT)
					return checkPatternsExhaustiveness(StellaType.Primitives.NAT, patterns);
				else if (type == StellaType.Primitives.BOOL)
					return checkPatternsExhaustiveness(StellaType.Primitives.BOOL, patterns);
				else if (type == StellaType.Primitives.UNIT)
					return checkPatternsExhaustiveness(StellaType.Primitives.UNIT, patterns);
			case SUM:
				return checkPatternsExhaustiveness((StellaSumType) type, patterns);
			case VARIANT:
				return checkPatternsExhaustiveness((StellaVariantType) type, patterns);
			default:
				break;
		}
		
		return Collections.emptyList();
	}
	
	private static List<PatternExpr> checkPatternsExhaustiveness(StellaUnitType type, List<PatternExpr> patterns) throws StellaException {
		return patterns.stream().anyMatch(p -> p.getPatternTag() == Tag.UNIT) 
				? Collections.emptyList()
				: Arrays.asList(new PatternUnitExpr());
	}
	
	private static List<PatternExpr> checkPatternsExhaustiveness(StellaNatType type, List<PatternExpr> patterns) throws StellaException {
		boolean zeroPattern = false;
		List<PatternExpr> succPatterns = new ArrayList<>();
		
		for (PatternExpr pattern: patterns) {
			switch (pattern.getPatternTag()) {
				case INT:
					zeroPattern = zeroPattern || ((PatternIntExpr) pattern).getIntPattern() == 0; 
					break;
				case SUCC:
					PatternSuccExpr succPattern = (PatternSuccExpr) pattern;
					succPatterns.add(succPattern.getSuccPattern());
					break;
				case VAR:
					return Collections.emptyList();
				default:
					break;
			}
		}
		
		List<PatternExpr> missingPatterns = new ArrayList<>();
		
		if (!zeroPattern)
			missingPatterns.add(new PatternIntExpr(0));
		
		if (succPatterns.isEmpty())
			missingPatterns.add(new PatternSuccExpr(stubPattern()));
		else
			missingPatterns.addAll(
				checkPatternsExhaustiveness(StellaType.Primitives.NAT, succPatterns)
					.stream()
					.map(p -> new PatternSuccExpr(p))
					.toList()
			);	
		
		return missingPatterns;
	}
	
	private static List<PatternExpr> checkPatternsExhaustiveness(StellaBoolType type, List<PatternExpr> patterns) throws StellaException {
		boolean truePattern = false;
		boolean falsePattern = false;
		
		for (PatternExpr pattern: patterns) {
			switch (pattern.getPatternTag()) {
				case BOOL:
					PatternBoolExpr boolPattern = (PatternBoolExpr) pattern;
					
					if (boolPattern.getBoolPattern())
						truePattern = true;
					else
						falsePattern = true;
					
					break;
				case VAR:
					truePattern = falsePattern = true;
					break;
				default:
					break;
			}
		}
		
		if (!truePattern)
			return Arrays.asList(new PatternBoolExpr(true));
		else if (!falsePattern)
			return Arrays.asList(new PatternBoolExpr(false));
		
		return Collections.emptyList();
	}
	
	private static List<PatternExpr> checkPatternsExhaustiveness(StellaSumType type, List<PatternExpr> patterns) throws StellaException {
		List<PatternExpr> inlPatterns = new ArrayList<>();
		List<PatternExpr> inrPatterns = new ArrayList<>();
		
		for (PatternExpr pattern: patterns) {
			switch (pattern.getPatternTag()) {
				case INL:
					inlPatterns.add(
							((PatternInlExpr) pattern).getInlPattern()
						);
					break;
				case INR:
					inrPatterns.add(
							((PatternInrExpr) pattern).getInrPattern()
						);
					break;
				default:
					break;
			}
		}
		
		List<PatternExpr> missingPatterns = new ArrayList<>();
		
		if (inlPatterns.isEmpty())
			missingPatterns.add(new PatternInlExpr(stubPattern()));
		else {
			List<PatternExpr> missingInlPatterns = checkPatternsExhaustiveness(type.getLeftType(), inlPatterns);
			
			for (PatternExpr missingInlPattern: missingInlPatterns)
				missingPatterns.add(new PatternInlExpr(missingInlPattern));
		}
		
		if (inrPatterns.isEmpty())
			missingPatterns.add(new PatternInrExpr(stubPattern()));
		else {
			List<PatternExpr> missingInrPatterns = checkPatternsExhaustiveness(type.getRightType(), inrPatterns);
			
			for (PatternExpr missingInrPattern: missingInrPatterns)
				missingPatterns.add(new PatternInrExpr(missingInrPattern));
		}
		
		return missingPatterns;
	}
	
	private static List<PatternExpr> checkPatternsExhaustiveness(StellaVariantType type, List<PatternExpr> patterns) throws StellaException {
		Map<String, List<PatternExpr>> fieldsPatterns = new LinkedHashMap<>();
		
		for (String label: type.getLabels())
			fieldsPatterns.put(label, new ArrayList<>());
		
		for (PatternExpr pattern: patterns) {
			switch (pattern.getPatternTag()) {
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
		
		for (String label: type.getLabels()) {
			List<PatternExpr> labelPatterns = fieldsPatterns.get(label);
			
			if (labelPatterns.isEmpty())
				missingPatterns.add(new PatternVariantExpr(label, stubPattern()));
			else
				missingPatterns.addAll(
							checkPatternsExhaustiveness(type.getLabelType(label), labelPatterns)
								.stream()
								.map(p -> new PatternVariantExpr(label, p))
								.toList()
						);
		}
		
		return missingPatterns;
	}
	
	private static PatternExpr stubPattern() {
		return new PatternVarExpr("__something__");
	}
}
