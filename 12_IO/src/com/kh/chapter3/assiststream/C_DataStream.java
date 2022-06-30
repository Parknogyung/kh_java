package com.kh.chapter3.assiststream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C_DataStream {
	public void fileSaveAndRead() {
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("d_data.txt", true));  //;로 구분 할 수 있다
			 DataInputStream dis = new DataInputStream(new FileInputStream("d_data.txt"))){
			
			// 파일에 출력하기
			dos.writeUTF("문인수");
			dos.writeInt(20);
			dos.writeChar('M');
			dos.writeBoolean(false);
			dos.writeDouble(183.4);
			
			// 파일에서 값을 읽어오기
			while(true) {
			System.out.println(dis.readUTF()); //위에 저장된 값과 동일한 타입으로 출력을 해줘야 한다.
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readDouble());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 읽기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
