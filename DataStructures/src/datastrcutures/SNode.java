package com.inspire.datastrcutures;

public class SNode {
	int data;
	SNode nextNode;
	public SNode(int data) {
		this.data=data;
		nextNode=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public SNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(SNode nextNode) {
		this.nextNode = nextNode;
	}


}
