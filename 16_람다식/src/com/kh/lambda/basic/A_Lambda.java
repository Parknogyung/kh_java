package com.kh.lambda.basic;

public class A_Lambda {
	public void method1() {
		Thread thread;
		
		thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("익명 구현 객체를 사용한 Thread 생성");
			}
		}); 
		
		thread.start();
		
		// Thread 클래스에 runnable 생성자에 run 메소드를 구현한다.
		thread = new Thread(() -> {
			System.out.println("람다식을 사용한 Thread 생성");
		});
		
		thread.start();
		
		Runnable runnable = () -> System.out.println("람다식을 사용한 Thread 생성 2");
		
		thread = new Thread(runnable);
		
		thread.start();
		
	}
}
