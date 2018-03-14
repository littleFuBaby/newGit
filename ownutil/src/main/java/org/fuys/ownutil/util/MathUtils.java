package org.fuys.ownutil.util;

import java.util.UUID;

public class MathUtils {

	public static void main(String[] args) {
		// 0 ~ 2<sup>31-1
		int max = Integer.MAX_VALUE;
		// -2<sup>31
		int min = Integer.MIN_VALUE;
		System.out.println(max);
		System.out.println(min);
		System.out.println(max + 1l);
		System.out.println((int)(max + 1l));
		System.out.println((int)(max + 1l - 1));
//		UUID.randomUUID();
	}

}
