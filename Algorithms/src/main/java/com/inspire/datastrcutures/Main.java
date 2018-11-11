package com.inspire.datastrcutures;

public class Main {
    public static void main (String[] args){
        LruCacheImpl<String> lru=new LruCacheImpl<String>(4);
        lru.referPage("page1");
        lru.displayCache();
        System.out.println("after adding page2");
        lru.referPage("page2");
        lru.displayCache();
        lru.referPage("page1");
        System.out.println("after adding page1 again");
        lru.displayCache();

        /*lru.referPage("page3");
        lru.displayCache();
        lru.referPage("page4");
        lru.displayCache();*/


    }
}
