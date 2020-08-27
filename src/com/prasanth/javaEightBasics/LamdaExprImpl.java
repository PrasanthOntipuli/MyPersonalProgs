package com.prasanth.javaEightBasics;

import java.util.ArrayList;
import java.util.List;

public class LamdaExprImpl extends Parent{

public static void main(String[] args) {
	List<Integer> data=new ArrayList<Integer>();
	data.add(2);
	data.add(3);
	data.add(1);
	data.add(5);
	data.add(0);
	
	data.forEach(i->System.out.println("parent test:: "+i));
}
	
}


class Parent
{
	public void method1()
	{
		System.out.println("parent test 1");
	}
}