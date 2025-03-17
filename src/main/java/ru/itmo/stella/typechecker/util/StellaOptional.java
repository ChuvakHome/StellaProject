package ru.itmo.stella.typechecker.util;

import ru.itmo.stella.typechecker.exception.StellaException;

public class StellaOptional<V> {
	private final V value;
	private StellaException exception;
	
	private StellaOptional(V value) {
		this.value = value;
		this.exception = null;
		
	}
	
	private StellaOptional(StellaException throwingException) {
		this.value = null;
		this.exception = throwingException;
	}
	
	public V get() throws StellaException {
		if (holdsValue())
			return value;
		
		throw exception;
	}
	
	public boolean holdsValue() {
		return value != null;
	}
	
	public StellaException getException() {
		return exception;
	}
	
	public static<V> StellaOptional<V> of(V value) {
		return new StellaOptional<V>(value);
	}
	
	public static<V> StellaOptional<V> of(Class<? extends V> valueClass, StellaException exception) {
		return new StellaOptional<V>(exception);
	}
}
