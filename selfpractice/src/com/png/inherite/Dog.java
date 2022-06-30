package com.png.inherite;

public class Dog extends Animal {
	private int weight;
	
	public Dog() {
	}

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		
		this.weight = weight;
	}
	
	@Override
	public String bark() {
		return "멍멍~ 짖는다."+super.bark();
	}
	
}
