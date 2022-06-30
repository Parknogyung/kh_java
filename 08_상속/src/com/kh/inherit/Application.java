package com.kh.inherit;

import com.kh.inherit.after.Desktop;
import com.kh.inherit.after.SmartPhone;
import com.kh.inherit.after.Tv;
import com.kh.inherit.override.Book;

public class Application {

	public static void main(String[] args) {
		// Desktop 객체 생성
//		Desktop desktop = new Desktop(); // 자식 클래스의 클래스를 먼저 호출 했지만 부모 클래스를 먼저 호출하고 자식클래스 호출. super()가 있기 때문에. super는 맨위에
		Desktop desktop = new Desktop("a1111", "아이맥24인치", "애플", 2000000, true);
		SmartPhone smartphone = new SmartPhone("a2222", "아이폰12미니", "애플", 960000, "KT");
		Tv tv = new Tv("t-01", "올레드 벽걸이 TV", "엘지", 2500000, 60);
		
		// 출력
//		System.out.println(desktop.toString()); // toString은 Object클래스에 있는 메소드라 toString 메소드를 주석처리가되어도 출력이 가능함
		System.out.println(desktop); // print는 내부적으로 toString을 찍게 만들어준다. 그래서 toString을 써주는 것과 같은 출력이 가능하다.
		System.out.println(smartphone);
		System.out.println(tv);
		System.out.println();
		
		// 오버라이딩 테스트
		Book book1 = new Book("자바의 정석", "홍길동", 3000);
		Book book2 = new Book("자바의 정석", "홍길동", 3000);
		Book book3 = new Book("자바 너무 어려워", "문인수", 200);
		
		//toString() 테스트
		System.out.println(book1); // 참조 값
//		System.out.println(book.toString()); // String 값
		System.out.println(book2);
		System.out.println();
		
		// equals() 테스트
		System.out.println("book1과 book2가 같은 책 입니까? ");
		System.out.println(book1.equals(book2));
		System.out.println(book1.equals(book3));
		
		// hashCode() 테스트
		System.out.println("book1의 hashCode : " + book1.hashCode());
		System.out.println("book2의 hashCode : " + book2.hashCode());
		System.out.println("book3의 hashCode : " + book3.hashCode());
	}
}
