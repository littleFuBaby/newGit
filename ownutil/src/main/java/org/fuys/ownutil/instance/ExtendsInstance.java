package org.fuys.ownutil.instance;

/**
 * Notice difference between extending class relationship 
 * and simple java class implementing relationship different tables
 * @author ys
 *
 */
class SuperClass{
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
	void showFullName(){
		System.out.println("Full Name From SubClass--> " + this.getFirstName() + " " + getSecondName());
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
