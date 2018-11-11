package com.inspire.assignments;

public class FindLongestSubArray {
    //Find longest sub array from given example where no of 0s = no of 1s
    static int[] arr={0,1,0,1,0,1,0,1,1,0,0,0,0,0,1,1};
    public static void main (String args[]){

        for (int i=0;i<arr.length;i++){
            int no_of_zeros=0;
            int no_of_ones=0;
            int start=0; int end=0;
            int max_len_curr=0;
            for (int j=i;j<arr.length;j++){
                if(arr[j]==1){
                    no_of_ones++;
                }else {
                    no_of_zeros++;
                }
                end++;
                if(no_of_zeros==no_of_ones){
                    max_len_curr=end-start;
                }
            }
            System.out.println("start index "+i);
            System.out.println("max length "+max_len_curr);
        }


    }

}
