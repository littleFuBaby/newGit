package org.fuys.ownutil.instance;

import java.util.Calendar;

public class StringInstance {
	
	public static void main(String[] args) {
		
		System.out.println(Calendar.getInstance().getTimeInMillis());
		System.out.println(System.currentTimeMillis());
		
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.insert(0, "--"));
		StringBuilder s = new StringBuilder("world");
		System.out.println(s.insert(0, "++"));
		System.out.println(Runtime.getRuntime().maxMemory());
		
	}

}
