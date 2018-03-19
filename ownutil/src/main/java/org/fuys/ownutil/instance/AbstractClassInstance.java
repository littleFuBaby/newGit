package org.fuys.ownutil.instance;
abstract class A {
	static abstract class B {
		public abstract void print();
	}
}
class C extends A.B {
	@Override
	public void print() {
		System.out.println("C");
	}
}
abstract class D{
	public static void print(){
		System.out.println("D");
	}
}
class E extends D{
}
abstract class F{
	private static class G extends F{
		@Override
		public void print() {
			System.out.println("G");
		}
	}
	public abstract void print();
	public static F getInstance(){
		return new G();
	}
}
abstract class H{
	public H(){
		this.print();
	}
	public abstract void print();
}
class I extends H{
	private String info = "HELLO";
	public I(String info){
		this.info = info;
	}
	@Override
	public void print() {
		System.out.println(this.info);
	}
}
abstract class Model{
	public abstract void work();
	public abstract void think();
	public abstract void supply();
}
class Human extends Model{

	@Override
	public void work() {
		System.out.println("human work");
	}

	@Override
	public void think() {
		System.out.println("human think");
	}

	@Override
	public void supply() {
		System.out.println("human supply");
	}
	
}
class Kindle extends Model{

	@Override
	public void work() {
		System.out.println("kindle work");
	}

	@Override
	public void think() {
	}

	@Override
	public void supply() {
		System.out.println("kindle supply");
	}
	
}
public class AbstractClassInstance {
	public static void main(String[] args) {
		new C().print();
		F.getInstance().print();
		new I("WORLD").print();
	}
}
