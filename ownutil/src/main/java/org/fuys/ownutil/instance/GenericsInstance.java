package org.fuys.ownutil.instance;

class Generics <T> {
	
	private T t ;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public Generics(T t){
		this.t = t;
	}
	
	@Override
	public String toString(){
		return this.t.toString();
	}
	
}

public class GenericsInstance {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Generics g = new Generics("++");
		System.out.println(g);
	}
}
