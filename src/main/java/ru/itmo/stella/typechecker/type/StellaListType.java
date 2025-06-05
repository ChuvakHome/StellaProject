package ru.itmo.stella.typechecker.type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import ru.itmo.stella.typechecker.exception.StellaException;
import ru.itmo.stella.typechecker.expr.pattern.PatternConsExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternExpr;
import ru.itmo.stella.typechecker.expr.pattern.PatternListExpr;

public class StellaListType extends StellaType.StellaComplexType {
	private StellaType elementType;
	
	public StellaListType(StellaType elementType) {
		super(StellaType.Tag.LIST);
		
		this.elementType = elementType;
	}
	
	public StellaType getElementType() {
		return elementType;
	}
	
	@Override
	public StellaType replaceType(StellaType replace, StellaType replacement) {
		elementType = elementType.replaceType(replace, replacement);
		
		return this;
	}
	
	@Override
	protected List<? extends PatternExpr> checkPatternsExhaustivenessForType(Collection<? extends PatternExpr> patterns) throws StellaException {
		List<PatternExpr> missingPatterns = new ArrayList<>();
		
		boolean emptyListPattern = false;
		
		Map<PatternExpr, List<PatternExpr>> consPatterns = new HashMap<>();
		
		for (PatternExpr pattern: patterns) {
			switch (pattern.getPatternTag()) {
				case LIST:
					PatternListExpr listPattern = (PatternListExpr) pattern;
					
					if (listPattern.getPatterns().isEmpty())
						emptyListPattern = true;
					else {
						List<PatternExpr> listPatternsElems = listPattern.getPatterns();
						
						PatternExpr headPattern = listPatternsElems.get(0);
						PatternExpr tailPattern = new PatternListExpr(listPatternsElems.subList(1, listPatternsElems.size()));
						
						if (!consPatterns.containsKey(headPattern))
							consPatterns.put(headPattern, new ArrayList<>());
						
						consPatterns.get(headPattern).add(tailPattern);
					}
					break;
				case CONS:
					PatternConsExpr consPattern = (PatternConsExpr) pattern;
					
					PatternExpr headPattern = consPattern.getHeadPattern();
					PatternExpr tailPattern = consPattern.getTailPattern();
					
					if (!consPatterns.containsKey(headPattern))
						consPatterns.put(headPattern, new ArrayList<>());
					
					consPatterns.get(headPattern).add(tailPattern);
					break;
				case VAR:
					return Collections.emptyList();
				default:
					break;
			}
		}
		
		if (!emptyListPattern)
			missingPatterns.add(new PatternListExpr());
		
		if (consPatterns.isEmpty())
			missingPatterns.add(new PatternConsExpr(PatternExpr.STUB_PATTERN, PatternExpr.STUB_PATTERN));
		else {
			for (Entry<PatternExpr, List<PatternExpr>> consPatternEntry: consPatterns.entrySet()) {
				PatternExpr headPattern = consPatternEntry.getKey();
				List<PatternExpr> tailPatterns = consPatternEntry.getValue();
				
				checkPatternsExhaustivenessForType(tailPatterns)
					.stream()
					.map(missingTailPattern -> new PatternConsExpr(headPattern, missingTailPattern))
					.forEach(missingPatterns::add);
			}
			
			elementType.checkPatternsExhaustiveness(consPatterns.keySet())
				.stream()
				.map(missingHeadPattern -> new PatternConsExpr(missingHeadPattern, PatternExpr.STUB_PATTERN))
				.forEach(missingPatterns::add);
		}
		
		return missingPatterns;
	}

	@Override
	public boolean equalsType(StellaType type) {
		if (type.getTypeTag() != Tag.LIST)
			return false;
		
		StellaListType listType = (StellaListType) type;
		
		return listType.elementType.equalsStrict(elementType);
	}
	
	@Override
	public final boolean isSubtype(StellaType type) { // TODO: write the correct impl!
		if (super.isSubtype(type))
			return true;
		else if (type.getTypeTag() != Tag.LIST)
			return false;
		
		StellaListType listType = (StellaListType) type;
		
		return elementType.isSubtype(listType.elementType);
	}
	
	@Override
	public String toString() {
		return String.format("[%s]", elementType);
	}
}
