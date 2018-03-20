package org.fuys.ownutil.instance;

import java.util.Random;

class MyRunnable implements Runnable{
	
	private static int ticket = 10;
	private String name ;
	public MyRunnable(String name){
		this.name = name;
	}

	@Override
	public void run() {
		for(int x=1;x<999;x++){
			System.out.println("Runnable " + this.name + " --> Serve " + x);
			try {
				int random = new Random().nextInt(9999);
				System.out.println("Runnable " + this.name + " --> " + x + " checking and waiting for " + random);
				Thread.sleep(random);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(ticket>0){
				System.out.println("Runnable " + this.name + " --> " + x + " buy " + ticket + " ---------------- ");
				ticket--;
			}else {
				System.out.println("Runnable " + this.name + " no ticket ---> Stop Working");
				break;
			}
		}
	}
	
}

public class RunnableInstance {
	
	public static void main(String[] args) {
		new Thread(new MyRunnable("a")).start();
		new Thread(new MyRunnable("b")).start();
		new Thread(new MyRunnable("c")).start();
	}

}
