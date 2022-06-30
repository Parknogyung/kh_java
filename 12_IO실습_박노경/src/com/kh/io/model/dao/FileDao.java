package com.kh.io.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileDao {
	Scanner sc = new Scanner(System.in);
	
	public FileDao() {
	}
	
	public void fileSave() {
		char saveQuery = 0;
		String fileName = "";
		StringBuilder sb = new StringBuilder();
		System.out.print("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝) : ");
		while(true) {
			String st = sc.nextLine();
			if(st.equals("exit")) break;
			sb.append(st + "\n");
		}
		
		System.out.println("저장하시겠습니까?(y/n) : ");
		saveQuery = sc.nextLine().charAt(0);
		
		if((saveQuery != 'y' && saveQuery != 'Y')) {
			System.out.println("다시 메뉴로 돌아갑니다.");
			return;
		} 
		System.out.print("저장할 파일명을 입력하시오 : ");
		fileName = sc.nextLine();
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
			bw.write(sb.toString());
			System.out.println("입력받은 "+ fileName + " 파일에 성공적으로 저장하였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void fileOpen() {
		System.out.print("열기 할 파일명 : ");
		String FileName = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(FileName))){
			String value = "";
			
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		} catch (FileNotFoundException e) {
			System.out.println("존재하는 파일이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileEdit() {
		System.out.print("수정 할 파일명 : ");
		String FileName = "";
		FileName = sc.nextLine();
		char exit = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader(FileName));
				BufferedWriter bw = new BufferedWriter(new FileWriter(FileName, true))){
			
			String valueInput = "";
			while((valueInput = br.readLine()) != null) {
				System.out.println(valueInput);
			}
			
			System.out.print("파일에 추가할 내용을 입력하시오 : ");
			
			while(true) {
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				String txt = br1.readLine();
				if(txt.equals("exit")) break;
				bw.write(txt);
			}
			
			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
			exit = sc.nextLine().charAt(0);
			
			if(exit == 'y' || exit == 'Y') {
				System.out.println(FileName + " 파일의 내용이 변경되었습니다.");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
