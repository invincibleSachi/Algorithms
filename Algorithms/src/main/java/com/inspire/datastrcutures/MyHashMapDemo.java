package com.inspire.datastrcutures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyHashMapDemo {

    public static void main(String[] args){
        MyHashMap<String,Integer> m=new MyHashMap<>();
        m.put("A",1);
        m.put("A",2);
        m.put("B",3);
        m.put("C",4);
        m.put("D",5);
        System.out.println(m.get("A"));

        HashMap<String,String> m1=new HashMap<String,String>();
        m1.put("AA","BB");
        m1.put("CC","DD");
        Set<String> keySet=m1.keySet();

        Iterator it=m1.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> e=(Map.Entry) it.next();
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
