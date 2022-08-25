package com.day3.session2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.day3.session1.Employee;

public class C_SetOfEmployeeObjects {

	public static void main(String[] args) {
		
		Comparator<Employee> compareAsPerSalary=( o1,  o2) ->Double.compare(o2.getSalary(), o1.getSalary());
			
	
		Set<Employee> list = new TreeSet<>(compareAsPerSalary);

		list.add(new Employee(111, "ganga", 3400));

		list.add(new Employee(196, "raj", 5000));
		list.add(new Employee(16, "raj", 5100));
		list.add(new Employee(671, "ekta", 6000));
		list.add(new Employee(66, "neeta", 7000));
		
		Iterator<Employee> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}





