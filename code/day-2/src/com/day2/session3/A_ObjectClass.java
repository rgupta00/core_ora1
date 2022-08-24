package com.day2.session3;

public class A_ObjectClass {
	
	public static void main(String[] args) {
		Employee employee1=new Employee(1, "raj", 6000);
		Employee employee2=new Employee(1, "raj", 6000);
		
		
		if(employee1.equals(employee2)) {
			System.out.println("are eq");
		}else
			System.out.println("not eq");
		
		
		//compare the add of object not the contents
//		if(employee1==employee2) {
//			System.out.println("are same");
//		}else
//			System.out.println("not eq");
		
		//System.out.println(employee);
		//employee.print();
	}

}
