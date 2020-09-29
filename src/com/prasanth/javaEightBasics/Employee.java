package com.prasanth.javaEightBasics;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private int employeeId;
	private String lastName;
	private String firstName;
	private long salary;
	private Employee manager;


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String lastName, String firstName, long salary) {
		super();
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
		this.manager = manager;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", salary=" + salary + "\n \t manager"+manager+"]\n";
	}
	
	public static List<Employee> getEmployeeDetails()
	{
		List<Employee> data=new ArrayList<Employee>();
		Employee e1 = new Employee(1, "oneFirst", "oneLast", 2313);
		Employee e2 = new Employee(2, "twoFirst", "twoLast", 2313);
		Employee e3 = new Employee(3, "threeFirst", "threeLast", 2313);
		Employee e4 = new Employee(4, "fourFirst", "fourLast", 2313);
		Employee e5 = new Employee(5, "fiveFirst", "fiveLast", 2313);
		
		Employee e6 = new Employee(6, "sixFirst", "sixLast", 2313); e6.setManager(e1);
		Employee e7 = new Employee(7, "sevenFirst", "sevenLast", 2313); e7.setManager(e2);
		Employee e8 = new Employee(8, "eightFirst", "eightLast", 2313);
		Employee e9 = new Employee(9, "nineFirst", "nineLast", 2313);
		Employee e10 = new Employee(10, "tenFirst", "tenLast", 2313);e10.setManager(e1);
		Employee e11 = new Employee(11, "elevenFirst", "elevenLast", 2313);e11.setManager(e4);
		Employee e12 = new Employee(12, "twevelFirst", "twevelLast", 2313);e12.setManager(e1);
		data.add(e6);
		data.add(e7);
		data.add(e8);
		data.add(e9);
		data.add(e10);
		data.add(e11);
		data.add(e12);
		data.add(e1);
		data.add(e2);
		data.add(e3);
		data.add(e4);
		data.add(e5);
		Employee e13 = new Employee(13, "13First", "13Last", 2313);e13.setManager(e6);
		Employee e14 = new Employee(14, "14First", "14Last", 2313);
		Employee e15 = new Employee(15, "15First", "15Last", 2313);e15.setManager(e9);
		Employee e16 = new Employee(16, "16First", "16Last", 2313);e16.setManager(e11);
		data.add(e13);
		data.add(e14);
		data.add(e15);
		data.add(e16);
		
		
		return data;
	}

}
