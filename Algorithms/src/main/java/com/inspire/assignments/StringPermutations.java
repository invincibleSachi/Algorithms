package com.inspire.assignments;

import java.util.HashSet;

public class StringPermutations {
    public static void main(String[] args) {
        String s = "ABCD";
        HashSet<String> set = permutate(0, s);
        for (String x : set) {
            System.out.println(x);
        }

    }

    public static HashSet<String> permutate(int fixedIndex, String s) {
        HashSet<String> set = new HashSet<String>();
        HashSet<String> temp = null;
        if (fixedIndex > s.length() - 1) {
            return null;
        } else if (fixedIndex == s.length()-1) {
            set.add(s.charAt(fixedIndex) + "");
            return set;
        } else {
            if(fixedIndex+1<s.length()){
                char c = s.charAt(fixedIndex);
                temp = permutate(fixedIndex, s.substring(0, fixedIndex) + s.substring(fixedIndex + 1, s.length() ));
                for (String x : temp) {
                    set.add(c + x);
                    set.add(x + c);
                }
            }

        }
        return set;
    }

}
