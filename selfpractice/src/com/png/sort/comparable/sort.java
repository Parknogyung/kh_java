package com.png.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sort {
	public void method1() {
	List<Music> list = new ArrayList<>();
	
	list.add(new Music("Love Dive", "IVE", 1));
	list.add(new Music("TOMBOY", "I-DLE", 3));
	list.add(new Music("소주한잔", "임창정", 6));
	list.add(new Music("나는 트로트가 싫어요", "임창정", 5));
	list.add(new Music("Feel My Rhythm", "레드벨벳", 4));
	list.add(new Music("봄여름가을겨울", "빅뱅", 2));
	
//	Collections.sort(list);
//	
//	for (Music music : list) {
//		
//		System.out.println(music);
//	}
	
	Collections.sort(list, new comparator_());
	
	for (Music music : list) {
		System.out.println(music);
	}
	}
}
