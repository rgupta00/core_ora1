package com.day3.session3.uml;

public class HowToImplementUMLClassDiagram {
	
	public static void main(String[] args) {
		Address address=new Address("34 BTM", "banglore", "45445454");
		Employee employee=new Employee(33, "raj", "gupta", 7000);
		employee.setAddress(address);
		
		System.out.println(employee);
	}

}
