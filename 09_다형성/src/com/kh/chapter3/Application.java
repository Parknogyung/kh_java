package com.kh.chapter3;

import com.kh.chapter3._interfatce.Basic;
import com.kh.chapter3._interfatce.Desktop;
import com.kh.chapter3._interfatce.Product;
import com.kh.chapter3._interfatce.SmartPhone;
/*
 * 인터페이스는 기능만 추상클래스는 확장하고 싶을때 
 * 부모클래스를 추상클래스를 선언하고 자식클래스에서 인터페이스를 구현한다.
 * 
 * 1) 인터페이스는 다중 상속 다중 구현이 가능하다.
 *  - 상속에는 extends, 구현에는 implements 사용
 */
public class Application {

	public static void main(String[] args) {
		// 인터페이스는 객체 생성이 불가능하다.
		// 인터페이스를 구현하는 자식 클래스를 통해서 생성해야 한다.
//		Basic basic = new Basic();
		
		// 인터페이스는 객체 생성이 안될 뿐 참조 변수로 사용이 가능하다.
		// 다형성을 적용해서 인터페이스를 구현하는 자식 객체를 생성해서 참조할 수 있다.
		Basic desktop = new Desktop("a1111", "아이맥24인치", "애플", 2000000, true);
		Basic phone = new SmartPhone("a2222", "아이폰12미니", "애플", 960000, "KT");
		System.out.println(desktop);
		System.out.println(phone);
		
		desktop.turnOn();
		desktop.turnOff();
		phone.turnOn();
		phone.turnOff();
		
	}
}
