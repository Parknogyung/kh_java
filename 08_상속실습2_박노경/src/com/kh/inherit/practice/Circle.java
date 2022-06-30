package com.kh.inherit.practice;

public class Circle extends Point{
	private int radius;
	
	public Circle() {
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public void draw() {
		super.draw();
		System.out.printf("면적 : %.1f\n", this.radius*this.radius*Math.PI);
		System.out.printf("면적 : %.1f\n", 2*this.radius*Math.PI);
		
	}
	
	
}
