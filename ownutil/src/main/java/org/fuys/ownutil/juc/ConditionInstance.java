package org.fuys.ownutil.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;





public class ConditionInstance {

	public static void main(String[] args) {
		
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
		lock.lock(); // 不进行锁定，则会报出IllegalMonitorStateException
		try {
			new Thread(() -> {
				try {
					lock.lock(); // 再次细分的线程，需要锁定，否则报出IllegalMonitorStateException
					condition.signal();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}).start();
			condition.await(); // 等待唤醒
			System.out.println("++++精确控制");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}

}
