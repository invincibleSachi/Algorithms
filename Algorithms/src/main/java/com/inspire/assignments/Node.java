package com.inspire.assignments;

public class Node {

    int data;
    Node nextNode;
    Node(int i){
        this.data=i;
        this.nextNode=null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

}
