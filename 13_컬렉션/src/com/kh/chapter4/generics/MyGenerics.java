package com.kh.chapter4.generics;

import java.util.ArrayList;
import java.util.List;

//public class MyGenerics<T> { //String으로 넘겼기 때문에 모두 String으로 바뀜 T부분이
public class MyGenerics<T extends Number>{ // T가 Number클래스거나 Number를 상속는 애여야 한다. Integer, Double 등 숫자타입
	
	private T[] values;

	public MyGenerics() {
	}

	public MyGenerics(T[] values) {
		this.values = values;
	}
	
	public void print() {
		for (T t : values) {
			System.out.println(t);
		}
	}
	
	public List<T> toList() {
		List<T> list = new ArrayList<>();
		
		for (T t : values) {
			list.add(t);
		}
		
		return list;
	}
}
