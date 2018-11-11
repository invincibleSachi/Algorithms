package com.inspire.assignments;

import java.util.Stack;

public class ImplementQueueWithStack {

    private Stack<Integer> s1=new Stack<Integer>();
    private Stack<Integer> s2=new Stack<Integer>();

    public void enqueue(int i){
        s1.push(i);
    }

    public int dequeue(){
        if(!s2.empty()){
            return s2.pop();
        }else{
            fills2();
            return s2.pop();
        }
    }
    public int peek(){
        if(!s2.empty()){
            return s2.peek();
        }else{
            fills2();
            return s2.peek();
        }
    }
    public void fills2(){
        while (!s1.empty()){
            s2.push(s1.pop());
        }
    }
}
