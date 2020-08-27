package com.prasanth.javaEightBasics;

import java.util.Arrays;
import java.util.List;


@FunctionalInterface
interface MyFunctionalInterface
{
	
	public void myBasicMethod();
	
	
	
}

public class LamdaExpressionsEightDemo {

	
	public static void main(String[] args) {
		
	
	MyFunctionalInterface my=()-> System.out.println("New Prop");
	my.myBasicMethod();
	
	List<Integer> data=(List) Arrays.asList(23,67,12,12,67,87,46,87,45);
	data.stream().parallel().forEach(i->System.out.println(i));
	System.out.println("order " );
	data.stream().parallel().forEachOrdered(i->System.out.println(i));
	}
}
