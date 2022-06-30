package com.kh.chapter3.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

public class B_Properties {
//	Properties를 생성하고 저장, 출력(파일) 테스트
	public void method1() {
		// 부모에 타입파라미터가 있어서 여기서 안써줘도 된다.
		// String으로 고정
		Properties prop = new Properties();
		
		// 순서 유지 X, 키 값 중복 X
		prop.setProperty("List", "LinkedList");
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		System.out.println(prop);
		System.out.println();
		
		// value 값 읽어오기
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("Stack", "값이 없습니다.")); // Key값이 존재하지 않으면 defaultValue값 반환
		System.out.println();
		
		for (Entry<Object, Object> entry : prop.entrySet()) {
			String key = (String)entry.getKey();
			String value = (String)entry.getValue();
			
			System.out.printf("key : %s, value : %s\n", key, value);
			
		}
		
		try {
//			prop.store(new FileOutputStream("test1.properties"), "properties Test 1");
//			prop.store(new FileWriter("test2.properites"), "Properties Test 1");
			prop.storeToXML(new FileOutputStream("test3.xml"), "XML Test");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}
	
//	Properties를 생성하고 저장(파일), 출력 테스트
	public void method2() {
		Properties prop = new Properties();
		
		try {
//			prop.load(new FileInputStream("test1.properties"));
//			prop.load(new FileReader("test2.properites"));
			prop.loadFromXML(new FileInputStream("test3.xml"));
			
			System.out.println(prop);
			System.out.println(prop.getProperty("List"));
			System.out.println(prop.getProperty("Set"));
			System.out.println(prop.getProperty("Map"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

