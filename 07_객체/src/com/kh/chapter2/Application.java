package com.kh.chapter2;

import com.kh.chapter2.class_.Person;

public class Application {

	public static void main(String[] args) {
		Person person = new Person(); 
//		Phone phone = new Phone(); // default 클래스이기 때문에 완전히 동일한 패키지에서만 사용할 수 있어서 에러 남
		
		person.setName("박노경");
		person.setAge(28);
		person.setGender('남');
		person.setPhone("아이폰 13 pro", "스카이 블루", "apple");
		
		person.whoAreYou();
	}

}
