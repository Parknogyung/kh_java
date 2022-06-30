package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length ; i++) {
			arr[i] = arr.length-i;
			System.out.print(arr[i] +" ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		int num =0;
		
		System.out.print("양의 정수 : ");
		num = sc.nextInt();
		
		int[] arr= new int[num];
		
		
		for(int i = 0 ; i < num ; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
	}
	}
	
	public void practice4() {
		String[] fru = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(fru[1]);
	}
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		String st = "application";
		char ch = 0;
		char[] answer = new char[st.length()];
		String str = "";
		
		for(int i = 0 ; i < st.length() ; i++) {
			answer[i] = st.charAt(i);
		}
		
		System.out.print("문자열: " + st + "\n");
		System.out.print("문자: ");
		ch = sc.nextLine().charAt(0);
		
		int cnt = 0;
		
		for(int i = 0; i < answer.length ; i++) {
			if(answer[i] == ch) {
				str += i + " ";
				cnt++;
			}
		}
		
		System.out.printf("application에 %c가 존재하는 위치(인덱스) : %s\n", ch, str);
		System.out.println("i 개수 : " + cnt);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		int week = 0;
		String[] day1 = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
 		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		week = sc.nextInt();
		if(week < 0 || week > 6) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		System.out.println(day1[week]);
	}
	
	public void practice7() {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		System.out.print("정수 : ");
		n= scanner.nextInt();
		int[] numIndex = new int[n];
		int sum = 0;
		
		for(int i = 0 ; i < n ; i ++) {
			int num = 0;
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			num = scanner.nextInt();
			numIndex[i] = num;
			sum+=num;
		}
		
		System.out.println(Arrays.toString(numIndex));
		System.out.println("총 합 : " + sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		int [] sum;
		
		while(true) {
			System.out.print("정수 : ");
			int n = sc.nextInt();
			sum = new int[n];
			int mid = (n/2+1);
			if(n >= 3 && n % 2 != 0 ) {
				for(int i = 1 ; i <= n ; i++) {
					if(i <= mid) {
					sum[i-1] = i;
					} else {
						sum[i-1] = --mid;
					}
				}
				break;
			}else {
				System.out.print("다시 입력하세요");
				System.out.println();
			}
		}
		System.out.println(Arrays.toString(sum));
	}
	
	public void practice9() {
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			int nan = (int)(Math.random()*10+1);
			num[i] = nan;
		}
		System.out.println(Arrays.toString(num));
	}
	
	public void practice10 () {
		int[] num = new int[10];
		int min = 10;
		int max = 0;
		
		for (int i = 0; i < num.length; i++) {
			int nan = (int)(Math.random()*10+1);
			num[i] = nan;
		}
		for(int i = 0 ; i < num.length; i++) {
			if(num[i] <= min) {
				min = num[i];
			}
			if(num[i] >= max) {
				max = num[i];
			}
		}
		System.out.println(Arrays.toString(num));
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
	
	public void practice11() {
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			int nan = (int)(Math.random()*10+1);
			for(int j = 0; j <= i; j++) {
				if(nan==num[j]) {
					i--;
					break;
				}
				if(j == i) {
					num[i] = nan;
				}
			}
			}
		
		System.out.println(Arrays.toString(num));
	
	}
	
	public void practice12() {
		int[] num = new int[6];
		
		for (int i = 0; i < num.length; i++) {
			int nan = (int)(Math.random()*50+1);
			for(int j = 0; j <= i; j++) {
				if(nan==num[j]) {
					i--;
					break;
				}
				if(j == i) {
					num[i] = nan;
				}
			}
			}
		Arrays.sort(num);
		for(int i = 0 ; i < num.length ; i++) {
		System.out.print(num[i] + " ");
		}
	}
	
	public void practice13() {
		String num = "";
		Scanner scanner = new Scanner(System.in);
		char[] ch = new char[14];
		
		System.out.print("주민등록번호(-포함) : ");
		num = scanner.nextLine();
		
		for(int i =0; i < num.length() ; i++) {
			if(i >= 8) {
				ch[i] = '*';
			} else {
			ch[i] = num.charAt(i);
			}
		}
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}