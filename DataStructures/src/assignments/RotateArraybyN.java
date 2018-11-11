package com.inspire.assignments;

public class RotateArraybyN {

    public static void main(String args[]){
        int[] arr={2,1,3,5,77,7,2,0,-12,-2,-8};
        int rotationFactor=11;
        for (int i=0;i<rotationFactor;i++){
            rotateBy1(arr);
        }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }

    public static int[] rotateBy1(int[] arr){
        int tmp=arr[arr.length-1];
        for (int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=tmp;
        return arr;
    }
}
