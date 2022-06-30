package com.kh.control.practice;

/*
 *	continue
 *
 *	 [표현법]
 * 	   반복문(조건식) {
 * 	 	 [continue]
 * 	   }
 *  - continue 문은 반복문 안에서만 사용이 가능하다.
 * 	- 반복문 안에서 continue를 만나게 되면 다음 구문들을 실행하지 않고
 *    continue 문이 포함되어 있는 반복문의 조건식 또는 증감식으로 이동한다.
 */
public class G_Continue {
	public void method1() {
		// 1부터 100까지 정수들의 합을 출력하시오.
		// 단, 5의 배수는 제외하고 덧셈 연산을 한다.
		int sum = 0;
		int i = 0;
		
//		for(int i = 1; i <= 100; i++) { //for문
//			if(i%5==0) continue;
//			sum+=i;
//		}
		
		while(i<100) {                   //while 문
			i++;
			if(i % 5 == 0)continue;
			sum+=i;
		}
		
		System.out.println("합계 : " + sum);
	}
	
	public void method2() {
		// 2 ~ 9단까지 출력하시오.
		// 단, 홀수단을 빼고 출력한다.
		int sum = 0;
		int i = 0;
		while(i<9) {   //while문
			i++;
			
			if(i % 2 != 0) continue;
			
			System.out.printf("== %d단 ==\n", i);
			
			for(int j = 1; j <=9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		
//		for(int i = 2; i <= 9; i++) { //for문
//			if(i % 2 != 0) continue; // if문
////			switch(i) { //스위치문
////			case 3:
////			case 5:
////			case 7:
////			case 9:
////			continue;
////			default:
//				for(int j = 1; j<=9; j++) { 
//					sum = i*j;
//					System.out.printf("%d x %d = %d\n", i, j, sum);
//				}
//				System.out.println();
//		}
	}
}
