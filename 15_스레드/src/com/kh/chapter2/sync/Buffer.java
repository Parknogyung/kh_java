package com.kh.chapter2.sync;

public class Buffer {
	private int data;
	
	// 플래그 변수(객체의 상태를 저장하고 흐름을 제어하기 위한 변수)
	private boolean empty = true;
	
	// synchronized 호출 하는 순간 동기화가 되어서 다른 스레드는 실행 안됨
	public synchronized void getDate() {
		while(empty) {
			try {
				wait(); // 객체의 잠금을 풀고 스레드를 일시 정지 상태로 만든다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("소비자가 " + this.data + "번 상품을 소비하였습니다.");
		
		this.empty = true;
		notify(); // wait()에 의해 일시 정지된 스레드 중 한 개를 실행 대기 상태로 만든다.
	}
	
	public synchronized void setData(int data) {
		while(!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.data = data;
		this.empty = false;
		
		System.out.println("생산자가 " + this.data + "번 상품을 생산하였습니다.");
		notify();
		
	}
	
	
	
}
