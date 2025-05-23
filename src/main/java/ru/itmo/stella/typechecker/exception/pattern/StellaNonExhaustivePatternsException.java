package ru.itmo.stella.typechecker.exception.pattern;

import java.util.Arrays;
import java.util.List;

import ru.itmo.stella.typechecker.StellaTypeErrorCode;
import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.StellaExpression;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;

public class StellaNonExhaustivePatternsException extends StellaException {
	public StellaNonExhaustivePatternsException(StellaTypeErrorCode errorCode, StellaExpression matchExpr, List<? extends PatternExpr> missingPatterns) {
		super(
			errorCode,
			"non-exhaustive pattern matches\\s"
			+ "when matching on expression\\S"
			+ "%s\\s"
			+ "at least the following patterns are not matched:\\S"
			+ "%s",
			matchExpr,
			String.join(
						"\\S",
						missingPatterns
							.stream()
//							.map(StellaNonExhaustivePatternsException::decoratePatternVariables)
							.map(p -> p.getStubPattern())
							.map(PatternExpr::toString)
							.toList()
					)
		);
	}
	
	public StellaNonExhaustivePatternsException(StellaTypeErrorCode errorCode, StellaExpression matchExpr, PatternExpr... missingPatterns) {
		this(errorCode, matchExpr, Arrays.asList(missingPatterns));
	}
	
//	public static PatternExpr decoratePatternVariables(PatternExpr p) {
//		switch (p.getPatternTag()) {
//			case VAR:
//				return ((PatternVarExpr) p).getVariableName().equals(PatternExpr.STUB_PATTERN_VAR_NAME)
//						? p
//						: PatternExpr.stubPattern();
//			case SUCC: {
//				PatternSuccExpr succPattern = (PatternSuccExpr) p;
//				
//				PatternExpr succArgPattern = succPattern.getSuccPattern();
//				PatternExpr decoratedArg = decoratePatternVariables(succArgPattern);
//				
//				return succArgPattern == decoratedArg ? p : new PatternSuccExpr(decoratedArg);
//			}
//			case ASC: {
//				PatternAscExpr ascPattern = (PatternAscExpr) p;
//				PatternExpr newP = decoratePatternVariables(ascPattern.getAscriptionPattern());
//				
//				if (newP == ascPattern.getAscriptionPattern())
//					return p;
//				
//				return new PatternAscExpr(newP, ascPattern.getAscriptionType());
//			}
//			case LIST: {
//				PatternListExpr listPattern = (PatternListExpr) p;
//				
//				List<PatternExpr> elemDecoratedPatterns = new ArrayList<>();
//				
//				boolean decorFlag = false;
//				
//				for (PatternExpr elemPattern: listPattern.getPatterns()) {
//					PatternExpr decoratedElem = decoratePatternVariables(elemPattern);
//					
//					decorFlag |= decoratedElem != elemPattern;
//					
//					elemDecoratedPatterns.add(decoratedElem);
//				}
//				
//				return decorFlag ? new PatternListExpr(elemDecoratedPatterns) : listPattern;
//			}
//			case CONS: {
//				PatternConsExpr consPattern = (PatternConsExpr) p;
//				
//				PatternExpr headPattern = consPattern.getHeadPattern();
//				PatternExpr decoratedHead = decoratePatternVariables(headPattern);
//				
//				PatternExpr tailPattern = consPattern.getTailPattern();
//				PatternExpr decoratedTail = decoratePatternVariables(tailPattern);
//				
//				if (headPattern == decoratedHead && tailPattern == decoratedTail)
//					return p;
//				
//				return new PatternConsExpr(decoratedHead, decoratedTail);
//			}
//			case INL: {
//				PatternInlExpr inlPattern = (PatternInlExpr) p;
//				
//				PatternExpr inlArgPattern = inlPattern.getInlPattern();
//				PatternExpr decoratedArg = decoratePatternVariables(inlArgPattern);
//				
//				return inlArgPattern == decoratedArg ? p : new PatternInlExpr(decoratedArg);
//			}
//			case INR: {
//				PatternInrExpr inrPattern = (PatternInrExpr) p;
//				
//				PatternExpr inrArgPattern = inrPattern.getInrPattern();
//				PatternExpr decoratedArg = decoratePatternVariables(inrArgPattern);
//				
//				return inrArgPattern == decoratedArg ? p : new PatternInrExpr(decoratedArg);
//			}
//			default:
//				return p;
//		}
//	}
}
