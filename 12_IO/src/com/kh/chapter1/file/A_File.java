package com.kh.chapter1.file;

import java.io.File;
import java.io.IOException;

public class A_File {
	public void method1() {
		try {
			// 경로를 지정하지 않으면 현재 프로젝트 폴더에 파일이 생성된다.
			File file = new File("test.txt"); // 메모리 상에만 존재하는 객체
//			File file2 = new File("C:/Users/parkng/test2.txt");
			// 만약에 존재하지 않는 경로를 제시하면 IOException이 발생한다.
			File file2 = new File("C:/Users/parkng/temp/test2.txt");

			System.out.println(file.getName()); // 파일 이름
			System.out.println(file.getAbsolutePath()); // 절대 경로
			System.out.println(file.getPath()); // 상대 경로
			System.out.println(file.length()); // 파일 용량
			System.out.println(file.exists()); // 파일 존재 여부
			
			file.createNewFile();  // 실제 파일이 생성된다.
			file.delete();
			
//			file2.mkdirs(); // mkdir은 폴더를 만드는 명령어이고, mkdirs는 해당 경로에 폴더가 없으면 만들어준다. test2.txt도 폴더로 본다.
			
			File tempDir = new File("C:/Users/parkng/temp");
			
			tempDir.mkdirs(); // mkdir은 폴더를 만드는 명령어이고, mkdirs는 해당 경로에 폴더가 없으면 만들어준다. test2.txt도 폴더로 본다.
			
			file2.createNewFile();
			
			System.out.println();
			System.out.println(file2.exists());
			System.out.println(file2.isFile());
			System.out.println(file2.isDirectory());
			System.out.println(tempDir.isFile());
			System.out.println(tempDir.isDirectory());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
