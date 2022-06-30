package com.kh.chapter5.method;

import java.util.Arrays;

import com.kh.chapter4.constructor.User;

public class A_Method {
	// 1. 매개 변수가 없고 반환값도 없는 메소드
	public void method1() {
		System.out.println("매개 변수와 반환값이 둘 다 없는 메소드입니다.");
		
//		return 문을 사용할 때 return 문 뒤에 반환값이 오면 에러가 발생한다.
//		return;       // return 값이 있으면 에러가 표출. void 즉 반환값이 없는 메소드로 설정했기 때문에. return만 사용 시, 사용이 가능
	
//		System.out.println("리턴 이후 실행"); // return 뒤에 코드가 오면 에러 발생
	}

	// 2. 매개 변수가 없고 반환값은 있는 메소드
	public String method2() {
//		String str = "매개 변수가 없지만 반환값이 있는 메소드입니다.";
//		return str;
		return "매개 변수가 없지만 반환값이 있는 메소드입니다.";
	}
	
	// 3. 매개 변수가 있고 반환값이 없는 메소드
	public void method3(int num1, int num2) {
		System.out.println("매개 변수가 있고 반환값이 없는 메소드입니다.");
		System.out.println("입력받은 매개 변수 num1 + num2 = " + (num1 + num2));
	}
	
	// 4. 매개 변수가 있고 반환값도 있는 메소드
	public int method4(int num1, int num2) {
		return num1 * num2;
	}

	// 5. 매개 변수로 User 객체를 전달받는 메소드
	public void method5(User user) {
		user.setName("박노경");
		user.setAge(19);
	}
	
	// 6. 매개 변수로 가변 인자를 전달받는 메소드
	// 기존에 배열을 사용해서 가변 인자를 받는 방법
	public void method6(int[] numbers) {
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
	}
	
	// 가변 인자를 처리하는 방법 (자바 1.5부터 지원)
	// 가변 인자는 항상 매개 변수 마지막에 있어야 한다. int ... numbers, int num 이런식으로 있으면 에러 ex) method7(1, 2, 3, 4, 5}어디까지 numbers에 넣을지 모름
	// 가변 인자는 사용 시 값을 주지 않아도 호출이 되기 때문에 인자에서 예외를 처리하는 코드가 필요
//	public void method7(int ... numbers, String name) {
	public void method7(String name, int ... numbers) {
		System.out.println(name);
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
	}
}
