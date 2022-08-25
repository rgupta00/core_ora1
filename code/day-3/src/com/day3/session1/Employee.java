package com.day3.session1;
//Comparator

import java.util.Comparator;

class EmployeeSorterAsPerNameAndAsPerSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int val= o1.getName().compareTo(o2.getName());
		if(val==0) {
			val= Double.compare(o2.getSalary(), o1.getSalary());
		}
		return val;
	}
	
}

class EmployeeSorterAsPerSalary implements Comparator<Employee>{

	//jvm will call this method
	// 				o1				o2
	@Override
	public int compare(Employee e1, Employee e2) {
		return Double.compare(e2.getSalary(), e1.getSalary());
	}
	
}


class EmployeeSorterAsPerName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}


public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double salary;

	// why hashcode is imp method ?

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void print() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	//java will call this method
	//e1.compaeTo(e2)
	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.getId(), o.getId());
	}

}





