package com.png.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public void start() {
		int port = 30027;
		String serverIP = null;
		Socket socket = null;
		Scanner sc = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			socket = new Socket(serverIP, port);
			
			if(socket != null) {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				pw = new PrintWriter(socket.getOutputStream(), true);
				
				sc = new Scanner(System.in);
				
				while(true) {
					System.out.print("서버에 보낼 내용");
					
					String message = sc.nextLine();
					
					pw.println(message);
					
					if(message == null || message.equals("exit")) {
						System.out.println("접속 종료");
						
						break;
					}
					System.out.println("받은 메세지 : " + br.readLine());
					
				}
			}
			
			sc.close();
			pw.close();
			br.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
