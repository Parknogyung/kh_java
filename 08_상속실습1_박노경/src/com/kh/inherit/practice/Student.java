package com.kh.inherit.practice;

public class Student extends Person{
	private int grade;
	private String major;
	
	public Student() {
	}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.grade = grade;
		this.major = major;
		this.name = name;
	}
	
	public String information() {
		return "이름은 " + this.name + super.information() + ", 학년은 " + this.grade + ", 전공은 " + this.major;
	}
	
}
