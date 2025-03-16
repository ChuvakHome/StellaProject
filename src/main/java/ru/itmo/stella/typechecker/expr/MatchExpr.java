package ru.itmo.stella.typechecker.expr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.exception.match.StellaIllegalEmptryMatchingException;
import ru.itmo.stella.typechecker.exception.match.StellaNonExhaustiveMatchPatternsException;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternInlExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternInrExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternVarExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternVariantExpr;
import ru.itmo.stella.typechecker.type.StellaBoolType;
import ru.itmo.stella.typechecker.type.StellaNatType;
import ru.itmo.stella.typechecker.type.StellaSumType;
import ru.itmo.stella.typechecker.type.StellaType;
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
			matchCase.patternExpr.checkType(context, matchExprType);
			
			ExpressionContext subctx = matchCase.patternExpr.extendContext(context, matchExprType);
			
			matchCase.expr.checkType(subctx, expected);
		}
		
		checkPatternsExhaustiveness(matchExprType, matchExpr, matchCases);
	}

	@Override
	public StellaType inferType(ExpressionContext context) throws StellaException {
		if (matchCases.isEmpty())
			throw new StellaIllegalEmptryMatchingException(this);
		
		StellaType matchExprType = matchExpr.inferType(context);
		
		StellaType patternExprType = null;
		
		for (MatchCase matchCase: matchCases) {
			matchCase.patternExpr.checkType(context, matchExprType);
			
			ExpressionContext subctx = matchCase.patternExpr.extendContext(context, matchExprType);
			
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
		public final PatternExpr patternExpr;
		public final StellaExpression expr;
		
		public MatchCase(PatternExpr pattern, StellaExpression expr) {
			this.patternExpr = pattern;
			this.expr = expr;
		}
		
		@Override
		public String toString() {
			return String.format("%s => %s", patternExpr, expr);
		}
	}
	
	private static void checkPatternsExhaustiveness(StellaType type, StellaExpression matchExpr, List<MatchCase> matchCases) throws StellaException {
		switch (type.getTypeTag()) {
			case PRIMITIVE:
				if (type == StellaType.Primitives.NAT)
					checkPatternsExhaustiveness(StellaType.Primitives.NAT, matchExpr, matchCases);
				else if (type == StellaType.Primitives.BOOL)
					checkPatternsExhaustiveness(StellaType.Primitives.BOOL, matchExpr, matchCases);
				else if (type == StellaType.Primitives.UNIT)
					checkPatternsExhaustiveness(StellaType.Primitives.UNIT, matchExpr, matchCases);
				break;
			case SUM:
				checkPatternsExhaustiveness((StellaSumType) type, matchExpr, matchCases);
				break;
			case VARIANT:
				checkPatternsExhaustiveness((StellaVariantType) type, matchExpr, matchCases);
				break;
			default:
				break;
		}
	}
	
	private static void checkPatternsExhaustiveness(StellaNatType type, StellaExpression matchExpr, List<MatchCase> matchCases) throws StellaException {
		
	}
	
	private static void checkPatternsExhaustiveness(StellaBoolType type, StellaExpression matchExpr, List<MatchCase> matchCases) throws StellaException {
		
	}
	
	private static void checkPatternsExhaustiveness(StellaSumType type, StellaExpression matchExpr, List<MatchCase> matchCases) throws StellaException {
		boolean leftPattern = false, rightPattern = false;
		
		for (MatchCase matchCase: matchCases) {
			switch (matchCase.patternExpr.getPatternTag()) {
				case INL:
					leftPattern = true;
					break;
				case INR:
					rightPattern = true;
					break;
				default:
					break;
			}
		}
		
		if (!leftPattern) {
			throw new StellaNonExhaustiveMatchPatternsException(
						matchExpr,
						new PatternInlExpr(new PatternVarExpr("__something__"))
					);
		} else if (!rightPattern) {
			throw new StellaNonExhaustiveMatchPatternsException(
					matchExpr,
					new PatternInrExpr(new PatternVarExpr("__something__"))
				);
		}
	}
	
	private static void checkPatternsExhaustiveness(StellaVariantType type, StellaExpression matchExpr, List<MatchCase> matchCases) throws StellaException {
		Set<String> matchedLabels = new HashSet<>();
		
		for (MatchCase matchCase: matchCases) {
			switch (matchCase.patternExpr.getPatternTag()) {
				case VARIANT:
					String labelName = ((PatternVariantExpr) matchCase.patternExpr).getLabelName();
					matchedLabels.add(labelName);
					break;
				default:
					break;
			}
		}
		
		List<PatternExpr> missingPatterns = new ArrayList<>();
		
		for (String label: type.getLabels()) {
			if (!matchedLabels.contains(label)) {
				missingPatterns.add(new PatternVariantExpr(label, new PatternVarExpr("__something__")));
			}
		}
		
		if (!missingPatterns.isEmpty())
			throw new StellaNonExhaustiveMatchPatternsException(matchExpr, missingPatterns); 
	}
}
