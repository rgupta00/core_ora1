package com.day3.session1;
import java.util.*;
import java.util.stream.Collectors;
public class C_EmployeeListWithLambadaStream {

	public static void main(String[] args) {
		List<Employee> list=new LinkedList<>();
		
		list.add(new Employee(111, "ganga", 3400));
		list.add(new Employee(196, "raj", 5000));
		list.add(new Employee(16, "raj", 5100));
		list.add(new Employee(671, "ekta", 6000));
		list.add(new Employee(66, "neeta", 7000));
		
		//i want to get the name of peoples who are getting salary more then or eq 5000 in sorted way
		
		//java 8: easy way :)
		List<String>names=
		list.stream().
		filter(e-> e.getSalary()>=5000).sorted(Comparator.comparing(Employee::getSalary).reversed())
		.map(e-> e.getName())
		.collect(Collectors.toList());
		
		names.forEach(name-> System.out.println(name));
		
		
//		//java 7 :(
//		Collections.sort(list, new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return Double.compare(o2.getSalary(), o1.getSalary());
//			}
//		});
//		
//		//now i need to create another arraylist
//		List<String> names= new LinkedList<String>();
//		for(Employee e: list) {
//			names.add(e.getName());
//		}
//	
//		for(String name: names) {
//			System.out.println(name);
//		}

	}

}
