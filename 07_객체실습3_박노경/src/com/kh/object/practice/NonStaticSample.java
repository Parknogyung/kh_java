package com.kh.object.practice;

import java.util.Arrays;

public class NonStaticSample {
	public void printLottoNumbers() {
		int arr[] = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
		    int ran = (int)(Math.random()*45+1);
			for (int j = 0; j <= i; j++) {
				if(ran == arr[j]) break;
				
				if(i == j) {
					arr[i]=ran;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void outputChar(int num, char c) {
		for (int i = 0; i < num; i++) {
			System.out.print(c + " ");
		}
	}
	
	public char alphabette() {
		char c = 0;
		int nan = 0;
		int answer = 0;
		while(true) {
		nan = (int)(Math.random()*58+65);
		if(nan >= 65 && nan <= 90) {
			answer = nan;
			break;
			}
		else if(nan >= 97 && nan<=122) {
			answer= nan;
			break;
			}
		}
		c = (char)answer;
		return c;
	}
	
	public String mySubString(String str, int index1, int index2) {
		String st = "";
		st = str.substring(index1, index2);
		
		return st; 
	}
}
