package com.kh.chapter5;

import com.kh.chapter4.constructor.User;
import com.kh.chapter5.method.A_Method;
import com.kh.chapter5.method.C_StaticMethod;

public class Application {

	public static void main(String[] args) {
		A_Method method = new A_Method();
		
		// 1. 매개 변수가 없고 반환값도 없는 메소드
		method.method1();
		
		// 2. 매개 변수가 없고 반환값은 있는 메소드
		String str = method.method2(); // method를 호출시켜 반환 값의 주소를 str에 넣어준다.
		System.out.println(str);
		
		// 3. 매개 변수가 있고 반환값이 없는 메소드
		method.method3(10, 20);

		// 4. 매개 변수가 있고 반환값도 있는 메소드
		int result = method.method4(20, 30);
		System.out.println(result); // 호출하고 리턴값을 변수에 저장하여 변수값을 출력
//		System.out.println(method.method4(20, 30)); // 호출하고 return값을 바로 출력
		
		// 5. 매개 변수로 User 객체를 전달받는 메소드
		User user = new User();
		
		System.out.println(user.information());
		method.method5(user);
		System.out.println(user.information());
		
		// 6. 매개 변수로 가변 인자를 전달받는 메소드
		int[] arr = {1, 2, 3, 4};
		
		method.method6(arr);
//		method.method6({1, 2, 3, 4, 5}); //이거의 경우 에러남. int[] numbers; numbers = {1, 2, 3, 4, 5};로 들어가게 되므로 에러. numbers = new int[]{1, 2, 3, 4, 5}로 들어가게 된다.
		method.method6(new int[]{1, 2, 3, 4, 5});
//		method.method6(); // 에러남
//		method.method7(1, 2, 3, 4, 5);
//		method.method7(1, 2, 3);
//		method.method7(); // numbers = new int[0];
		
		method.method7("홍길동");
		method.method7("홍길동", 1, 2, (1+2));
		
		System.out.println("=============================");

		// 정적 메소드(Static Method)
		// 1. 매개 변수와 반환값이 없는 메소드 호출
		C_StaticMethod.method1();
		C_StaticMethod.method1();
		// 정적 멤버는 객체 참조 변수로도 접근이 가능하지만 정적 멤버는 클래스 이름으로 접근하는 것이 좋다.
		// new C_StaticMethod().method1(); // 객체를 만들어도 사용할 수 있다. 하지만 정적 메소드인지 인스턴스 메소드인지 모르기 때문에 안쓰는걸 추천
		
		// 2. 매개 변수가 없고 반환값이 있는 메소드 호출
		int result1 = 0;
		
		result1 = C_StaticMethod.method2();
		
		System.out.println(result1);
		
		// 3. 매개 변수가 있고 반환값이 없는 메소드
		C_StaticMethod.method3(30);
		
		// 4. 매개 변수와 반환값이 있는 메소드
		result1 = C_StaticMethod.method4();
		
		System.out.println(result1);
		System.out.println(C_StaticMethod.method4(8, 9));
		System.out.println(C_StaticMethod.method4(8, 9, 10, 20, 30));

	}
}
