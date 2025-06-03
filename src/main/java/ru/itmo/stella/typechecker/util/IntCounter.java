package ru.itmo.stella.typechecker.util;

public class IntCounter {
	private int value;
	
	public IntCounter(int value) {
		this.value = value;
	}
	
	public IntCounter() {
		this(0);
	}
	
	public void incCounter(int n) {
		value += n;
	}
	
	public void incCounter() {
		incCounter(1);
	}
	
	public int preIncCounter() {
		return ++value;
	}
	
	public int postIncCounter() {
		return value++;
	}
	
	public int getCounter() {
		return value; 
	}
}
