package com.inspire.datastrcutures;
/**
 * Created by sachi on 22/6/18.
 */
public class MyArrayListDemo {

    public static void main(String[] args){
        MyArrayList<String> myList=new MyArrayList<String>();
        myList.add("Sachchida");
        myList.add("Agam");
        myList.add("Ravi");
        myList.add("Guneet");
        myList.add("Anuj");
        myList.add("Sachchida");
        myList.add("Agam");
        myList.add("Ravi");
        myList.add("Guneet");
        myList.add("Anuj");
        myList.add("Sachchida");
        myList.add("Agam");
        myList.add("Ravi");
        myList.add("Guneet");
        myList.add("Anuj");
        myList.printList();
        myList.remove(1);
        System.out.println("after removing");
        myList.printList();
    }
}
