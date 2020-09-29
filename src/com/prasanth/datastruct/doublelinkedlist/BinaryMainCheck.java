package com.prasanth.datastruct.doublelinkedlist;

import java.util.Arrays;

public class BinaryMainCheck {

	
	public static void main(String[] args) {
		
		BinaryTree<Object> data=new BinaryTree<Object>();
		data.insert("3");
		data.insert("5");
		data.insert(4);
		data.insert(2.3);
		data.insert("l");
		data.insert("e");
		data.insert("y");
		
		
		System.out.println(data);
		
		
	}
}

