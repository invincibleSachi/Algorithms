package com.inspire.datastrcutures;
/**
 * Created by sachi on 23/6/18.
 */
public class MyLinkedListDemo {
    public static void main (String[] args){
        MyLinkedList<String> myList=new MyLinkedList<String>();
        myList.add("Sachchida");
        printall(myList);
        System.out.println("size after addition "+ myList.getSize());
        myList.add("Agam");
        printall(myList);
        System.out.println("size after addition "+ myList.getSize());
        myList.add("Ravi");
        printall(myList);
        System.out.println("size after addition "+ myList.getSize());
        myList.add("Guneet");
        printall(myList);
        System.out.println("size after addition "+ myList.getSize());
        myList.add("Anuj");
        printall(myList);
        System.out.println("size after addition "+ myList.getSize());
        myList.removeFromEnd();
        printall(myList);
        System.out.println("size after removing from end "+ myList.getSize());
        myList.add("Duggu");
        printall(myList);
        System.out.println("size after addition "+ myList.getSize());
        printall(myList);
        System.out.println("item removed "+myList.removeAt(3).getData());

        System.out.println("size after removing from mid "+ myList.getSize());
        printall(myList);

        myList.insertAt("New employee",2);
        System.out.println("size after inserting in mid "+ myList.getSize());
        printall(myList);
    }

    public static void printall(MyLinkedList l){
        for (int i=0;i<l.size;i++){
            System.out.println(l.getAt(i));
        }
    }

    public static void iteratorExample(MyLinkedList l){

    }
}
