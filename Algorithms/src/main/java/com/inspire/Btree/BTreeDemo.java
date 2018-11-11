package com.inspire.Btree;

public class BTreeDemo {
    public static void main(String[] args){
        BTree btree=new BTree();
        btree.insert(3);
        btree.insert(2);
        btree.insert(1);
        btree.insert(8);
        btree.insert(5);
        btree.insert(6);
        System.out.println(btree.searchNode(9));
        System.out.println("inorder ");
        btree.inorderTraversal();
        System.out.println("preorder ");
        btree.preOrderTraversal();
        System.out.println("postorder ");
        btree.postOrderTraversal();
        System.out.println("At KthDistance");
        btree.printNodesAtKDistance(2);
    }
}
