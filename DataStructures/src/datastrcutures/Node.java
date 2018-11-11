package com.inspire.datastrcutures;

/**
 * Created by sachi on 23/6/18.
 */
public class Node<T> {
    private T data=null;
    private Node nextNode=null;
    private Node previousNode=null;
    public Node(T t){
        this.data=t;
        this.nextNode=null;
        this.previousNode=null;
    }

    public void setNext(Node n){
        this.nextNode=n;
    }

    public void setPreviousNode(Node n){
        this.previousNode=n;
    }

    public T getData(){
        return data;
    }

    public Node getNextNode(){
        return nextNode;
    }

    public Node getPreviousNode(){
        return previousNode;
    }
}
