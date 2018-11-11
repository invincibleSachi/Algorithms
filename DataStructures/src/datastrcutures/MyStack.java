package com.inspire.datastrcutures;

/**
 * Created by sachi on 23/6/18.
 */
public class MyStack<T> {
    private int top = -1;
    static final int MAX = 1000;
    T[] a = (T[])new Object[MAX];

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean push(T t) {
        if (top >= MAX) {
            System.out.println("stack full");
            return false;
        } else {
            a[++top] = t;
            return true;
        }
    }

    public T pop() {
        if (top == 0) {
            return null;
        } else {
            return a[top--];
        }
    }

    public T peek() {
        return a[top];
    }

    public void printStack(){
        for (int i=0;i<=top;i++){
            System.out.println(a[i]);
        }
    }
}



