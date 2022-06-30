package com.kh.chapter3;

import com.kh.chapter3.field.A_Field;
import com.kh.chapter3.field.B_StaticField;
import com.kh.chapter3.field.C_StaticField;
import com.kh.chapter3.field.D_InitBlock;

public class Application {
	public static void main(String[] args) {
		// 변수 구분 테스트
		A_Field field = new A_Field();
		
		field.method1(10); // 매개 타입을 잘 확인해서 동일하게 넣어줘야한다.
		
		// 접근 제한자 테스트
		// public : 필드에 직접 접근이 가능하다.
		System.out.println(field.publicField);
		
//		protected : 같은 패키지 내에 존재하거나, 자식 클래스에서만 접근이 가능하다.
//		System.out.println(field.protectedFeild);
		
//		default : 같은 패키지 내에서만 직접 접근이 가능하다.
//		System.out.println(field.defaultFeild);
		
//		private : 같은 클래스 내에서만 직접 접근이 가능하다.
//		System.out.println(field.privateField);
		
		// 3. 클래스 변수 테스트
		// 클래스 변수는 프로그램 실행과 동시에 메모리(static)에 생성되었기 때문에 객체를 생성하지 않아도 접근이 가능하다.
		System.out.println(B_StaticField.publicStaticField );
		System.out.println(B_StaticField.getPrivateStaticField());  // private static 필드라면 getter setter를 만들어 사용. 
		// getter setter도 객체를 안만들고 실행해야 하기 때문에 static이 붙는다.
//		정적 멤버는 객체의 참조 변수로도 접근이 가능하지만 정적 멤버는 클래스 이름으로 접근하는 것을 지향한다.
//		B_StaticField staticField = new B_StaticField();
//		System.out.println(staticField.publicStaticField);
//		System.out.println(staticField.getPrivateStaticField());
		
		// 4. 상수 필드 테스트
		// static 키워드로 생성된 필드이기 때문에 객체 생성이 필요없다.
		System.out.println(C_StaticField.MAX_LEVEL);
		System.out.println(Math.PI);
		System.out.printf("byte의 표현 범위 : %d ~ %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("int의 표현 범위 : %d ~ %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
		// final 키워드로 인해서 값을 변경할 수 없다.
		// C_StaticField.MAX_LEVEL = 99; 
		
		// 5. 필드 초기화 순서 테스트
		// 필드
		D_InitBlock initblock = new D_InitBlock();
		
		System.out.println(initblock.getName());
		System.out.println(initblock.getPhoneName());
		System.out.println(initblock.getPrice());
		
		// 클래스 변수
		System.out.println(D_InitBlock.getAge());
		System.out.println(initblock.getBrand());
	}	

}
