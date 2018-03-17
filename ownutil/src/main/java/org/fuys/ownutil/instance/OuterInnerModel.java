package org.fuys.ownutil.instance;

/**
 * Instance of Inner class of outer class 
 * @author ys
 *
 */
class Outer {
	// static code block
	static{
		outerClassStaticField = "Hello World!!!";
	}
	// private field
	private String outerField;
	// static private field
	private static String outerClassStaticField;
	// constructor method
	public Outer(String outerField){
		this.outerField = outerField;
	}
	// normal inner class
	class Inner1{
		public void getOuterField(){
			System.out.println(Outer.this.outerField);
		}
	}
	// private inner class
	private class Inner2{
		public void getOuterField(){
			System.out.println(Outer.this.outerField);
		}
	}
	// static inner class
	static class Inner3{
		public void getOuterField(){
			System.out.println(Outer.outerClassStaticField);
		}
	}
	
	public void getOuterField(){
		new Inner2().getOuterField();
	}
	
	public static void defineStaticInnerClass(String outerField){
		class Inner{
			public void getOuterField(){
				System.out.println(outerField);
			}
		}
		new Inner().getOuterField();
	}
}

public class OuterInnerModel{
	public static void main(String[] args) {
		new Outer("Hello World!").new Inner1().getOuterField();
		new Outer("Hello World!!").getOuterField();
		new Outer.Inner3().getOuterField();
		Outer.defineStaticInnerClass("Hello World!!!!");
	}
}
