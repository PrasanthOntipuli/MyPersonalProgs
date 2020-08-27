package com.prasanth.basicProgs;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapPrograms {

	@SuppressWarnings("unchecked")
	public static HashMap sortHashByKey(HashMap<String, String> data) {
		List list = new LinkedList<Object>(data.entrySet());

		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}

		});

		HashMap sortedMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Entry) it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	public static String checkBinaryConverter(int myBinary) {
		int localNum = myBinary;
		int baseValue = 2;
		boolean switchFalg = false;
		int count = 0;
		while (true) {

			if (switchFalg) {
				char[] data = new char[count];
				if (baseValue > myBinary) {
					data[count] = '1';
					myBinary = baseValue - myBinary;
				} else {
					data[count] = '0';
				}
				baseValue = baseValue / 2;
				count--;
			}
			if (myBinary > baseValue) {
				baseValue = baseValue * 2;
				// count
				count++;
			} else {
				switchFalg = true;
			}

		}

	}

	public void checkSwap(HashMap<String, Integer> data) {

		data.keySet();

	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> myData = new HashMap<>();

		Integer one = 1;
		Integer two = 2;
		// String one="One";
		// String two="Two";
		String temp = "";
		myData.put(one, 1);
		myData.put(two, 2);
		// two=one+5;
		System.out.println((myData.get(1) == one) + "two" + (myData.get(two) == two));
		System.out.println(myData.entrySet().toString());

		HashMap<Student,Integer> listStudents=new HashMap<Student,Integer>();
		
		Student s1=new Student(1,"Sarada", 12);
		Student s2=new Student(2,"syam",57);
		listStudents.put(s1, 12);
		listStudents.put(s2, 13);
//		System.out.println(listStudents.get.hashCode()==s1.hashCode());
//		
//		System.out.println(listStudents.get(s2).hashCode()==s2.hashCode());
//		

		int s11=s1.hashCode();
		int s22=s2.hashCode();
		Student s3=s1;
		s1=s2;
		s2=s3;
		System.out.println(s11==s2.hashCode());
		System.out.println(s22==s1.hashCode());

		

		
//		System.out.println("Check");


		for(Map.Entry<Student, Integer> entry: listStudents.entrySet())
		{
			if(entry.getKey().getId()==12)
			System.out.println(entry.getKey().hashCode()==s1.hashCode());
			
			if(entry.getKey().getId()==57)
			System.out.println(entry.getKey().hashCode()==s2.hashCode());
		}

	  }
}
//9632324093


class Student
{
	private Integer id;
	private String name;
	private long   marks;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer id, String name, long marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMarks() {
		return marks;
	}
	public void setMarks(long marks) {
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		final int prime = 6;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (int) (marks ^ (marks >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
}