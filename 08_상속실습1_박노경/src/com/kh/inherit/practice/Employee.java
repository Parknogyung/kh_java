package com.kh.inherit.practice;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	public Employee() {
	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.salary = salary;
		this.dept = dept;
		this.name = name;
	}
	
	public String information() {
		return "이름은 " + this.name + super.information() + ", 급여는 " + this.salary + ", 부서 " + this.dept;
	}
	
	
}
