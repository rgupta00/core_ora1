package com.day3.session3.java9features;
import java.util.*;
public class B_UnmodificableCollection {
	
	public static void main(String[] args) {
		
		
//		List<String> list=List.of("raj","ekta","ravi");
//		System.out.println(list);
//		list.add("foo");
		
//		Set<String> list=Set.of("raj","ekta","ravi");
//		System.out.println(list);
//		list.add("foo");
		
		Map<String, String>map=Map.of("raj","delhi","ravi","banglore");
		map.forEach((k,v)-> System.out.println(k +" : "+ v));
	}

}
