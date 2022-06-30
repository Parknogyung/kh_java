package com.kh.map.hashmap;

import com.kh.map.hashmap._interface.Inter;

public class HashMap implements Inter {
	private int index = -1;
	private String[] key = null;
	private String[] value = null;
	
	public void HashMap() {
		key = new String[100];
		value = new String[100];
	}

	
	@Override
	public void put(String key, String value) {
		this.index ++;
		this.key[index] = key;
		this.value[index] = value;
		
		
	
	}
	
	public int getgetter(String key) {
		
		
		return 0;
	}

	@Override
	public void replace() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Object get(String key) {
		for (int i = 0; i < index; i++) {
			if(this.key[i].equals(key)) {
				String st = this.value[i];
				return st;
			} 
		}
		return -1;
	}


	@Override
	public void size() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void containsKey() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void containsValue() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void isEmpty() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void put() {
		// TODO Auto-generated method stub
		
	}







	
	
}
