package com.day3.session2;

import java.util.*;
import java.util.Map.Entry;

public class E_DemoMap {

	public static void main(String[] args) {
		Map<Integer, String> info = new HashMap<Integer, String>();
		info.put(3, "raj");
		info.put(3, "rajiv");
		info.put(30, "ekta");
		info.put(11, "gunika");
		info.put(993, "ganga");

		info.forEach((k, v)-> System.out.println(k+" : "+ v));
		
		
		// System.out.println(info);

		// how to iterate though collection
		// keyset vs entryset(better performance) vs java 8 streams way

//		Set<Integer> keySet = info.keySet();
//		
//		for(Integer key: keySet) {
//			System.out.println(key +" : "+ info.get(key));
//		}

//		Set<Entry<Integer, String>> entrySet = info.entrySet();
//
//		for(Entry<Integer, String> entry: entrySet) {
//			System.out.println(entry.getKey() + " : "+ entry.getValue());
//		}
	}

}
