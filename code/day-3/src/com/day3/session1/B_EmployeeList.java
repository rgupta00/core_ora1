package com.day3.session1;
import java.util.*;
public class B_EmployeeList {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(111, "ganga", 3400));
	
		list.add(new Employee(196, "raj", 5000));
		list.add(new Employee(16, "raj", 5100));
		list.add(new Employee(671, "ekta", 6000));
		list.add(new Employee(66, "neeta", 7000));
		
		
		
		printEmpList(list);
		
		//i want to sort them as per id
		Collections.sort(list);
		System.out.println("----sortig as per id---------");
		printEmpList(list);
		
		//i want to sort as per name
		
		//EmployeeSorterAsPerName
		
		Collections.sort(list, new EmployeeSorterAsPerName());
		System.out.println("----sortig as per name--------");
		printEmpList(list);
		
		
		Collections.sort(list, new EmployeeSorterAsPerSalary());
		System.out.println("----sortig as per salary--------");
		printEmpList(list);
		
		//how to print them 
//		for(Employee e: list) {
//			System.out.println(e);
//		}
	}

	private static void printEmpList(List<Employee> list) {
		Iterator<Employee> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
