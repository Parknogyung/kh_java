package com.kh.map.hashmap;

import java.util.Arrays;

public class MyHashMap {
	private int index; // key, value 배열의 인덱스. 크기라고 봐도 됨

	private String[] keys; //키

	private String[] values; //값
	
	private boolean answer;

	
// 1. 기본 생성자 
//	객체가 생성이 되면 키와 value의 배열을 생성하고 인덱스를 -1로 지정함으로써 put을 배열의 시작점인 0으로 변경
	public MyHashMap() { //기본 생성자
		this.index =-1;
		this.keys = new String[100];
		this.values = new String[100];
	}

// 2. put	
//	put 메소드가 호출이 되면 key와 value 배열의 index에 key, value 문자열이 들아가게 됨
	public void put(String key,String value) {
		if(getIndex(key)>-1) {
			this.keys[getIndex(key)] = key;
			this.values[getIndex(key)] = value;	
		}
		
		this.index++;
		this.keys[this.index] = key;
		this.values[this.index] = value;

		
		
	}

// 3. get
//  매개변수로 key 값을 넣어주고 해당 key의 value 값을 반환
	public String get(String key) {
		 String value=values[getIndex(key)];
		 return value;
	}

// 4. index의 getter
// key 값을 매개변수로 전달 받아 배열에 동일한 key 값이 있다면 그 key의 index 값을 반환
	private int getIndex(String key) {
		for(int i=0; i<=this.index; i++) {
			if(this.keys[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}

// 5. size
//	누적된 index의 값에서 +1 한 값이 size. 배열이기 때문에 0부터 시작을 하여 1을 더해주어야 함
	public int size() {
		return this.index+1;
	}

// 6. remove
//	해당 key의 인덱스를 getter를 이용하여 index 변수에 저장하고 그 index의 키, value 값을 전부 지움
	public void remove(String key) {
		int index = getIndex(key);
		this.keys[index] = "";
		this.values[index] = "";
	}

	
// 7. containKey
//	key배열을 전부 확인하여 해당 key가 포함되어 있다면 true 포함되어 있지 않다면 false를 리턴
	public boolean containKey(Object key) {
		for(int i=0; i<=this.index; i++) {
			if(this.keys[i].equals(key)) {
				return true;
			}
		}
		return false;
	}

// 8. containsValue
//	value 배열을 key와 동일하게 반복하여 동일한 값이 있는지 확인
	public boolean containsValue(Object value) {

		for(int i=0; i<=this.index; i++) {
			if(this.values[i].equals(value)) {
				return true;
			}
		}
		return false;
	}

// 9. clear
//	반복문을 사용하여 모든 key와 value 값을 null값으로 변경한다.
	public void clear() {
		for(int i=this.index; i>=0; i--) {
			keys[i] = "";
			values[i] = "";
		}
		this.index = -1;
	}
	
	public boolean isEmpty() {
		if(this.index == -1)
			return true;
		else {
			return false;
		}
	}
	
	

	@Override
	public String toString() {
		return "MyHashMap [keys=" + Arrays.toString(keys) + "\n, values=" + Arrays.toString(values) + "]";
	}

}
