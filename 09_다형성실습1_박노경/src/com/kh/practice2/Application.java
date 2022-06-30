package com.kh.practice2;

import com.kh.practice2.model.vo.Animal;
import com.kh.practice2.model.vo.Cat;
import com.kh.practice2.model.vo.Dog;

public class Application {

	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		
		animals[0] = new Dog("소금", "시츄", 15);
		animals[1] = new Dog("소금이", "푸들", 12);
		animals[2] = new Dog("사랑", "도숑", 13);
		animals[3] = new Cat("사탕", "점박이", "우리집", "검흰");
		animals[4] = new Cat("바둑", "몰라", "너희집", "검정");
		
		for(Animal animal : animals) {
			animal.speak();
		}
	}

}
