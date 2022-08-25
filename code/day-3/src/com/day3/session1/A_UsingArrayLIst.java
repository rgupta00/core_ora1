package com.day3.session1;
import java.util.*;
public class A_UsingArrayLIst {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("raj");
		list.add("kapil");
		list.add("anita");
		list.add("pooja");
		
		list.add("ganga");
		list.add("hari");
		
		//fastest op in arraylist
		
		//random access
		
		String data = list.get(2);
		System.out.println(data);
		
		
		
		//how to print them 
		
		//Iterators, pointer in java to iterate through a collection , p=p-> next
		printArrayList(list);
		
		Collections.sort(list);		
		System.out.println("------sorted list ------");
		printArrayList(list);
		
		System.out.println("------searching data using bs: data must be pre sorted ------");
		
		int index= Collections.binarySearch(list, "ekta");
		System.out.println(index);
		// -7+ 1=- 6==> 6
		
		
		//how to print data in reverse orders
		
		ListIterator<String> it2=list.listIterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
//		ListIterator<String> it2=list.listIterator(list.size());
//		while(it2.hasPrevious()) {
//			System.out.println(it2.previous());
//		}
		
		
//		System.out.println("using enhacne for loop");
//		//Enhance for loop java 1.5
//		for(String name: list) {
//			System.out.println(name);
//		}
		
	}

	
	
	 static void printArrayList(List<String> list) {
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
