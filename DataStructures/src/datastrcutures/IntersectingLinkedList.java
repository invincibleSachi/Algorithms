package com.inspire.datastrcutures;

public class IntersectingLinkedList {
	
	SNode front=null;
	SNode rear=null;
	int size=0;
	
	public int getsize() {
		return this.size;
	}
	public void insertLast(int data) {
		SNode s=new SNode(data);
		if(front==null) {
			front=s;
			rear=front;
		}else {
			rear.setNextNode(s);
			rear=s;
		}
		size++;
	}
	
	public boolean addAt(int index, int data) {
		SNode previous=front,next=front;
		SNode temp=front;
		SNode n=new SNode(data);
		if(index==0) {
			
			n.setNextNode(front);
			return true;
		}
		if (index<=size && size>1) {
			while(temp.getNextNode()!=null && --index>0) {
				previous=temp;
				temp=temp.getNextNode();
			}
			next=temp.getNextNode();
			if(next!=null) {
				previous.setNextNode(n);
				n.setNextNode(next);
			}else {
				previous.setNextNode(n);
			}
			return true;
		}
		return false;
	}
	
	public void intersect(IntersectingLinkedList l1, int index) {
		SNode temp=front;
		while(temp!=null && index!=0) {
			temp=temp.nextNode;
			index--;
		}
		l1.rear.setNextNode(temp);
	}
	
	public void printLinkedList() {
		SNode temp=front;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.nextNode;
		}
	}
	
	public void checkintersection(IntersectingLinkedList l1) {
		SNode t1=front;
		SNode t2=l1.front;
		while (t1.nextNode!=null) {
			t2=l1.front;
			while(t2.nextNode!=null) {
				if(t1.equals(t2)) {
					System.out.println(t1.data +"equals "+t2.data);
					break;
				}
			}
		}
	}

}
