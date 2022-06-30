package com.kh.control.chap02;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = scanner.nextInt();
		
		if(num < 1) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		for(int i = 1 ; i <= num ; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void practice2() {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		

		while(1>num) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(1<=num) {
				for(int i=1; i<=num; i++) {
					System.out.print(i +" ");
				}
			} else if(1>num) {
					System.out.println("1이상의 숫자를 입력해주세요.");
			}
		}
}
	
	public void practice3() {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		for(int i = num ; i > 0 ; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
//		while(num < 1) {
//			
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num =sc.nextInt();
//		
//			if(num < 1) {
//				System.out.println("잘못 입력");
//			} else {
//				for(int i = num ; i > 0 ; i--) {
//				System.out.print(i + " ");
//				}
//			}
//		}
		
		do {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("잘못 입력");
			} else{
				for(int i = num ; i > 0 ; i--) {
					System.out.print(i + " ");
					}
				  }
		}while(num<1);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int sum =0;
		
		System.out.print("정수를 하나 입력하세요 : ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if(i == n) {
				System.out.print(i + " = ");
				sum+=i;
				break;
			}
			System.out.print(i + " + ");
			sum+=i;
		}
		System.out.print(sum);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		System.out.print("첫 번째 숫자 : ");
		a = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		b = sc.nextInt();
		
		if(a < 1 || b < 1) {
			System.out.println("1이상의 숫자만을 입력해주세요.");
			return;
		}
		
		if(a >= b) {
			for (int i = b; i<=a; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = a; i <= b; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		while(a < 1 || b < 1) {
			System.out.print("첫 번째 숫자 : ");
			a = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			b = sc.nextInt();
			if(a < 1 || b < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
		if(a >= b) {
		for(int i = b; i <= a ; i++) {
			System.out.print(i + " ");
		}
		}else {
			for (int i = a; i <= b; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("숫자 : ");
		num = sc.nextInt();
		System.out.printf("==== %d단 ====\n", num);
		for(int i = 1; i < 10 ; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("숫자 : ");
		num = sc.nextInt();
		
		if(num < 2 || num > 9) {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
			return;
		}
		
		for(int i = num ; i < 10 ; i++) {
			System.out.printf("==== %d단 ====\n", i);
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		int num = 0;

		while(num < 2 || num > 9) {
		System.out.print("숫자 : ");
		num = sc.nextInt();
		if(num < 2 || num > 9) {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		} else {
			for(int i = num ; i < 10 ; i++) {
				System.out.printf("==== %d단 ====\n", i);
				for(int j = 1; j < 10; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i*j);
				}
				System.out.println();
			}
		}
		}
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		int start = 0;
		int sub = 0;
		int sum = 0;
		
		System.out.print("시작 숫자 : ");
		start = sc.nextInt();
		System.out.print("공차 : ");
		sub = sc.nextInt();
		
		for(int i = 0 ; i<10 ; i++ ) {
			System.out.print(start + " ");
			start += sub;
		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String op = "";
		int sum = 0;
		
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			op = sc.nextLine();
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			System.out.print("정수1 : ");
			num1 = sc.nextInt();
			System.out.print("정수2 : ");
			num2 = sc.nextInt();
			sc.nextLine();
			
			switch(op) {
			case "+":
				sum = num1 + num2;
				System.out.printf("%d %s %d = %d\n", num1, op, num2, sum);
				break;
			case "-":
				sum = num1 - num2;
				System.out.printf("%d %s %d = %d\n", num1, op, num2, sum);
				break;
			case "*":
				sum = num1 * num2;
				System.out.printf("%d %s %d = %d\n", num1, op, num2, sum);
				break;
			case "/":
				if(num1 == 0 || num2 == 0) {
					System.out.println("0으로 나눌수 없습니다. 다시 입력해주세요.");
					break;
				}
				sum = num1 / num2;
				System.out.printf("%d %s %d = %d\n", num1, op, num2, sum);
				break;
			case "%":
				sum = num1 % num2;
				System.out.printf("%d %s %d = %d\n", num1, op, num2, sum);
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
			System.out.println();
		}
	}
}
