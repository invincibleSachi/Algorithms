package com.inspire.datastrcutures;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashMap<K, V> {
    int MAX_BUCKET_SIZE = 16;
    LinkedList<MapNode>[] buckets = null;

    MyHashMap() {
        buckets = new LinkedList[MAX_BUCKET_SIZE];
    }

    public boolean put(K key, V value) {
        MapNode<K, V> node = new MapNode<>(key, value);
        LinkedList l = buckets[key.hashCode() % MAX_BUCKET_SIZE];
        if (l == null) {
            LinkedList<MapNode> newList=new LinkedList<MapNode>();
            newList.add(node);
            buckets[key.hashCode() % MAX_BUCKET_SIZE]=newList;
            return true;
        } else {
            Iterator<MapNode> it = l.iterator();
            MapNode<K, V> desiredNode = null;
            while (it.hasNext()) {
                MapNode<K, V> n = it.next();
                if ((n.getKey().hashCode() == key.hashCode()) && n.getKey().equals(key)) {
                    desiredNode = n;
                    break;
                }
            }
            if (desiredNode != null) {
                desiredNode.setValue(value);
            } else {
                buckets[key.hashCode() % MAX_BUCKET_SIZE].add(node);
            }
        }

        return true;
    }

    public V get(K key) {
        LinkedList<MapNode> l = buckets[key.hashCode() % MAX_BUCKET_SIZE];
        Iterator<MapNode> it = l.iterator();
        while (it.hasNext()) {
            MapNode<K, V> node = it.next();
            if ((node.getKey().hashCode() == key.hashCode()) && node.getKey().equals(key)) {
                return node.getValue();
            }
        }
        return null;
    }

}
