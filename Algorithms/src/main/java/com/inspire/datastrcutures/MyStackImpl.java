package com.inspire.datastrcutures;

/**
 * Created by sachi on 23/6/18.
 */
public class MyStackImpl {
    public static void main (String[] args){
        MyStack<String> st= new MyStack<String>();
        st.push("A");
        st.push("B");
        st.push("C");
        st.push("D");
        st.pop();
        st.printStack();
        System.out.println();
    }
}
