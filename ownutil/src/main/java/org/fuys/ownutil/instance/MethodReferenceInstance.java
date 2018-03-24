package org.fuys.ownutil.instance;


@FunctionalInterface
interface Shoe <T> {
	int takeOn(T t1 ,T t2);
}
interface Desk<T> {
	T create(String s,double d);
}

class Phone{
	
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Phone() {
		super();
	}
	public Phone(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
}

public class MethodReferenceInstance {
	
	public static void main(String[] args) {
		// special method reference
		Shoe<String> shoe = String :: compareTo;
		System.out.println(shoe.takeOn("A", "B"));
		
		// constructor method reference
		Desk<Phone> desk = Phone :: new;
		System.out.println(desk.create("MEIZU", 1000.0));
		
	}

}

