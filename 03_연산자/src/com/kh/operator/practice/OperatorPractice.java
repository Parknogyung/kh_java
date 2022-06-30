package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		String result = "";
		
		System.out.print("정수 : ");
		a = sc.nextInt();
		System.out.println();
		
		result = (a>0) ? "양수다" : "양수가 아니다.";
		
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice2() {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		String result = "";
		
		System.out.print("정수 : ");
		a = scanner.nextInt();
		System.out.println();
		
		result = (a>0) ? "양수다" : (a<0) ? "음수다" : "0이다";
		System.out.println(result);
		
		scanner.close();
	}
	
	public void practice3() {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		
		System.out.print("정수 : ");
		a = scanner.nextInt();
		
		System.out.println((a%2==0) ? "짝수다" : "홀수다" );		
		scanner.close();
	}

	public void practice4() {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int candy = 0;
		int emptyCandy = 0;
		
		System.out.print("인원 수 : ");
		a = scanner.nextInt();
		System.out.print("사탕 개수 : ");
		b = scanner.nextInt();
		System.out.println();
		
		candy = b/a;
		emptyCandy = b%a;
		
		System.out.println("1인당 사탕 개수 : " + candy);
		System.out.println("남는 사탕 개수 : " + emptyCandy);
		scanner.close();
	}
	
	public void practice5() {
		Scanner scanner = new Scanner(System.in);
		int age = 0;
		
		System.out.print("나이 : ");
		age = scanner.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이");
		}
		else if(age > 19) {
			System.out.println("성인");
		}
		else {
			System.out.println("청소년");
		}
		scanner.close();
	}
	
	public void practice6() {
		Scanner scanner = new Scanner(System.in);
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		
		System.out.print("입력 1 : ");
		a1 = scanner.nextInt();
		
		System.out.print("입력 2 : ");
		a2 = scanner.nextInt();
		
		System.out.print("입력 3 : ");
		a3 = scanner.nextInt();
		System.out.println();
		
		System.out.println((a1==a2 && a2==a3));
		scanner.close();
	}
	
}

