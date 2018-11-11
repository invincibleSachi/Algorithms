package com.inspire.datastrcutures;

/**
 * Created by sachi on 23/6/18.
 */
public class MyLinkedList<T> {
    protected Node<T> start;
    protected Node<T> end;
    protected int size=0;

    public MyLinkedList(){
        start=null;
        end=null;
        size=0;
    }

    public void add (T t){
        Node<T> n=new Node<T>(t);
        insertAtEnd(n);
    }
    public void insertAtEnd(Node n){
        if (start==null){
            this.start=n;
            this.end=n;
        }else{
            this.end.setNext(n);
            end=n;
            n.setPreviousNode(end);
        }
        size++;
    }

    public Node removeFromEnd(){
        if (size==0){
            return null;
        }else if(size==1){
            Node n=start;
            start=null;
            end=null;
            size=0;
            return n;
        }else {
            Node n1=start;
            Node n2=start.getNextNode();
            while (n2!=null){
                n1=n2;
                n2=n2.getNextNode();
            }
            end=n1;
            size--;
            return n2;
        }
    }

    public boolean isEmpty(){
        return start==null;
    }

    public int getSize(){
        return size;
    }

    public void insertNodeAt(Node n, int pos){
        Node t=start;
        if (pos>size){
            return;
        }else if(pos==size+1){
            end.setNext(n);
            size++;
        }
        else if(start==null){
            start=n;
            end=n;
            size++;
            return;
        }else {
            Node tempNode=getNodeAt(pos-1);
            Node nextNode=tempNode.getNextNode();
            tempNode.setNext(n);
            n.setNext(nextNode);
            n.setPreviousNode(tempNode);
            size++;
        }

    }

    public Node getNodeAt(int index){
        Node tempNode=start;
        int temp=0;
        while (index<size && tempNode.getNextNode()!=null && temp!=index){
            //System.out.println("temp:" + temp);
            tempNode=tempNode.getNextNode();
            temp++;
        }
        return tempNode;
    }

    public Object getAt(int index){
        Node tempNode=start;
        tempNode=getNodeAt(index);
        return tempNode.getData();
    }

    public void insertAt(T data,int pos){
        Node<T> n=new Node<T>(data);
        insertNodeAt(n,pos);
    }

    public Node removeAt(int index){
        if (index>size || size==0){
            return null;
        }else if (size==1){
            Node n=start;
            start=null;
            end=null;
            size--;
            return n;
        }else if (size==index){
            Node n=end;
            end.setNext(end.getPreviousNode());
            size--;
            return n;
        }else {
            Node tempNode=getNodeAt(index);
            Node prevNode=tempNode.getPreviousNode();
            prevNode.setNext(tempNode.getNextNode());
            size--;
            return tempNode;
        }

    }
    
    public Node<T> reverseLinkedList() {
    	Node<T> curr=start;
    	Node<T> prev=null;
    	Node<T> next=null;
    	do {
    		System.out.println("while reversiong "+ curr.getData());
    		next=curr.getNextNode();
    		prev=curr.getPreviousNode();
    		curr.setNext(prev);
    		curr.setPreviousNode(next);
    		curr=next;
    	}while(curr!=null);
    	
    	end.setNext(curr);
    	start=end;
    	return start;
    }
    
    @Override
    public String toString() {
    	String s="[";
    	Node temp=start;
    	while(temp!=null) {
    		s=s+temp.getData()+",";
    		temp=temp.getNextNode();
    	}
    	return s+"]";
    }
    
}
