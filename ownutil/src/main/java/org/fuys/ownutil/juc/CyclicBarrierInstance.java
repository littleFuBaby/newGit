package org.fuys.ownutil.juc;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierInstance {

	public static void main(String[] args) {

		CyclicBarrier cb = new CyclicBarrier(3, () -> {
			System.out.println("你大爷的");
		});

		for (int x = 1; x <= 7; x++) {
			new Thread(() -> {
				try {
					cb.await();
					System.out.println("该不该" + Thread.currentThread().getName());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}, "t-" + x).start();
		}

	}

}

