package org.fuys.ownutil.juc;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {

	@Override
	public void run() {

		try {
			TimeUnit.SECONDS.sleep(new Random().nextInt(5));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}

}

public class ExecutorsInstance {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(3);

		pool.execute(new Task());
		pool.execute(new Task());
		pool.submit(new Task());
		pool.execute(new Task());
		pool.execute(new Task());

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		pool.shutdownNow();
		
		System.out.println(pool.isTerminated());
		
	}

}
