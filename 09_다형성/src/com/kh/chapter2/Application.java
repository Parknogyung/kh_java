package com.kh.chapter2;

import com.kh.chapter2._abstract.Basketball;
import com.kh.chapter2._abstract.FootBall;
import com.kh.chapter2._abstract.Sports;

public class Application {

	public static void main(String[] args) {
		// 추상 클래스는 미완성의 클래스이기 때문에 객체 생성이 불가능하다.
//		Sports sports = new Sports(); // 추상 클래스는 객체로 만들 수 없다.
		
		// 추상 클래스는 객체 생성이 안될 뿐 참조 변수로 사용이 가능하다.
		// 다형성을 적용해서 자식 객체를 참조할 수 있다.
//		Sports sports1= new Basketball(5);
//		Sports sports2 = new FootBall(11);
//		
//		sports1.rule();
//		sports2.rule();

		// 객체 배열의 다형성을 이용해서 FootBall과 BasketBall 객체의 룰을 출력
		Sports[] sports = new Sports[2]; // 객체가 아니라 배열을 만드는 것이기 때문에 자기 자신을 쓸 수 있다.
		sports[0] = new Basketball(5);
		sports[1] = new FootBall(11);
		
		for (int i = 0; i < sports.length; i++) {
			sports[i].rule();
		}
	}
}
