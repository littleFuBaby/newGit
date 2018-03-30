package org.fuys.ownutil.inheritance;

/**
 * Notice difference between extending class relationship 
 * and simple java class implementing relationship different tables
 * @author ys
 *
 */
class SuperClass{
	public final static String INFO = "static info";
	private static String secondName;
	private String firstName;
	static{
		secondName = "fu";
	}
	public SuperClass(){
	}
	public SuperClass(String firstName){
		this.firstName = firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public static String getSecondName(){
		return secondName;
	}
	public String getFullName(){
		return this.firstName + " " + secondName;
	}
	void showFullName(){
		System.out.println("Full Name From SuperClass--> " + this.firstName + " " + secondName);
	}
}
class SubClass extends SuperClass{
	public SubClass(){
	}
	public SubClass(String firstName){
		this.setFirstName(firstName);
	}
	@SuppressWarnings("static-access")
	void showFullName(){
		System.out.println("Full Name From SubClass--> " + this.getFirstName() + " " + getSecondName());
		System.out.println(this.INFO);
		System.out.println(this);
		// illegal
		// System.out.println(super);
	}
}
class SubSubClass extends SubClass{
	public SubSubClass(){
	}
	public SubSubClass(String firstName){
		this.setFirstName(firstName);
	}
	/*
	 * Incompatible showFullName comparing with same method from superClass.
	 * Because of return value type.
	public boolean showFullName(){
		System.out.println("Full Name From SubSubClass--> " + this.getFirstName() + " " + getSecondName());
		return true;
	}
	*/
	public void showFullName(){
		System.out.println("Full Name From SubSubClass--> " + this.getFirstName() + " " + getSecondName());
	}
}
public class ExtendsInstance {
	
	public static void main(String[] args) {
		SubSubClass subSub = new SubSubClass("ruyi");
		subSub.showFullName();
	}

}
