package com.png.IO;

import java.io.Serializable;

public class Member implements Serializable{
	private static final long serialVersionUID = 8001980206469367373L;
	
	private String name;
	
	private int money;
	
	private int nam;
	
	public Member() {
	}

	public Member(String name, int money, int nam) {
		this.name = name;
		this.money = money;
		this.nam = nam;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", money=" + money + ", nam=" + nam + "]";
	}
	
}
