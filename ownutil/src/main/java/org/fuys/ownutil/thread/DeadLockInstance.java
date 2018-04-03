package org.fuys.ownutil.thread;

class A {
	public synchronized void say(B b){
		System.out.println("A:你先给我，我才能给你");
		b.get();
	}
	public synchronized void get(){
		System.out.println("A:我给了你，付出了我，什么也不能做");
	}
}
class B {
	public synchronized void say(A a){
		System.out.println("B:你先给我，我才能给你");
		a.get();
	}
	public synchronized void get(){
		System.out.println("B:我给了你，付出了我，什么也不能做");
	}
}
class DeadLock implements Runnable {

	private static A a = new A();
	private static B b = new B();
	public DeadLock(){
		new Thread(this).start();
		b.say(a);
	}
	
	@Override
	public synchronized void run() {
		a.say(b);
	}
	
}
public class DeadLockInstance {

	public static void main(String[] args) {
		new DeadLock();
	}

}
