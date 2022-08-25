package com.day3.session2;
import java.util.*;
public class A_PeformanceBWALAndLL {
	
	public static void main(String[] args) {
		//AL: growable array
		//LL: doubly ll  
		
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l2=new LinkedList<Integer>();
		
		calculateTimining(l2);
		
	}

	//time taken is : 2228 ms for AL
	//time taken is : 23 ms
	 static void calculateTimining(List<Integer> list) {
		//10 power 5
		 long start= System.currentTimeMillis();
		 
		 for(int i=0;i<1E5;i++) {
			 list.add(i);
		 }
		 
		 for(int i=0;i<1E5;i++) {
			 list.add(0, i);
		 }
		 
		 long end= System.currentTimeMillis();
		System.out.println("time taken is : "+(end-start)+" ms");
	}

}
