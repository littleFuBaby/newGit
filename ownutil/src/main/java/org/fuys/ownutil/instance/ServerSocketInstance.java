package org.fuys.ownutil.instance;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketInstance {
	
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(8888);
		System.out.println("Waiting ......");
		Socket client = server.accept();
		PrintStream ps = new PrintStream(client.getOutputStream());
		ps.print("Hello MOTOR");
		ps.close();
		client.close();
		server.close();
	}

}
