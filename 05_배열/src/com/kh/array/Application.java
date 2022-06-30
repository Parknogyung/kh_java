package com.kh.array;

import java.util.Arrays;

import com.kh.array.team.Merge;

public class Application {

	public static void main(String[] args) {
//		A_Array arr = new A_Array();
//		arr.method1();
//		arr.method2();
//		arr.method3();
//		arr.method4();
//		arr.practice1();
//		arr.practice2();
		
//		new B_ArrayCopy().method1();
//		new B_ArrayCopy().method2();
//		new B_ArrayCopy().method3();
//		new B_ArrayCopy().method4();
//		new B_ArrayCopy().method5();
		
//		new C_ArraySort().method1();
//		new C_ArraySort().method2();
		
//		프로젝트
//		new ArrayPractice().practice1();
//		new ArrayPractice().practice2();
//		new ArrayPractice().practice3();
//		new ArrayPractice().practice4();
//		new ArrayPractice().practice5();
//		new ArrayPractice().practice6();
//		new ArrayPractice().practice7();
//		new ArrayPractice().practice8();
//		new ArrayPractice().practice9();
//		new ArrayPractice().practice10();
//		new ArrayPractice().practice11();
//		new ArrayPractice().practice12();
//		new ArrayPractice().practice13();
		
//		again a = new again();
//		merge a = new merge();
//		
//		int[] arr = {7, 6, 5, 8, 3, 5, 9, 1};
//		int startPoint = 0;  //시작지점을 저장하기 위한 변수
//		int endPoint = arr.length-1; // 끝 지점을 저장하기 위한 변수
//		int middle = arr.length/2;
		
//		a.mergedDiv(arr.length, arr);
//		a.printMerge(arr);
//		a.mergeDiv(arr, startPoint, endPoint);
//		a.printMerge(arr);
		
		Merge a = new Merge();
		int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
		System.out.println(Arrays.toString(array));
		a.mergesort(array);
		System.out.println(Arrays.toString(array));
	}
}
