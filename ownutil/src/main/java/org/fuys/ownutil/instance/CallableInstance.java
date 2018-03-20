package org.fuys.ownutil.instance;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyCallable implements Callable<String>{
	
	private String name;
	private static int ticket = 10;
	
	public MyCallable(String name){
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		for(int x = 1;x<999;x++){
			if(ticket>0){
				System.out.println(this.name + " --> sell --> " + ticket--);
			}
		}
		return "Ticket Sold Out";
	}
	
}

public class CallableInstance {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<String> f1 = new FutureTask<>(new MyCallable("c1"));
		FutureTask<String> f2 = new FutureTask<>(new MyCallable("c2"));
		new Thread(f1).start();
		new Thread(f2).start();
		System.out.println(f1.get());
		System.out.println(f2.get());
		
	}

}
