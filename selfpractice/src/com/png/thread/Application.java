package com.png.thread;

import com.png.thread.sub.thread1;
import com.png.thread.sub.thread2;

public class Application {

	public static void main(String[] args) {
		thread1 th1 = new thread1();
		thread2 th2 =new thread2();
		Thread th = new Thread(th2);
		th1.setPriority(5);
		th.setPriority(2);
		th1.start();
		th.start();
		
		try {
			th1.join();
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("종료");
	}

}
