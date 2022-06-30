package com.kh.variable.practice;

public class C_Casting {
	/*
	 * 형 변환 (boolean 제외)
	 * 
	 * * 컴퓨터에서 값의 처리 규칙
	 * 	 1) 대입 연산자를 사용할 때 대입 연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야 한다.
	 *   2) 같은 자료형끼리만 연산이 가능하다. (연산 결과도 같은 자료형으로 나온다.)
	 * 
	 * 1. 자동 형 변환(묵시적 형 변환)
	 *   - 자동으로 형 변환이 이루어지기 때문에 개발자가 형 변환을 시켜줄 필요가 없다.
	 *   - 데이터 표현 범위가 작은 자료형을 큰 자료형으로 변환한다.
	 */  
	public void autoCasting() {
		short s = 12;
		int i = s; // short -> int 자동 형변환 된다. short의 범위가 int보다 작기 때문에 가능
		long l = i; // int -> long 자동 형변환 된다. int의 범위가 long보다 작기 때문에 가능
		// float이 long보다 표현 가능한 수의 범위가 더 크기 때문에 자동 형 변환이 가능하다.
		// float f = l; 
		float f = 100000000000L;
		double d = f; //float -> double 자동 형변환 된다. double의 범위가 float보다 크기 때문에
		double result = 12 + 3.3; // 12.0 + 3.3 = 15.3
//		long result2 = 30 + 30; //30 + 30 = 60, 60을 long으로 형 변환해서 저장(60L)
		long result2 = 30 + 30L; //30L + 30L = 60L을 저장(같은 타입으로 반환되어서)
		
	
		
		System.out.println("s : " + s);
		System.out.println("i : " + i);
		System.out.println("l : " + l);
		System.out.println("f : " + f);
		System.out.println("d : " + d);
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
		
		i = '문';
		char ch = 47932;     // 범위 안에 있으면 자동형변환 됨. int 변수를 넣으면 손실될 수 있기 때문에 변수는 형변환을 써줘야함.
		byte b1 = 10;
		byte b2 = 20;
		// byte나 short 같은 경우에는 변수의 값이 int로 바꿔서 계산함. 그냥 10 + 20이면 상관 없다.
		byte result3 = (byte)(b1 + b2); 
		
		System.out.println("i : " + i);
		System.out.println("ch : " + ch);
		System.out.println("result3 : " + result3);
	}
	
	/*
	 * 강제 형 변환(명시적 형 변환)
	 *  [표현법]
	 *     (자료형) 데이터;
	 *     
	 *   - 범위가 큰 크기의 자료형의 데이터를 작은 크기의 자료형으로 변환하려고 할 때 사용한다.
	 *   - (자료형)을 형 변환 연산자라고 한다.
	 *   - 강제 형 변환의 경우 데이터 손실이 발생할 수 있다.
	 *   - boolean은 형 변환이 불가능하다. (true, false 값만 가질 수 있다.)
	 */
	public void casting() {
		double d = 3.14;
//		float f = d; // 에러 발생
		float f = (float) d;
		int i = (int) d;
//		int sum = 0;
		double sum = 0.0;
		
		System.out.println("d : " + d);
		System.out.println("f : " + f);
		System.out.println("i : " + i);
		
		i = 10;
		d = 5.76;
		// 1) 수행 결과를 int로 강제 형 변환
		// sum = (int)(i + d); // 10.0 + 5.76 = 10.76 실수형 데이터를 정수형 데이터에 넣으려고 하기 때문에 에러가 발생. 그래서 연산결과 형변환
		// 2) double 타입의 값을 int로 강제 형 변환
		// sum = i + (int)d; // 10 + 5 = 15
		// 3) double 타입의 변수로 변경
		sum = i + d;
		System.out.println("sum : " + sum);
		// 
		System.out.println((byte) 290);   //00000000 00000000 00000001 00000000 int의 bit에서 byte로 변경되면 1byte인 00000000(8비트)만 남게됨
										   //00000000 00000000 00000001 00100010 에서 00100010만 남음
	}
}
