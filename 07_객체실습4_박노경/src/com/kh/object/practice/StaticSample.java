package com.kh.object.practice;

import java.util.Arrays;

public class StaticSample {
	private static String value;

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	public static void toUpper() {
		value = value.toUpperCase();
	}
	
	public static void setChar(int index, char c) {
		char ch = value.charAt(index);
		String st = value;
		
		value = value.replace(ch, c);
		
	}
	
	public static int valueLength() {
		return value.length();
	}
	
	public static String valueConcat(String str) {
		return value + str;
	}
}
