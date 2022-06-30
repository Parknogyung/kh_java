package com.png.IO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOBufferdStream {
	public void buf () {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("A_BUF.txt"))){
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("박노경입니다.");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void bufRead() {
		try(BufferedReader br = new BufferedReader(new FileReader("A_BUF.txt"))){
			
			String value = "";
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
