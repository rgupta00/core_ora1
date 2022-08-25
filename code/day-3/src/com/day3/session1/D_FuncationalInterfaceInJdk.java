package com.day3.session1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class D_FuncationalInterfaceInJdk {
	
	public static void main(String[] args) {
		//Predicate : object -> t/f
		//i want to create a predicate whether no is even or odd
		Predicate<Integer>p1= a->a%2==0;
		
		System.out.println(p1.test(441));
		
		Predicate<String> s1=name-> name.contains("raj");
		System.out.println(s1.test("ekta"));
			
		//BiPredicate
		
		//i want to write a predicate for employee richemp if salary is >=7000
		Predicate<Employee> richEmpPredicate= e-> e.getSalary()>=7000;
			
		//Function convert something into something else
		//fruit --> juice
		//i am only intested about the name of the employee
		Employee emp=new Employee(222, "kapil kumar", 9000);
		
		Function<Employee, String> f=e1-> e1.getName();
		
		System.out.println(f.apply(emp));
		
		//BiFucnation
		
		
		//consumer consume something not return anything: priting the data
		
		Consumer<String> consumer= name->System.out.println(name);
		
		consumer.accept("raj kumar");
		
	}

}






