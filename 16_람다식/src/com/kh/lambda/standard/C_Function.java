package com.kh.lambda.standard;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import com.kh.lambda.standard.model.vo.Student;

public class C_Function {
	/*
	 * Function
	 * 	 - Function 함수적 인터페이스는 매개값과 반환값이 있는 applyXXX() 추상 메소드를 가지고 있다.
	 * 	 - applyXXX() 추상 메소드는 주로 매개값을 반환값으로 매핑(타입 변환)하는 역할을 한다.
	 */
	
	public void method1() {
		Student student = new Student("문인수", 20, "남자", 80, 70);
		
		Function<Student, String> function = (s) -> s.getName();
		
		System.out.println("넌 이름이 뭐니? : " + function.apply(student));
		
		BiFunction<String, Integer, Student> biFunction = (name, age) -> new Student(name, age);
//		BiFunction<String, Integer, Student> biFunction = Student::new;
		
		System.out.println(biFunction.apply("홍길동", 35));
		
		System.out.print("[수학 점수] : ");
		printValue((s) -> s.getMath(), student);
		
		System.out.print("[영어 점수] : ");
		printValue((s) -> s.getEnglish(), student);
		
		// 평균 점수를 구해보세요~! (영어 + 수학 / 2)
		System.out.print("[점수 평균] : ");
//		printValue((s) -> (s.getEnglish() + s.getMath())/2, student);
		printValue((s) -> s.getAvg(), student);
	}
	
	
	public void printValue(ToIntFunction<Student> function, Student student) {
		
		System.out.println(function.applyAsInt(student));
		
	}
}
