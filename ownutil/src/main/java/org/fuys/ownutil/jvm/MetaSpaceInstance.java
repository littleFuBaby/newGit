package org.fuys.ownutil.jvm;

public class MetaSpaceInstance {

	public static void main(String[] args) {
		// perm/metaspace OOM
		String str = "www.chinal.com";
		while(true){
			str += str + str;
			str.intern();
		}
	}

}
