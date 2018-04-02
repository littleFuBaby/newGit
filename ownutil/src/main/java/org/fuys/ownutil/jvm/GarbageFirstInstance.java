package org.fuys.ownutil.jvm;

public class GarbageFirstInstance {

	public static void main(String[] args) {
		String str = "GarbageFirst";
		while(true){
			str += str + str;
		}
	}
}
