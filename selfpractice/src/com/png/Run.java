package com.png;

import com.png.IO.IOBufferdStream;
import com.png.IO.IOByteToCharStream;
import com.png.IO.IODataStream;
import com.png.IO.IOObjectStream;
import com.png._interface.Ipad;
import com.png._interface.Mac;
import com.png._interface.base;
import com.png.firstclass.Circle;
import com.png.firstclass.Parent;
import com.png.firstclass.child;
import com.png.inherite.Dog;

public class Run {
	public static void main(String[] args) {
//		Circle c = new Circle();
//		c.setRadius(3.1);
//		c.draw();
//		child p = new child("노경", "노경자식", 65);
//		System.out.println(p);
//		
//		Dog d= new Dog("노경", "자식", 32);
//		System.out.println(d.bark());
		

//		base ba = new Ipad();
//		base ba1 = new Mac();
//		
//		ba.turnOn();
//		ba.turnOff();
//		ba1.turnOn();
//		ba1.turnOff();
		
//		new IOBufferdStream().buf();
//		new IOBufferdStream().bufRead();
		
//		new IOByteToCharStream().input();
//		new IOByteToCharStream().output();
		
//		new IODataStream().output();
//		new IODataStream().input();
		
		new IOObjectStream().Output();
		new IOObjectStream().input();
	}

}
