package com.prasanth.javaEightBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaEightStreems {

	
	public static void main(String[] args) {
		System.out.println(sortUsingComparator(Employee.getEmployeeDetails()));
	}
	
	//sort by using comparator
	public static List<Employee>  sortUsingComparator(List<Employee> data)
	{
		Stream<Employee> sortEmployees=data.stream().sorted((e1,e2)->e1.getFirstName().compareTo(e2.getFirstName()));
		return  sortEmployees.collect(Collectors.toList());
	}
	
	// getAllEmployees who has boss
	public static List<Employee> getTheSubEmployees(List<Employee> employees)
	{
		employees.stream().filter();
		return null;
	}
	
//	data.stream().sorted((emp1, emp2) -> emp1.getFirstName().compareToIgnoreCase(emp2.getFirstName()))
//	.forEach(System.out::println);
	
	
	public static void numbMethod(String avr) {

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
		List<Employee> listEmployees= Employee.getEmployeeDetails();

		

		
		System.out.println(listEmployees.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));


	}
}
