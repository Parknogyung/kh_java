package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice {
	public void method1() {
	String name = "";
	String gender = "";
	int age = 0;
	double key = 0;
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("이름을 입력하세요 : ");
	name = scanner.nextLine();
	
	System.out.print("나이를 입력하세요 : ");
	age = scanner.nextInt();
	scanner.nextLine();
	System.out.print("성별을 입력하세요 : ");
	gender = scanner.nextLine();
	System.out.print("키를 입력하세요(cm) : ");
	key = scanner.nextDouble();
	
	System.out.printf("키 %.1f인 %d살 %s %s님 반갑습니다^^", key, age, gender, name);
	}
	
	public void method2() {
		int a = 0;
		int b = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		a = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		b = sc.nextInt();
		
		System.out.println();
		System.out.println("더하기 결과 : " + (a+b));
		System.out.println("빼기 결과 : " + (a-b));
		System.out.println("곱하기 결과 : " + (a*b));
		System.out.println("나누기 몫 결과 : " + (a/b));
	}
	
	public void method3() {
		double ga = 0;
		double se = 0;
		double meon = 0;
		double dool = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		ga = sc.nextDouble();
	
		System.out.print("세로 : ");
		se = sc.nextDouble();
		
		System.out.println();
	
		meon = ga * se;
		dool = (ga + se) * 2;
		
		System.out.printf("면적 : %.2f \n둘레 : %.1f", meon, dool);
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		String st = "";
		
		System.out.print("문자열을 입력하세요 : ");
		st = sc.nextLine();
		System.out.println("첫 번째 문자 : " + st.charAt(0));
		System.out.println("두 번째 문자 : " + st.charAt(1));
		System.out.println("세 번째 문자 : " + st.charAt(2));
	}
}

