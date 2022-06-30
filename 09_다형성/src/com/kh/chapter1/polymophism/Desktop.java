package com.kh.chapter1.polymophism;

public class Desktop extends Product{
	private boolean allInone; // 일체 여부
	
	public Desktop() {
//		super();
		System.out.println("자식 클래스의 기본 생성자");
	}
	public Desktop(String pCode, String name, String brand, int price, boolean allInone) {
		super(pCode, name, brand, price); //부모의 생성자 매개변수 갯수와 동일해야 한다. 맨위에서 실행을 해줘야 한다.
		this.allInone = allInone;
	}
	
	
	
	public boolean isAllInone() {
		return allInone;
	}
	public void setAllInone(boolean allInone) {
		this.allInone = allInone;
	}
	
	@Override
	public String toString() { // 부모 클래스에 있는 것을 재정의 한다.
		return "Desktop [" + super.toString() + ", allInone=" + allInone + "]";
	}
	
	
}