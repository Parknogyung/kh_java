package com.kh.inherit.before;

public class Desktop {
	private String pCode; // 상품 코드
	
	private String name; // 이름
	
	private String brand; // 브랜드
	
	private int price; // 가격
	
	private boolean allInone; // 일체 여부
	
	public Desktop() {
	}

	public Desktop(String pCode, String name, String brand, int price, boolean allInone) {
//		super(); // 부모 생성자 호출하는 것. 부모 생성자가 없으면 최상단인 Object 호출함. 생략 가능
		this.pCode = pCode;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.allInone = allInone;
	}

	@Override
	public String toString() {
		return "Desktop [pCode=" + pCode + ", name=" + name + ", brand=" + brand + ", price=" + price + ", allInone="
				+ allInone + "]";
	}
	
	
	
}
