package com.inspire.assignments;

public class StringPalindrome {
    public static void main(String[] args){
        String s="MALAYALAM";
        int i=0;
        boolean isPalindrome=true;
        if(s.length()<1 ||s==null){
            isPalindrome=false;
        }
        while (i<s.length()/2){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                isPalindrome=false;
                break;
            }
            i++;
        }
        System.out.println(isPalindrome);
    }
}
