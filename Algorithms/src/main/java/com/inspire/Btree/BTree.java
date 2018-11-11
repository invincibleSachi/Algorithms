package com.inspire.Btree;

public class BTree {
    Node root;
    BTree(){
        root=null;
    }

    boolean isEmpty(){
        return root==null;
    }

    public void insert(int data){
        root=insert(root,data);
    }

    public Node insert(Node node,int data){
        Node newnode=new Node(data);
        if(node==null){
            return newnode;
        }else if (node.getData()>=data){
            node.setLeft(insert(node.getLeft(),data));
        }else {
            node.setRight(insert(node.getRight(),data));
        }
        return node;
    }

    public boolean searchNode(int n){
        Node resultNode=searchNode(root,n);
        if(resultNode==null){
            return false;
        }else return (resultNode.getData()==n);
    }

    public Node searchNode (Node node,int n){
        if(node==null){
            return null;
        }else if(node.getData()>n){
            return node.getLeft();
        }else if(node.getData()<n){
            return node.getRight();
        }
        else if (node.getData()==n){
            return node;
        }else return null;

    }
    public void inorderTraversal(){
        inorderTraversal(root);
    }

    public void preOrderTraversal(){
        preOrderTraversal(root);
    }

    public void postOrderTraversal(){
        postOrderTraversal(root);
    }

    public void inorderTraversal(Node n){
        if (n==null){
            return;
        }
        inorderTraversal(n.getLeft());
        System.out.println(n.getData());
        inorderTraversal(n.getRight());
    }

    public void preOrderTraversal(Node n){
        if (n==null){
            return;
        }
        System.out.println(n.getData());
        inorderTraversal(n.getLeft());
        inorderTraversal(n.getRight());
    }

    public void postOrderTraversal(Node n){
        if (n==null){
            return;
        }

        inorderTraversal(n.getLeft());
        inorderTraversal(n.getRight());
        System.out.println(n.getData());
    }

    public void printNodesAtKDistance(int k){
        printNodesKDistance(root,k);
    }

    public void printNodesKDistance(Node n,int k){
        if(n==null){
            return;
        }
        if (k==0) {
            System.out.println(n.getData());
        }else{
            printNodesKDistance(n.getLeft(),k-1);
            printNodesKDistance(n.getRight(),k-1);
        }
    }
}
