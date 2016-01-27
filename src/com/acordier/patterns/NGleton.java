package com.acordier.patterns;

public class NGleton {
	
	private String name;
	private Integer value;
	
	public static final NGleton instanceOne = 
			new NGleton("One", 1);
	
	public static final NGleton instanceTwo = 
			new NGleton("two", 2);
	
	private NGleton(String name, Integer value) {
		this.name = name;
		this.value = value;
	} 
	
	@Override
	public String toString() {
		return String.format("[name: %s, value:%s]", name, value);
	}
	
	

}
