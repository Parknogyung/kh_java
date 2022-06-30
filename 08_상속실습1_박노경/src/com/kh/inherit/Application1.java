package com.kh.inherit;

import java.util.Scanner;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Person;
import com.kh.inherit.practice.Student;

public class Application1 {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과"); 
		students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과"); 
		students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과"); 
		for(Student stu : students) {
			System.out.println(stu.information());
		}
		
	    Employee[] employees = new Employee[2];
	    Scanner sc = new Scanner(System.in);
	    int cnt = 0;
	    int cnt2 = 0;
	    
	    while(true) {
	    	char c = 0;
	    	if(cnt > employees.length-1) {
	    		System.out.print("계속 추가하시겠습니까? : ");
	    		c = sc.nextLine().charAt(0);
	    		if(c == 'n') break;
	    		else {
	    			c ++;
	    			
	    		}
	    	}
	    	String name = "";
	    	int age = 0;
	    	double height = 0;
	    	double weight = 0;
	    	int salary = 0;
	    	String dept = "";
	    	System.out.println("정보 입력");
	    	System.out.print("이름 입력 : ");
	    	name = sc.nextLine();
	    	System.out.print("나이 입력 : ");
	    	age = sc.nextInt();
	    	System.out.print("키 입력 : ");
	    	height = sc.nextDouble();
	    	System.out.print("체중 입력 : ");
	    	weight = sc.nextDouble();
	    	System.out.print("급여 입력 : ");
	    	salary = sc.nextInt();
	    	sc.nextLine();
	    	System.out.print("부서 입력 : ");
	    	dept = sc.nextLine();
	    	employees[cnt] = new Employee(name, age, height, weight, salary, dept);
	    	cnt++;
	    }
	    for(Employee i : employees) {
	    System.out.println(i.information());
	    }
	}

}
