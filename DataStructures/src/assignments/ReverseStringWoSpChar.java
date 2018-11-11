package com.inspire.assignments;

public class ReverseStringWoSpChar {
    static String input="S@chch!d@";
    static char[] cArray=input.toCharArray();
    static int start=0;
    static int end=cArray.length-1;
    public static void main (String args[]){


        while(end>start){
            System.out.format("start :%s end : %s",start,end);
            while(!Character.isAlphabetic(cArray[start])){
                System.out.println("before incrementing "+start);
                start++;
                System.out.println("after incrementing "+start);
            }
            while (!Character.isAlphabetic(cArray[end])){
                end--;
            }
            if(start>=end){
                break;
            }
            reverse();
            System.out.println("after reversed outside: " + start+ ":"+end);
        }

        System.out.println(String.valueOf(cArray));

    }

    public static void reverse(){
        System.out.println(start);
        System.out.println(end);
        System.out.println("before reversed: " + start+ ":"+end);
        char ctemp=cArray[start];
        cArray[start]=cArray[end];
        cArray[end]=ctemp;
        start++;
        end--;
        System.out.println("after reversed: " + start+ ":"+end);
    }
}
