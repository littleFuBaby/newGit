package org.fuys.ownutil.juc;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArrayListInstance {

	public static void main(String[] args) {
		
		// CopyOnWriteArrayList
		CopyOnWriteArrayList<String> cwal = new CopyOnWriteArrayList<>();
		cwal.add("234");
		cwal.add("234535");
		cwal.add("234535");
		System.out.println(cwal.toString());
		System.out.println(cwal.get(3));
		
		// CopyOnWriteArraySet
		CopyOnWriteArraySet<String> cwas = new CopyOnWriteArraySet<>();
		cwas.add("dd");
		cwas.add("dd6");
		cwas.add("dd4");
		cwas.add("dd2");
		System.out.println(cwas);
	}
}

