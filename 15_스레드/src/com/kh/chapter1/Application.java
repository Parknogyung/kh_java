package com.kh.chapter1;

import com.kh.chapter1.thread.Thread1;
import com.kh.chapter1.thread.Thread2;

public class Application {

	public static void main(String[] args) {
		System.out.println("메인 스레드 실행");
	
		Thread1 th1 = new Thread1();
		
//		th1.setPriority(1);
		th1.setPriority(Thread.MAX_PRIORITY);
		
//		th1.run();
		th1.start(); // start메소드가 실행되면 별도의 실행 흐름을 만들어 따로 실행된다. 작업 스레드가 모두 끝나야 실행 종료됨
		
		Thread th2 = new Thread(new Thread2());
		th2.setPriority(Thread.MIN_PRIORITY);
		
		th2.start();
		
		// 익명 구현 객체 사용하는 방법
		Thread th3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					System.out.println(Thread.currentThread().getName() + "[" + i + "]");
				}	
			}
		});
		
		th3.start();
		
		// 람다식을 사용하는 방법
		Thread th4 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				System.out.println(Thread.currentThread().getName() + "[" + i + "]");
			}	
		});
		
		th4.start();
		
		// 작업스레드가 끝나고 메인 쓰레드가 끝나야 하는 경우에는 사용
		try {
			th1.join();
			th2.join();
			th3.join();
			th4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료");
	}

}
