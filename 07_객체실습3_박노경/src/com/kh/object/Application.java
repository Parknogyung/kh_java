package com.kh.object;

import java.util.Scanner;

import com.kh.object.practice.NonStaticSample;

public class Application {

	public static void main(String[] args) {
		NonStaticSample nss = new NonStaticSample();
		Scanner sc = new Scanner(System.in);
		
		nss.printLottoNumbers();
		
		System.out.print("문자 입력 : ");
		char c = sc.nextLine().charAt(0);
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		sc.nextLine();
		nss.outputChar(n, c);
		System.out.println();
		System.out.println(nss.alphabette());
		
		
		System.out.println("문자열 입력 : ");
		String st = sc.nextLine();
		System.out.print("첫 번째 인덱스 입력 : ");
		int index1 = sc.nextInt();
		System.out.print("두 번째 인덱스 입력 : ");
		int index2 = sc.nextInt();
		System.out.println(nss.mySubString(st, index1, index2));
			
		
	}

}
