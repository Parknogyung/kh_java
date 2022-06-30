package com.png.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOByteToCharStream {
	public void input() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("문자열 입력 > ");
			
		    String value = br.readLine();
			
			System.out.println(value);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void output() {
		
		
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write("안녕하세요 박노경입니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
