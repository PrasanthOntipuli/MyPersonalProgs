package com.prasanth.module.Rouge;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;


public class LinkedListStruct<T> implements Serializable, Cloneable {
	private static final long serialVersionUID = -8956337161364858688L;
    
	
	private Node<T> head;
	private Node<T> tail;
	private Integer length=0;
	
	
	public Node<T> getHead() {
		return head;
	}
	
	@SuppressWarnings({ "unchecked", "unused" })
	private LinkedListStruct<T> cloneLinkedListStruct()
	{
		  try {
			return (LinkedListStruct<T>) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
    public LinkedListStruct<T> clone()
    {
    	return this.cloneLinkedListStruct();
    }
	public void setHead(Node<T> head) {
		this.head = head;
	}

	public <T> Object getTail() {
		if(tail.data==null)
		{
			return null;
		}
		return tail.data;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public  Integer getLength() {
		return length;
	}

	public  void setLength(Integer length) {
		this.length = length;
	}

	@SuppressWarnings("unchecked")
	public <T> void add(Object data)
	{
		if(data==null)
		{
			return;
		}
		data.getClass();
		Node newElement=new Node<>();
		Node temp=new Node<>();

		newElement.setData(data);
		if(this.head==null)
		{
			head=newElement;
			
		}else{
			 temp =head;
			while (temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newElement;
            newElement.Prev=temp; 
		}
		tail=temp.next;
		length++;
	}
	
	public void getLinkedList()
	{
		Node temp=head;
		while(temp!=null){
		Node dataP=temp.getPrev();
		Node dataN=temp.getNext();
		Object prevData=null;
		Object nextData=null;
		if(dataP!=null)
		{
			 prevData=temp.getPrev().getData();
		}
		if(dataN!=null)
		{
			nextData=temp.getNext().getData();
		}
		System.out.println("current"+temp.getData()+"  prev"+prevData+"  next"+nextData);
		temp=temp.next;
		}
	}
	
	public LinkedListStruct<T> insertAlternate(LinkedListStruct<T> data) {
		Node<Integer> l1 = (LinkedListStruct<T>.Node<Integer>) this.getHead();
		Node<Integer> l2 = (LinkedListStruct<T>.Node<Integer>) data.getHead().getNext();
		Node<Integer> temp1 =null;
		Node<Integer> temp2 =null;
		
		Boolean flagSwitch = true;
		while (l1.getNext() != null || l2.getNext() != null) {
			temp1=l1.getNext();
			l1.next=l2;
			temp2=l2.next;
			l2.next=temp1;
			
		}
		return null;
	}	
	
	
	
	
	private class Node<T>
	{
		T data;
		Node next;
		Node Prev;
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Node getPrev() {
			return Prev;
		}
		public void setPrev(Node prev) {
			Prev = prev;
		}
	}
	
	 Node doWork(Node head) 
	  {
	    Node p,q;
	    if ((head == null) || (head.next == null)) 
	      return head;
	    q = null; p = head;
	    while (p.next !=null) 
	    {
	      q = p;
	      p = p.next;
	    }
	   
	    return head;
	  }
	 
	 void doWork()
	 {
		  Node n1=new Node ();
	       Node n2=new Node ();
	       n1.setData(3);
	       n2.setData(4);
	       n1.next=n2;
	       n2.next=n1;
	       n1.next=null;
	       n1=null;
		 System.out.println(n2.getData()+"n1 "+n2.getNext().getData());
	 }
	 public static void main(String a[]){
		 
                         int i, j;
                         String key;
                         String[] letters = {"E","D","C","B","A","B"};
                         for (j = 1; j < letters.length; j++)
                         {
                                         key = letters[j];
                                         i = j - 1;
                                         while (i >= 0)
                                         {
                                                         if (key.compareTo(letters[i]) > 0)
                                                         {
                                                                         break;
                                                         }
                                                         letters[i + 1] = letters[i];
                                                         i--;
                                         }
                                         letters[i + 1] = key;
                         }
                         for (int t = 0; t < letters.length; t++)
                         {
                                         System.out.print((letters[t]) + "");
                         }
       }
}
