package com.kh.dimension.practice;

import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		int [][] arr= new int[4][4];
		int n = 1;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n++;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int [][] arr= new int[4][4];
		int n = 16;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n--;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		String [][] arr= new String[3][3];
		
		for(int i = 0 ; i < arr.length ; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + String.valueOf(i) + ", " + String.valueOf(j) + ")";
				System.out.printf("%s", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		int [][] num = new int[4][4];
		
		
		for(int i = 0; i < num.length-1; i++) {
			int sum_j =0;
			for(int j = 0; j <num[i].length; j++) {
				if(j == num[i].length-1) {
					num[i][j] = sum_j;
					
					break;
				}
				int nan = (int)(Math.random()*10+1);
				num[i][j] = nan;
				sum_j+=nan;
			}
	}
		
		for (int i = 0; i < 4; i++) {
			int sum_j = 0;
			for (int j = 0; j < 4; j++) {
				if(j == 3) {
					num[j][i] = sum_j;
					break;
				}
				sum_j+=num[j][i];
			}
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.printf("%2d ", num[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		int hang = 0;
		int yeol = 0;
		
		while(true) {
		System.out.print("행 크기 : ");
		hang = sc.nextInt();
		System.out.print("열 크기 : ");
		yeol = sc.nextInt();
		if((hang < 1 || hang > 10) || (yeol < 1 || yeol > 10)) {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		} else {
			break;
		}
		}
		
		char[][] ch = new char[hang][yeol];
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				int nan = (int)(Math.random()*26 + 65);
				ch[i][j] = (char)nan;
				System.out.print(ch[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, 
			{"원", "열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "!", "더", "!! "}};
		
			for (int i = 0; i < strArr.length; i++) {
				for (int j = 0; j < strArr[i].length; j++) {
					if(strArr[j][i].equals("원") || strArr[j][i].equals("지") || strArr[j][i].equals("히") || strArr[j][i].equals("!") || strArr[j][i].equals("로") || strArr[j][i].equals("더")) {
						System.out.print(strArr[j][i] + " ");
						continue;
					}
						System.out.print(strArr[j][i]);
						
				}
			}
	}
	
	public void practice7() {
		char ch = 'a';
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		System.out.print("행의 크기 : ");
		n = sc.nextInt();
		char[][] i = new char[n][];
		
		for (int j = 0; j < n; j++) {
			int size = 0;
			System.out.printf("%d행의 크기 : ", j);
			size = sc.nextInt();
			i[j] = new char[size];
		}
		
		for (int j = 0; j < i.length; j++) {
			for (int j2 = 0; j2 < i[j].length; j2++) {
				i[j][j2] = ch;
				ch++;
				System.out.print(i[j][j2] + " ");
			}
			System.out.println();
		}
		
		}
	
		public void practice8() {
			Scanner sc = new Scanner(System.in);
			String[] st = new String[12];
			String name = "";
			String[][] answer1 = new String[3][2];
			String[][] answer2 = new String[3][2];
			
			for (int i = 0; i < st.length; i++) {
				name = sc.nextLine();
				st[i] = name;
			}
			int cnt = 0;
			System.out.println("== 1분단 ==");
			for (int i = 0; i < answer1.length; i++) {
				for (int j = 0; j < answer1[i].length; j++) {
					answer1[i][j] = st[cnt];
					cnt++;
					System.out.print(answer1[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println("== 2분단 ==");
			for (int i = 0; i < answer2.length; i++) {
				for (int j = 0; j < answer2[i].length; j++) {
					answer2[i][j] = st[cnt];
					cnt++;
					System.out.print(answer2[i][j] + " ");
				}
				System.out.println();
			}
			
			
		}
}
