package com.png.networksever.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public void start() {
		int port = 30027;
		String message = "";
		
			try(ServerSocket server = new ServerSocket(port)) {
				System.out.println("서버 시작");
				
				while(true) {
					System.out.println("클라이언트 대기중");
					
					Socket client = server.accept();
					
					System.out.println("클라이언트 연결됨");
					
					BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
					PrintWriter pw = new PrintWriter(client.getOutputStream());
					
					while(true) {
						message = br.readLine();
						
						if(message == null || message.equals("exit")) {
							System.out.println("클라이언트 접속 종료");
							break;
						}
						System.out.println(message);
						pw.println("메시지 받기 성공");
						pw.flush();
					}
					pw.close();
					br.close();
					client.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
	}

}
