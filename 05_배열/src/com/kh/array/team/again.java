package com.kh.array.team;

import java.util.Arrays;

import com.kh.array.Application;

public class again {
	
	
	public void mergedDiv(int length, int[] a){
		int[] la = new int[length/2];
		int[] ra = new int[length - (length/2)];
		int[] answer = new int[length];
		int index = 0;
		int lIdx = 0;
		int rIdx = 0;
		
		
//		for(int i = 0 ; i < la.length ; i++) {
//			la[index] = a[i];
//			index++;
//			}
//		
//		index = 0;
//
//		for(int i = la.length ; i < length ; i++) {
//			ra[index] = a[i];
//			index++;
//		}
//		Arrays.sort(la);
//		Arrays.sort(ra);
		System.out.println(Arrays.toString(la) + " " + Arrays.toString(ra));
		
		int i = 0; // ra 인덱스
		int j = 0; // la 인덱스
		int aIdx = 0; // answer 인덱스

		while(true) {
			if(i == ra.length || j == la.length) break;
			if(ra[i] <= la[j]) {
				System.out.println("i " + aIdx);
				answer[aIdx] = ra[i];
				i++;
				aIdx ++;
			}
			else {
				System.out.println("j " + aIdx);
				answer[aIdx] = la[j];
				j++;
				aIdx ++;
			}
			
			
		}
		
			if(i >= ra.length) {
				for(int k = j; k < la.length ; k++) {
					answer[aIdx] = la[k];
			}
			} else {
				for(int k = i; k < ra.length ; k++) {
					answer[aIdx] = ra[k];
			}
					aIdx++;
		}
		System.out.println(Arrays.toString(answer));
	}
}