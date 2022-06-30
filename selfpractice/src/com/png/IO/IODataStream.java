package com.png.IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODataStream {
	public void output() {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("B_DATA.dat"))) {
			dos.writeUTF("안녕하세요.");
			dos.writeUTF("안녕하세요.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void input() {
		try (DataInputStream dis = new DataInputStream(new FileInputStream("B_DATA.dat"))){
			while(true) {
			System.out.println(dis.readUTF());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("종료되었다요");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
			
			
	}
}
