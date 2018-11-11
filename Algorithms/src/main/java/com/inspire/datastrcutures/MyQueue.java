package com.inspire.datastrcutures;

public class MyQueue <T> {

    private int front=-1;
    private int rear=-1;
    private int size=0;
    private T[] queueu;
    //Queue will insert from rear and peek and pop from front
    public MyQueue(int i){
        queueu=(T[]) new Object[i];
        size=i;
    }

    public boolean isEmpty(){
        return front==-1 || rear==front;
    }

    public boolean isfull(){
        return rear==size-1;
    }

    public void add(T t){
        queueu[size++]=t;
    }

    public T peek(){
        return queueu[front];
    }

    public void insert(T t){
        if (isEmpty()){
            front=0;
            rear=0;
            queueu[rear]=t;
            return;
        }
       if(!isfull()){
           System.out.println("queue is full cant add more");
       }else {
            queueu[rear++]=t;
       }
    }

    public T remove(){
        if(isEmpty()) {
            System.out.println("queue is empty cant get anything");
            return null;
        }else{
            return queueu[front++];
        }
    }
}
