package com.inspire.assignments;

public class ReverseStringWoSpChar {
    static String input="S@chch!d@";
    static char[] cArray=input.toCharArray();
    public static void main (String args[]){
        int start=0;
        int end=cArray.length;

        for (int i=0;i<cArray.length;i++){
            while(!Character.isAlphabetic(cArray[start])){
                start++;
            }
            while (!Character.isAlphabetic(cArray[start])){
                end--;
            }
            if(start>=end){
                break;
            }
            reverse(start,end);
        }

        System.out.println(cArray.toString());

    }

    public static void reverse(int start, int end){
        char ctemp=cArray[start];
        cArray[start]=cArray[end];
        cArray[end]=ctemp;
    }
}
