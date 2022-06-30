package com.kh.inherit.practice;

public class Point {
	private int x;
	private int y;
	
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		System.out.println("(x, y) : " + "(" + this.x + ", " + this.y + ")");
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
