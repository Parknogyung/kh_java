package com.kh.object;

import java.util.Scanner;

import com.kh.object.practice.StaticSample;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StaticSample.setValue("Java");
		System.out.println("value : " + StaticSample.getValue());
		StaticSample.toUpper();
		System.out.println("대문자로 : " + StaticSample.getValue());
		
		System.out.println("길이 : " + StaticSample.valueLength());
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.println(StaticSample.valueConcat(str));
		
		System.out.print("인덱스 입력 : ");
		int index =sc.nextInt();
		sc.nextLine();
		System.out.print("변경 문자 입력 : ");
		char c =sc.nextLine().charAt(0);
		StaticSample.setChar(index, c);
		System.out.println("J => C : " + StaticSample.getValue());
	}

}
