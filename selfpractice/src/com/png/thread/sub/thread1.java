package com.png.thread.sub;

public class thread1 extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(getName() + " : " + i);
		}
	}

}
