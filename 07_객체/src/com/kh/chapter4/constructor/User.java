package com.kh.chapter4.constructor;

/*
 * 생성자
 *   - 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당한다. (필드 초기화, 객체를 사용할 준비)
 *   - 생성자 작성 시 주의사함
 *     - 생성자의 이름은 반드시 클래스의 이름과 동일해야 한다. 
 *     - 반환형이 존재하지 않습니다.
 */
public class User {
	private String id;
	
	private String password;
	
	private String name;
	
	private int age;
	
	private char gender;
	
	// 기본 생성자
	public User() {
		System.out.println("기본 생성자 호출");
	}
	
	// 매개 변수가 있는 생성자(아이디, 패스워드, 이름)
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
//	public User(String id, String password, int name) {   // 변수명이 같고 데이터 타입이 다르면 정상적으로 동작 된다.
//		
//	}
	
	// 매개 변수가 있는 생성자(아이디, 패스워드, 이름, 나이, 성별)
	public User(String id, String password, String name, int age, char gender) { 
//		this.id = id;
//		this.password = password;
//		this.name = name;
		// 클래스 내에서 문자열 매개 변수 3개를 가지는 생성자를 호출한다.
		this(id, password, name);
		this.age = age;
//		this(id, password, name); // 생성자 호출할 때는 생성자의 가장 먼저 호출되야함. 그리고 무조건 생성자 안에서만 호출 가능함
		this.gender = gender;
	}
	
	public String information() {
		return this.id+ ", " + this.password + ", " + this.name + ", " + this.age + ", " + this.gender;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
