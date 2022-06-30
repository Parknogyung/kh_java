package com.kh.chapter3._interfatce;

public interface Basic {
	// 인터페이스에서 필드는 무조건 상수 필드. (public static final 생략 가능). 그래서 필드 선언 불가
	/*public static final*/ int NUM = 10; 
	
	// 인터페이스에서 메소드는 무조건 추상 메소드이다. (public abstract 생략 가능)
	/*public abstract*/ void turnOn();
	/*public abstract*/ void turnOff();
}
