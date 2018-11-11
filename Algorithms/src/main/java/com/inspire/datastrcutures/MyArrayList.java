package com.inspire.datastrcutures;

import java.sql.Time;
import java.util.Arrays;

/**
 * Created by sachi on 22/6/18.
 */
public class MyArrayList<T> {
    private int size=0;
    private static final int INCREMENT_SIZE=10;
    private T[] objList;
    public MyArrayList(){
        objList=(T[]) new Object[10];
    }

    public void add(T t){
        if(objList.length>size){
            objList[size++]=t;
        }else{
            T[] o=(T[]) new Object[objList.length+INCREMENT_SIZE];
            System.arraycopy(objList,0,o,0,objList.length);
            objList=o;
            objList[size++]=t;
        }

    }

    public T get(int index){
        if(index<size){
            return objList[index];
        }else
            return null;

    }

    public T remove(int index){
        T[] newObj=(T[]) new Object[objList.length];
        T removedObj=null;
        if(index> size){
            return null;
        }else{
            for(int i=0;i<index;i++){
                newObj[i]=objList[i];
            }
            removedObj=objList[index];
            if(index<size-1){
                for (int j=index+1;j<size;j++){
                    newObj[j-1]=objList[j];
                }
            }
            objList=newObj;
            size--;
            return removedObj;
        }

    }

    public T[] getMyList(){
        return objList;
    }
    public void printList(){
        for (int i=0;i<size;i++){
            System.out.println(objList[i]);
        }
    }
    public int getSize(){
        return objList.length;
    }


}
