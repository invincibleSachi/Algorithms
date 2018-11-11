package com.inspire.assignments;

public class SinglyLinkedList {

    Node head=null;
    Node tail=null;
    int size=0;
    SinglyLinkedList(){

    }

    void add (int i){
        if(head==null){
            head=new Node(i);
            tail=head;
        }else {
            Node n=new Node(i);
            tail.setNextNode(n);
            tail=n;
        }
        size++;
    }

    void remove(int i){
        if(size==0 || i<0 || i>size-1){
            return;
        }
        if(i==1 && size==1){
            head=null;
            tail=null;
            size=0;
            return;
        }
        if(i==0){
            head.setNextNode(null);
            head=findNthNode(i+1);
        }else {
            Node n=findNthNode(i);
            Node npre=findNthNode(i-1);
            Node nNxt=findNthNode(i+1);
            if(npre==null || npre==null){
                return;
            }else if(n!=null && npre!=null){
                n.setNextNode(null);
                npre.setNextNode(nNxt);
            }
        }

    }

    Node findNthNode(int i){
        Node n=head;
        if(i==0){
            return n;
        }else if(i>size-1) {
            return null;
        }else {
            while(n!=null && i>0){
                n=n.nextNode;
                i--;
            }
        }
        return n;

    }

    void print(){
        Node n=head;
        while (n!=null){
            System.out.println(n.data);
            n=n.nextNode;
        }
    }


}
