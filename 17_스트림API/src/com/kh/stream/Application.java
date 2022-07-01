package com.kh.stream;

import com.kh.stream.basic.A_Create;

public class Application {

	public static void main(String[] args) {
		/*
		 * Stream API
		 * 	- 스트림은 자바 8부터 추가된 기능으로 컬렉션 (배열)의 요소들을 하나씩 참조해서 
		 * 	  람다식으로 처리할 수 있도록 해주는 반복자이다. 
		 *  - 스트림은 Iterator와 비슷한 역할을 하지만 람다식으로 요소 처리 코드를 제공할 수 있고,
		 *    내부 반복자를 사용해서 병렬 처리와 중간 처리, 최종 처리 작업을 수행할 수 있다.
		 *  - 스트림은 컬렉션(배열) 요소에 대해서 중간처리와 최정 처리 작업을 할 수 있다.
		 *    - 중간 처리에는 반복, 매핑(타입 변환), 필터링, 정렬 등을 수행한다.
		 *    - 최종 처리에는 반복, 카운팅, 평균, 총합 등의 집계 처리를 수행한다.  
		 */
		
		new A_Create().method1();
		
	}

}
