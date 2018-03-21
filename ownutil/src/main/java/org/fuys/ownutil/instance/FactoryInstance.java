package org.fuys.ownutil.instance;

interface Woman {

	void fallInLove();

}

class WesternWoman implements Woman {

	@Override
	public void fallInLove() {
		System.out.println("************ fall in love with Western woman **********");
	}

}

class JapaneseWoman implements Woman {

	@Override
	public void fallInLove() {
		System.out.println("************ fall in love with Japanese woman **********");
	}

}

class KoreanWoman implements Woman{

	@Override
	public void fallInLove() {
		System.out.println("************ fall in love with korean woman **********");
	}
	
}

class FactoryWoman {

	public static Woman getInstance(String woman) {
		Woman newWoman = null;
		String className = transferClassName(woman);
		try {
			if(className != null){
				newWoman = (Woman) Class.forName(className).newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newWoman;
	}
	
	/**
	 * just small transfer method
	 * suggest that don't write it in Factory class
	 * @param woman
	 * @return
	 */
	private static String transferClassName(String woman){
		String className = null;
		switch (woman) {
		case "west":
			className = "org.fuys.ownutil.instance.WesternWoman";
			break;
		case "japan":
			className = "org.fuys.ownutil.instance.JapaneseWoman";
			break;
		case "korea":
			className = "org.fuys.ownutil.instance.KoreanWoman";
			break;
		default:
			break;
		}
		return className;
	}

}

public class FactoryInstance {
	
	public static void main(String[] args) {
		Woman woman = FactoryWoman.getInstance("korea");
		if(woman!=null){
			woman.fallInLove();
		}
	}

}
