package com.kh.chapter2.class_;

// 접근제한자 생략 시, default 접근 제한이 적용된다.
// 클래스를 만들 때 package로 만들면 default 클래스가 생성된다.
class Phone {  
	private String name;
	
	private String color;
	
	private String brand;
	
	public Phone() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
