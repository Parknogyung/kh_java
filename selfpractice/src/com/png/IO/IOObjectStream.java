package com.png.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOObjectStream {
	public void Output() {
		Member mb = new Member("박노경", 810000, 80000);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ob.txt"))){
			oos.writeObject(mb);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void input() {
		try (ObjectInputStream  ois = new ObjectInputStream(new FileInputStream("ob.txt"))) {
			Member mb = (Member) ois.readObject();
			System.out.println(mb);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
