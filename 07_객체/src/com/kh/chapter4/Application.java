package com.kh.chapter4;

import com.kh.chapter4.constructor.User;

public class Application {

	public static void main(String[] args) {
		User user = null;
		
		// 기본 생성자로 객체 생성
		user = new User();
		
		System.out.println(user.information());
		
		// 매개 변수가 있는 생성자로 객체 생성 (3개의 값을 생성자로 전달)
		user = new User("gerie93", "아마우리1", "노경");
		
		System.out.println(user.information());

		user = new User("gerie93", "아마우리1", "노경", 28, '남');
		
		System.out.println(user.information());
	}

}
