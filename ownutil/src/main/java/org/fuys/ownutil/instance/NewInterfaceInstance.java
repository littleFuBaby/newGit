package org.fuys.ownutil.instance;

interface Thing {
	public void perform();
	default void print(){
		System.out.println("JDK1.8 New Character By using dafault");
	}
	static void println(){
		System.out.println("JDK1.8 New Character By using static");
	}
}

class Cup implements Thing {
	
	public static void drink(){
		System.out.println("drink water");
	}
	
	@Override
	public void perform() {
		System.out.println("Interface Define");
	}
}

public class NewInterfaceInstance {
	
	public static void main(String[] args) {
		Thing thing = new Cup();
		thing.perform();
		thing.print();
		Thing.println();
		Cup cup = (Cup)thing;
		cup.perform();
		Cup.drink();
	}

}
