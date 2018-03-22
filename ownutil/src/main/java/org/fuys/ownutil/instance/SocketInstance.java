package org.fuys.ownutil.instance;

import java.net.Socket;
import java.util.Scanner;

public class SocketInstance {
	
	public static void main(String[] args) throws Exception {
		Socket client = new Socket("localhost", 8888);
		Scanner scan = new Scanner(client.getInputStream());
		System.out.println("Input:");
		scan.useDelimiter("\\s");
		while(scan.hasNextLine()){
			System.out.println(scan.nextLine());
		}
		scan.close();
		client.close();
		
		
	}

}
