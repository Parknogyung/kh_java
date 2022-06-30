package com.kh.lambda.basic.functional;

@FunctionalInterface
public interface A_FunctionalInterface {
	// 매개변수와 반환값이 없는 추상메소드
	public void method();
	
//	public void otherMethod(); // 메소드가 한개여야만 람다가 가능한데 2개면 에러남
}
