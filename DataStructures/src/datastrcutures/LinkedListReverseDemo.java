package com.inspire.datastrcutures;

public class LinkedListReverseDemo {

	public static void main(String[] args) {
		MyLinkedList<Integer> s=new MyLinkedList<Integer>();
		s.add(4);
		s.add(14);
		s.add(2);
		s.add(5);
		s.add(7);
		s.add(8);
		
		System.out.println("before reverse "+s.toString());
		s.reverseLinkedList();
		System.out.println("after reverse "+s.toString());
		

	}

}
