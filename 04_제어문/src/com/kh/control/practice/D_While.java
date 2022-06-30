package com.kh.control.practice;

import java.util.Scanner;

public class D_While {
	/*
	 * while 문
	 * 
	 *  [표현식]
	 *    [초기식]
	 *    
	 *    while(조건식) {
	 *    	..실행 코드..
	 *    
	 *    	[증감식, 분기문]
	 *    }
	 */
	
	public void method1(){
		// 1부터 랜던값(1~10)까지의 합계
		int sum = 0;
		int random = (int)(Math.random()*10)+1;

		int i = 0; // 초기식은 while문 밖에
		
		while (i <= random) {
			sum += i;
			
			i++;
		}
		
		System.out.printf("1부터 %d까지의 합 : %d", random, sum);
	}
	
	// 사용자에게 계속 문자열을 입력 받고 그 문자열을 출력한다.
	// 단, "exit" 문자열을 입력하면 프로그램 종료
	public void method2() {
		Scanner scanner = new Scanner(System.in);
		String str = "";
		
//		while(true) {
//			System.out.print("문자열 입력 > ");
//			str = scanner.nextLine();
//
//			if(str.equals("exit")) {
//				break;
//			}
//			
//			System.out.println(str);
//		}

		while(!str.equals("exit")) {       // string을 null로 사용한다면 주소값이 없어서 참조 할 수 없으므로 exception발생 ""로 쓰면 상관 없음
			System.out.print("문자열 입력 > ");
			
			str = scanner.nextLine();

			System.out.println(str);
		}
		
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
		
	}
		
	}