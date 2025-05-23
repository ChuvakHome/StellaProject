package ru.itmo.stella.typechecker;

import java.util.Map;

public enum StellaLanguageExtension {
	STRUCTUAL_SUBTYPING,
	AMBIGUOUS_TYPE_AS_BOTTOM,
	;
	
	public static final Map<String, StellaLanguageExtension> EXTENSIONS_NAMES = Map.ofEntries(
		Map.entry("#structural-subtyping", STRUCTUAL_SUBTYPING),
		Map.entry("#ambiguous-type-as-bottom", AMBIGUOUS_TYPE_AS_BOTTOM)
	);
	
	public static StellaLanguageExtension getExtensionByName(String name) {
		return EXTENSIONS_NAMES.get(name);
	}
}
