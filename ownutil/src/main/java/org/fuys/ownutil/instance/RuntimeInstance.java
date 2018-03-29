package org.fuys.ownutil.instance;

import java.util.Random;

public class RuntimeInstance {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.maxMemory() / (double)1024 / 1024);
		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());
		System.gc();
		System.out.println(runtime.maxMemory());
		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());
		runtime.gc();
		System.out.println(runtime.maxMemory());
		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());
		// perm/metaspace OOM
		String str = "www.chinal.com";
		while(true){
			str = str + new Random().nextInt(99999);
			str.intern();
		}
	}

}
