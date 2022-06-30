package com.kh.chapter5.method;

public class C_StaticMethod {
	public static int num1 = 10;
	public static int num2 = 10;
	
	// 1. 매개 변수와 반환 값이 없는 메소드
	public static void method1() {
		System.out.println(num1 + num2); //인스턴스 필드는 객체를 생성해야 하기 때문에 접근이 불가하다. 변수에 static을 붙여야 함
		
//		this.num2; // this는 객체 자신을 의미하는데 static은 객체를 만들 필요가 없기 때문에 불가.
		C_StaticMethod.num1++;  // 클래스 명을 같이 써줘야 한다. 필드를 쓰려고 한다면
	}
	
	// 2. 매개 변수가 없고 반환 값이 있는 메소드
	public static int method2() {
//		return C_StaticMethod.num1 + C_StaticMethod.num2; 
		return num1 + num2; // 클래스 이름 생략 가능. static field 변수이기 때문에
	}
	
	// 3. 매개 변수가 있고 반환 값이 없는 메소드
	public static void method3(int num3) {
		System.out.println(num1 + num2 + num3); // num1, num2는 static 필드 num3는 매개변수
	}
	
	// 4. 매개 변수와 반환 값이 있는 메소드
	public static int method4(int ... numbers) {
		int sum = 0;
		
		for(int number : numbers) {
			sum += number; // sum = sum + number;
		}
		
		return sum;
	}
}
