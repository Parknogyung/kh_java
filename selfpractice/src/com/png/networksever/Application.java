package com.png.networksever;

import com.png.networksever.tcp.Server;

public class Application {

	public static void main(String[] args) {
	Server server = new Server();
	server.start();
	}

}
