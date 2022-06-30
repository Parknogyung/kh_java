package com.png.inherite;

public class Animal {
	private String name;
	private String kinds;
	
	public Animal() {
	}

	public Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	public String bark() {
		return "짖는다.";
	}
}
