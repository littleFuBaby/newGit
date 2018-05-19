package org.fuys.ownutil.juc;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class ConcurrentHashMapInstance {

	public static Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();
	public static CountDownLatch cdl = new CountDownLatch(1000);

	public static void main(String[] args) {

		for (int x = 0; x < 1000; x++) {
			new Thread(()->{
				System.out.println(Thread.currentThread().getName());
				map.put(Thread.currentThread().getName(), new Random().nextInt(1000));
				cdl.countDown();
				map.get("dd");
			},"T-"+x).start();
		}

		try {
			cdl.await();
			System.out.println(map);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


