package com.inspire.assignments;

public class ReverseStringRecursively {

    static String s="Programming is awesome";
    public static void main(String[] args){
        System.out.println(reverseString(s));

    }

    public static String reverseString(String s){
        String reverse="";
        if (s==null || s.length()==1){
            return s;
        }else {
            reverse=reverse+s.charAt(s.length()-1)+reverseString(s.substring(0,s.length()-1));
        }
        return reverse;
    }
}
