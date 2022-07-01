package com.kh.stream.basic;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A_Create {
	/*
	 * 스트림의 종류
	 *   - java.util.stream 패키지에 존재하고 BaseStream 인터페이스를 부모로 해서 자식 인터페이스들이 상속 관계를 이루고 있다
	 *	 - Stream, IntStream, LongStream, DoubleStream이 있다.
	 *
	 * 스트림 생성
	 * 	 - 숫자 범위로 스트림을 생성하는 방법
	 * 	 - IntStream의 range(), rangeClosed() 메소드를 이용해서 생성한다.
	 */
	
	// 숫자 범위로 스트림을 생성하는 방법
	public void method1() {
		// 첫 번째 매개 값 ~ 두 번째 매개값 이전까지의 값을 요소로 가지는 스트림 객체를 생성한다.
		IntStream stream = IntStream.range(1, 10);
		int sum = stream.peek(value -> System.out.print(value + " ")).sum();
		System.out.println("Sum : " + sum);
	}
}
