package com.inspire.assignments;

/**
 * Created by sachi on 22/6/18.
 */

public class DuplicatesInArray {
    //Find duplicate from a sorted array
    public static void main(String[] args){
        int[] arr={2,3,3,4,5,5,6,6,7,7,7,8,8,8,8,8,8,10,11};
        int j=0;
        int temp=arr[0];
        for (int i=0;i<arr.length;i++){
            while(i< arr.length-1 && arr[i]==arr[i+1]){

                if(temp!=arr[i]){
                    System.out.println(arr[i]);
                }
                temp=arr[++i];
            }
        }
    }

}
