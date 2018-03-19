package org.fuys.ownutil.instance;

class Singleton1 {

	private static final Singleton1 SINGLE = new Singleton1();

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		return SINGLE;
	}

}

class Singleton2 {

	private static Singleton2 single = null;

	private Singleton2() {
	}

	public static Singleton2 getInstance() {
		if (single == null) {
			single = new Singleton2();
		}
		return single;
	}

}

class Gender {
	public static final String MALE = "man";
	public static final String FEMALE = "woman";
	private String name;
	public static Gender man;
	public static Gender woman;

	private Gender(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}

	public static Gender getInstance(String gender) {
		switch (gender) {
		case "man":
			if(man == null){
				man = new Gender("man");
			}
			return man;
		case "woman":
			if(woman == null){
				woman = new Gender("woman");
			}
			return woman;
		default:
			return null;
		}
	}
}

public class SingletonInstance {
	public static void main(String[] args) {
		// single
		Singleton1 s1 = Singleton1.getInstance();
		Singleton2 s2 = Singleton2.getInstance();
		System.out.println(s1.toString().equals(s2.toString()));
		// many singles
		Gender man = Gender.getInstance(Gender.MALE);
		System.out.println(man.getName());
	}
}
