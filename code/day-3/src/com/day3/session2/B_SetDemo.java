package com.day3.session2;
import java.util.*;
public class B_SetDemo {
	
	public static void main(String[] args) {
		//HashSet vs LinkedHashSet vs TreeSet
		//HashSet: neigher sorted nor ordered
		//LinkedHashSet: ordered
		//TreeSet: sorted 
		Set<String> set=new TreeSet<String>(( o1,  o2) ->o2.compareTo(o1));
		
		set.add("raj");
		set.add("kapil");
		//set.add(null); TreeSet dont allow null
		set.add("anita");
		set.add("pooja");
		System.out.println(set);
		
		
		
		
	}

}
