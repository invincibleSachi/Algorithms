package com.inspire.assignments;

public class RotateArrayByNBlockSwap {

    public static void main (String[] args){

    int[] arr={2,1,3,5,77,7,2,0,-12,-2,-8};
    int rotationFactor=3;
    int k=0;
    int[] block=new int[rotationFactor];
    for (int i=arr.length-rotationFactor;i<arr.length;i++){

        block[k++]=arr[i];
    }
    for (int i=arr.length-rotationFactor-1;i>0;i--){
        arr[i+rotationFactor]=arr[i];
    }
    for (int i=0;i<block.length;i++){
        arr[i]=block[i];
    }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }



}

}
