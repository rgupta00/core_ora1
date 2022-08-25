package com.day3.session3.uml;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	private Address address;

	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getAnnualSalary() {
		return salary * 12;
	}

	public int raiseSalary(int percentage) {
		// 100+10
		return salary * (100 + percentage) / 100;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
