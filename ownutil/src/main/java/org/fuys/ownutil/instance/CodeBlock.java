package org.fuys.ownutil.instance;

/**
 * Code Block instance
 * @author ys
 *
 */
public class CodeBlock {
	public CodeBlock(){
		System.out.println("Constructor Method");
	}
	{
		// Constructor Code Block
		// Higher privilege than Constructor Method
		// Used many times when object is instantiated
		System.out.println("Constructor Code Block");
	}
	static{
		// Static Code Block
		// Higher privilege than Constructor Code Block
		// Used first time when class is used
		System.out.println("Static Code Block");
	}
	public void getInfo(){
		{
			// Normal Code Block
			String info = "Normal Code Block";
			System.out.println(info);
		}
		String info = "Normal Code";
		System.out.println(info);
	}
}
