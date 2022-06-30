package com.kh.operator.practice;

import java.util.Scanner;

public class G_Triple {
	/*
	 * 삼항 연산자
	 * 
	 *  [표현법]
	 *    조건식 ? 식1(조건식이 참일 경우) : 식2(조건식이 거짓일 경우 수행);
	 *    
	 *  - 조건식은 주로 비교, 논리 연산자가 사용된다.
	 *  - 조건식의 결과가 true이면 식1을 수행한다.
	 *  - 조건식의 결과가 false이면 식2을 수행한다.
	 *  - 삼항 연산자는 중첩으로 사용이 가능하지만 가독성에 문제가 될 수 있기 때문에
	 *    상황에 따라서 적절하게 사용해야 한다.
	 */
	
	// 입력받은 정수가 양수인지 아닌지 판별 후 출력
	public void method1() {
		int num = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수값 입력 > ");
		num = scanner.nextInt();
		
		result = (num > 0) ? "양수이다" : ((num==0) ? "0 이다." : "음수이다."); // 삼항연산자 중첩. false이면 또 다른 3항연산자가 실행되도록
		
		System.out.printf("%d 는(은) %s", num, result);
		
		scanner.close();
	}
	
	/*
	 * 실습 문제 1
	 * 
	 * 사용자한테 두 개의 정수 값을 입력받아서
	 * 두 정수의 곱셈 결과 100보다 큰 경우 "결과가 100 이상입니다." 아닌 경우 "결과가 100 보다 작습니다." 출력
	 */
	public void practice1() {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String result = "";
		int sum = 0;
		
		System.out.print("두 개의 정수를 입력하세요 : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		sum = a*b;
		result = (sum > 100) ? "결과가 100 이상입니다." : (sum == 100) ? "결과가 100 입니다." : "100 보다 작습니다.";
		
		System.out.println(result);
		scanner.close();
	}
	
	/*
	 * 실습 문제 2
	 * 
	 * 사용자한테 문자를 하나 입력받아서
	 * 입력한 문자가 대문자이면 "알파벳 대문자이다." 아니면 "알파벳 대문자가 아니다." 출력
	 */
	public void practice2() {
		Scanner scanner = new Scanner(System.in);
		char ch = '\u0000';
		String result = "";
		
		System.out.print("문자 하나를 입력하시오 : ");
		ch = scanner.nextLine().charAt(0);
	
		result = ('A'<=ch && ch <='Z') ? "알파벳 대문자이다." : "알파벳 대문자가 아니다";
		
		System.out.println(result);
		scanner.close();
	}
	
	/*
	 * 실습 문제 3
	 * 
	 * 두 정수를 입력받고 + 또는 -를 입력 받아서 계산
	 * 단, + 또는 - 외의 문자를 입력하는 경우 "잘못 입력했습니다." 출력
	 * 
	 * 예시)
	 * 	 첫 번째 수 > 3
	 *   두 번째 수 < 4
	 *   연산자 입력(+ 또는 -) > +
	 *   
	 *   3 + 4 = 7;
	 */
	public void practice3() {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;
		char ch = '\u0000';
		String result = "";
		
		System.out.print("첫 번째 수 > ");
		a = scanner.nextInt();
		
		System.out.print("두 번째 수 > ");
		b = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("연산자 입력(+ 또는 -) > ");
		ch = scanner.nextLine().charAt(0);
		
		System.out.println();
		
		result = (ch == '+') ? String.valueOf(a+b) : (ch == '-') ? String.valueOf(a-b) : "잘못 입력했습니다.";
		
		System.out.printf("%d %c %d = %s", a, ch, b, result);
		scanner.close();
	}
}
