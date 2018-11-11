package com.inspire.datastrcutures;

public class IntersectionListImpl {

	public static void main(String[] args) {
		IntersectingLinkedList l1=new IntersectingLinkedList();
		l1.insertLast(3);
		l1.insertLast(1);
		l1.insertLast(2);
		l1.insertLast(11);
		l1.insertLast(12);
		IntersectingLinkedList l2=new IntersectingLinkedList();
		
		l2.insertLast(40);
		l2.insertLast(41);
		l1.intersect(l2, 2);
		System.out.println("l1 printing");
		l1.printLinkedList();
		System.out.println("l2 printing");
		l2.printLinkedList();
		
		

	}

}
