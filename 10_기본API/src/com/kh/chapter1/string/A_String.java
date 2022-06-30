package com.kh.chapter1.string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class A_String {
	public void method1() {
		// 문자열 리터럴과 new 연산자로 생성된 문자열 비교
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("helloo");
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		
		// toString() => String 클래스에서 이미 오버라이딩 되어있다.
//		System.out.println(str1.toString());
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		// equals() => String 클래스에서 이미 오버라이딩 되어있다.
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		System.out.println("str3.equals(str4) : " + str3.equals(str4));
		
		// hashCode() => String 클래스에서 이미 오버라이딩 되어있다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
	
	public void method2() {
		String str = "Hello World!!";
		
		// charAt(int index) : char
		//  전달받은 index 위치의 하나의 문자만 추출해서 리턴한다.
		char ch = str.charAt(4);
		
		System.out.println("ch : " + ch);
		System.out.println();
		
		// 2. concat(String str) : String
		// string에 더해지는 것은 더해져서 새로운 문자열로 출력하는 것이다. 원본 문자열에는 변화 x
		// 전달받은 str과 원본 문자열을 하나로 합친 새로운 문자열을 생성해서 리턴한다.
		String str2 = str.concat("!!!!!");
		System.out.println("str2 : " + str2);
		System.out.println("str : " + str);
		System.out.println();
		
		// 3. subString(int beginIndex) : String
		//    문자열의 beginIndex 위치에서부터 끝까지의 문자열을 새로 생성해서 리턴한다.
		//	  subString(int beginIndex, int endIndex) : String
		//    문자열의 beginIndex 위치에서부터 endIndex 이전까지의 새로운 문자열 생성해서 리턴한다.
		String str4 = str.substring(6);
		String str5 = str.substring(2, 6);
		
		System.out.println("str4 : " + str4);
		System.out.println("str5 : " + str5);
		System.out.println("str : " + str);
		System.out.println();
		
		// 4. indexOf(String str) : int => 전달받은 str의 시작 인덱스를 리턴한다. 
		//							       (주어진 문자열이 포함되어 있지 않으면 -1 리턴)
		//    indexOf(int ch) : int     => 전달받은 ch의 시작 인덱스를 리턴한다.
		// 								   (주어진 문자가 포함되어 있지 않으면 -1 리턴)
		// int index = str.indexOf("world");
		   int index = str.indexOf("world", 7);
		
		// Hello World!!
		System.out.println("index : " + index);
		
//		index = str.indexOf('o');
		index = str.lastIndexOf('o');
		System.out.println("index : " + index);
		System.out.println();
		
		// 5. replace(char oldChar, char newChar) : String => 문자열에서 old 문자를 new 문자로 변경된 새로운 문자열을 생성해서 리턴한다.
		String str6 = str.replace('l', 'c');
		
		System.out.println(str6);
		System.out.println(str);
		System.out.println();
		
		// 6. toUpperCase(), toLowerCase() : String => 문자열을 모두 대/소문자로 변경한 새로운 문자열을 생성해서 리턴한다.
		String str7 = str.toUpperCase();
		String str8 = str.toLowerCase();
		
		System.out.println("str7 : " + str7);
		System.out.println("str8 : " + str8);
		System.out.println("str : " + str);
		System.out.println();
		
		// 7. trim() : String => 문자열의 앞뒤 공백을 제거한 새로운 문장ㄹ을 생성해서 리턴한다.
		str = " JAVA ";
		String str9 = str.trim();
		
		System.out.println("str9 : " + str9);
		System.out.println("str : " + str);
		System.out.println();
		
		// 8. toCharArray() : char[] => 문자열의 문자들을 문자 배열에 담아서 해당 배열의 주소값을 리턴한다.
		str = "Hello";
		char[] array = str.toCharArray();
		
		System.out.println("array[0] : " + array[0]);
		System.out.println(Arrays.toString(array));
		System.out.println();
		
		// 9. static valueOf([기본자료형(문자 배열, 객체)]) : String => 입력받은 값들을 문자열로 변경해서 리턴한다.
		String str10 = String.valueOf(true);
		String str11 = String.valueOf(array);
		String str12 = String.valueOf(3.1415f);
		
		System.out.println("str10 : " + str10);
		System.out.println("str11 : " + str11);
		System.out.println("str12 : " + str12);
		System.out.println();
	}
	
	public void method3() {
		// 구분자를 이용하여 문자열 분리
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// 1. String 클래스의 split() 메소드를 이용하는 방법
		String[] strArr = str.split(",");
		
		System.out.println("strArray.length : " + strArr.length);
		System.out.println(Arrays.toString(strArr));
		
//		for(String s : strArr) {
//			System.out.println(s);
//		}
		
		System.out.println();
		
		// 2. StringTokenizer 객체를 이용하는 방법
		//    countTokens() : 남아있는 토큰의 수를 리턴한다.
		//    hasMoreTokens() : 남아있는 토큰이 있는지 확인한다. 
		//    nextToken() : 토큰을 하나씩 꺼내온다.
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		System.out.println("분리 후 문자열의 개수 : " + st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.countTokens());
			System.out.println(st.nextToken());
		}
		
		// for 문으로 작성
//		int length = st.countTokens();
		
//		for(int i = 0; i < st.countTokens();) {
//			System.out.println(st.nextToken());
//		}
	
	}
}
