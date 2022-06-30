package com.kh.chapter2.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileByteStream {
	public void fileSave() {
		FileOutputStream fos = null;
		byte[] arr = {99, 100, 101};
		
		try {
			fos = new FileOutputStream("a_byte.dat"); // true를 붙이면 덮어쓰기가 된다. 이어쓰기
			
			fos.write(97); // a가 저장
			fos.write('b');
			fos.write(10); // 줄바꿈 문자가 저장
			fos.write(97);
			fos.write(arr);
			
			arr = new byte[] {'a', 'b', 'c', 'd'};
			
			fos.write(10); // 줄바꿈 문자가 저장
			fos.write(arr, 0, 2); // 2는 길이. index가 아님
//			fos.write('한'); // 한글은 2byte로 표현되기 때문에 바이트 단위 스트림으로는 제한이 있다.
			fos.flush();
			
			// write() 메소드 실행 시 IOException이 발생했을 경우 close()가 실행되지 않는다.
			// 반드시 finally 블록 안에서 close() 메소드를 실행해야 한다.
//			fos.close();
		} catch (IOException e) { //FileNotFoundException을 상속하기 떄문에 IOException만 사용 가능
			e.printStackTrace();
		} finally {
			try {
				// 스트림의 사용이 끝났으면 반드시 닫아주어야 한다.
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {
		FileInputStream fis = null;
		byte[] arr = new byte[100];
		
		try {
			// 파일이 존재하지 않으면 FileNotFoundException 예외가 발생한다.
			fis = new FileInputStream("a_byte.dat");
			
			/*
			 * 파일로부터 데이터를 읽어올 때는 read() 메소드를 사용한다.
			 * read() 메소드는 더 이상 읽어올 데이터가 없으면 -1을 리턴한다.
			 * 반복문을 사용해서 read() 메소드에서 -1이 리턴되기 전까지 데이터를 읽어오면 된다.
			 */
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println(fis.read(arr)); // 읽어온 데이터의 갯수
//			System.out.println(Arrays.toString(arr));
//			System.out.println(fis.read()); // 더이상 읽어올 것이 없으므로 -1을 준다.
			
			int value = 0;
			
			while((value = fis.read()) != -1) {
				System.out.print((char)value);
			}
			
			System.out.println();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
