package com.kh.chapter3.assiststream;

import java.io.Serializable;
// 데이터만 가지고 직렬화, 생성자 메소드는 안됨
public class Member implements Serializable { // Serializable은 모든 멤버를 직렬화를 허용한다.

	private static final long serialVersionUID = -7067495485650549969L; // 역직렬화할 때 동일해야 역직렬화 가능. 클래스명에 노란 라인 보면 generate 보일꺼임

	private String id;
	
	private transient String password; // 직렬화할 때 제외함
	
	private String name;
	
	private int age;
	
	private transient double point;
	
	public Member() {
	}

	public Member(String id, String password, String name, int age, double point) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.point = point;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", point=" + point
				+ "]";
	}
	
}
