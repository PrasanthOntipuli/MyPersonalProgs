package com.prasanth.javaEightBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JavaEightStreems {

	public static void main(String[] args) {

		// List<String> data=new ArrayList<>();
		// data.add("er");
		// data.add("qw");
		// data.add("dd");
		// data.add("wq");
		// data.add("qw");
		// data.add("er");
		// data.add("ww");
		// data.add("wwe");
		// data.add("wwf");
		// System.out.println( data.stream().anyMatch(n->"ddd".equals(n)));
		// System.out.println( data.stream().noneMatch(n->"ddd".equals(n)));
		//
		//
		// //palindrome
		// String pal1="RAMAR";
		// String pal2="USAUSB";
		// int len1=pal1.length();
		// int len2=pal2.length();
		// Boolean
		// isPal1=IntStream.range(0,len1/2).noneMatch(i->pal1.charAt(i)!=pal1.charAt(len1-1-i));
		// Boolean
		// isPal2=IntStream.range(0,len2/2).allMatch(i->pal2.charAt(i)==pal2.charAt(len2-1-i));
		// System.out.println(isPal1);
		// System.out.println(isPal2);
		// int num=241;
		// System.out.println(!IntStream.rangeClosed(2,num/2
		// ).anyMatch(i->num%i==0));
		//
		HashMap<Integer, String> datam=new HashMap<>();
		datam.put(1, "apple");
		datam.put(1, "orange");
		System.out.println("int "+datam.size());
		//datam.
		List<Employee> listEmployees = new ArrayList<Employee>();

		HashMap<Employee, Integer> data=new HashMap<Employee, Integer>();
		Employee emp1=new Employee(1,"name1",6762,new Employee(),"cse");
		Employee emp2=new Employee(1,"name1",6762,new Employee(),"cse");
//		Employee emp2=new Employee(2,"name2",6762,emp1,"cse");
		Employee emp3=new Employee(3,"name3",6762,emp2,"cse");
		Employee emp4=new Employee(4,"name4",6762,emp3,"cse");

		


		data.put(emp1, 1);
		data.put(emp2, 2);
		data.put(emp3, 3);
		data.put(emp4, 4);

	System.out.println(	data.get(emp1)+"data"+data.get(emp2));


		System.out.println(data.size());




		data.put(new Employee(), 1);


		listEmployees.add(new Employee());
		listEmployees.add(new Employee());
		listEmployees.add(new Employee());
		listEmployees.add(new Employee());
		listEmployees.add(new Employee());
		listEmployees.add(new Employee());
		listEmployees.add(new Employee());
		listEmployees.add(new Employee());

		System.out.println(listEmployees.stream().allMatch(e -> e.equals(new Employee())));



	}
}

class Employee {
	private int id;
	private String name;
	private long salary;
	private Employee boss;
	private String department;

	public Employee() {
		super();
	}

	public Employee(int id, String name, long salary, Employee boss, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.boss = boss;
		this.department = department;
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

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Employee getBoss() {
		return boss;
	}

	public void setBoss(Employee boss) {
		this.boss = boss;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boss == null) ? 0 : boss.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (salary ^ (salary >>> 32));
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
		if (boss == null) {
			if (other.boss != null)
				return false;
		} else if (!boss.equals(other.boss))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	

}