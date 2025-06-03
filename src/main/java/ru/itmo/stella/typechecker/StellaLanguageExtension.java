package ru.itmo.stella.typechecker;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum StellaLanguageExtension {
	STRUCTUAL_SUBTYPING("#structural-subtyping"),
	AMBIGUOUS_TYPE_AS_BOTTOM("#ambiguous-type-as-bottom"),
	TYPE_RECONSTRUCTION("#type-reconstruction"),
	;
	
	public final String name;
	
	StellaLanguageExtension(String name) {
		this.name = name;
	}
	
	Map.Entry<String, StellaLanguageExtension> toEntry() {
		return Map.entry(name, this);
	}
	
	public String getName() {
		return name;
	}
	
	public static final Map<String, StellaLanguageExtension> EXTENSIONS_NAMES = Stream.of(StellaLanguageExtension.values())
		.collect(Collectors.toMap(
			StellaLanguageExtension::getName,
			Function.identity()
		));
	
	public static StellaLanguageExtension getExtensionByName(String name) {		
		return EXTENSIONS_NAMES.get(name);
	}
}
