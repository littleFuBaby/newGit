package org.fuys.ownutil.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListInstance {

	public static void main(String[] args) {
		
		// ArrayList
		List<String> list = new ArrayList<>();
		list.add("fu");
		list.add("yun");
		list.add("song");
		
		// ListIterator
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		// get()
		// set()
		System.out.println(list.get(1));
		System.out.println("replace index 1 :" + list.set(1,""));
		System.out.println("replace index 2 :" + list.set(2,"andy"));
		
		// Iterator
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		// Vector
		List<String> vector = new Vector<>();
		vector.add("03");
		vector.add("05");
		vector.add("12");
		
		// Iterator
		Iterator<String> itera = vector.iterator();
		while(itera.hasNext()){
			System.out.println(itera.next());
		}
	}
}
