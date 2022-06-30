package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice {
	public void method1() {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		a = sc.nextLine().charAt(0);
		
		System.out.println("A Unicode : " + a);
	}
	
	public void method2() {
		double kor = 0;
		double english = 0;
		double math = 0;
		int sum = 0;
		int avg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		kor = sc.nextDouble();
		System.out.print("영어 : ");
		english = sc.nextDouble();
		System.out.print("수학 : ");
		math = sc.nextDouble();
		
		sum = (int)(kor + english + math); 
		avg = sum/3;
		System.out.println();
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		}
	
	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1/iNum2);
		System.out.println((int)dNum);
		
		System.out.println(iNum2*dNum);
		System.out.println((double)iNum1);
		
		System.out.println(iNum1/(double)iNum2);
		System.out.println(dNum);
		
		System.out.println((int)fNum);
		System.out.println(iNum1/(int)fNum);
		
		System.out.println(iNum1 / fNum);
		System.out.println(iNum1 / (double)fNum);
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((int)ch + iNum1);
		System.out.println((char)(ch + iNum1));
		
	}
}
