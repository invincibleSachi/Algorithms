package com.inspire.assignments;

public class SearchKthNodeInSinglyLinkedList {
    public static void main(String[] args){
        SinglyLinkedList s=new SinglyLinkedList();
        s.add(4);
        s.add(2);
        s.add(1);
        s.add(-1);
        s.add(-2);
        s.print();
        System.out.println(s.size);
        System.out.println("print all nodes "+s.findNthNode(1).data);
        System.out.println("print all nodes "+s.findNthNode(4).data);

    }


}
