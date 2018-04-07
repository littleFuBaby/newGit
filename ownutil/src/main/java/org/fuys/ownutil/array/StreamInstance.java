package org.fuys.ownutil.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamInstance {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("fu");
		list.add("fu");
		list.add("yun");
		list.add("yun");
		list.add("song");
		list.add("song");
		Stream<String> stream = list.stream();
//		System.out.println(stream.distinct().count());
		List<String> newList = stream.distinct().map((x) -> x.toUpperCase()).
				filter((x) -> x.contains("U")).collect(Collectors.toList());
		newList.forEach(System.out :: println);
	}

}
