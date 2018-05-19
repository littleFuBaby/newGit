package org.fuys.ownutil.juc;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetInstance {

	public static void main(String[] args) {
		Set<String> set = new ConcurrentSkipListSet<>();
		set.add("dd");
	}

}
