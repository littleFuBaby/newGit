package org.fuys.ownutil.instance;

class MyThread extends Thread {
	
	private String name;
	public MyThread(String name){
		this.name = name;
	}
	
	@Override
	public void run(){
		// super.run();
		for(int i=0;i<999;i++){
			System.out.println("Thread " + this.name + " --> " + i);
		}
	}
	
}

public class TreadInstance {
	public static void main(String[] args) {
		MyThread a = new MyThread("a");
		MyThread b = new MyThread("b");
		MyThread c = new MyThread("c");
		
		a.start();
		b.start();
		c.start();
		
	}

}
