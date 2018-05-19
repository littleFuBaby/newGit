package org.fuys.ownutil.juc;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapInstance {

	public static void main(String[] args) {
		
		// ConcurrentSkipListMap
		Map<String, String> map = new ConcurrentSkipListMap<>();
		map.put("ee", "ee");
		map.remove("ddd");
	}

}

