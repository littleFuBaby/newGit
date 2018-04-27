package org.fuys.ownutil.juc;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;

class AtomicModel {
	
	private volatile long id;
	private String info;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public AtomicModel(long id, String info) {
		super();
		this.id = id;
		//  π”√AtomicLongFieldUpdater¿‡
		AtomicLongFieldUpdater alfu = AtomicLongFieldUpdater.newUpdater(AtomicModel.class, "id");
		alfu.compareAndSet(this, this.id, 1000);
		this.info = info;
	}
	@Override
	public String toString() {
		return "AtomicModel [id=" + id + ", info=" + info + "]";
	}
}

public class AtomicInstance {

	public static void main(String[] args) {
		// AtomicLong
		AtomicLong al = new AtomicLong(99);
		System.out.println("initial value:" + al);
		al.incrementAndGet();
		System.out.println("incrementAndGet value:" + al);
		al.decrementAndGet();
		System.out.println("decrementAndGet value:" + al);
		al.compareAndSet(99, 200);
		System.out.println("compareAndSet value:" + al);
		
		// AtomicReference
		AtomicModel am1 = new AtomicModel(100, "demo");
		AtomicModel am2 = new AtomicModel(200, "change");
		AtomicReference<AtomicModel> ar = new AtomicReference<AtomicModel>(am1);
		System.out.println("init reference --> " + ar);
		ar.compareAndSet(am2, am2);
		System.out.println("first change reference --> " + ar);
		ar.compareAndSet(am1, am2);
		System.out.println("second change reference --> " + ar);
		
		// AtomicLongFieldUpdater
		AtomicModel am = new AtomicModel(100, "okay");
		System.out.println(am);
	}

}
