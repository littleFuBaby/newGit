package org.fuys.ownutil.instance;

interface X{
	void print();
}
interface Y{
	void print();
}
class Z implements X,Y{

	@Override
	public void print() {
		System.out.println("Z");
	}
	
}
abstract class XX implements X,Y{
	
}
public class InterfaceInstance {
	public static void main(String[] args) {
		
		
		
		X x = new Z();
		Y y = (Y)x;
		y.print();
		System.out.println(x instanceof X);
		System.out.println(x instanceof Y);
	}

}
