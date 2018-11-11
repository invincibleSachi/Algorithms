package com.inspire.datastrcutures;

public class MapNode<K,V> {
    private K key;
    private V value;
    private int hashcode;

    public MapNode(K key, V value){
        this.key=key;
        this.value=value;
        this.hashcode=key.hashCode();
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public int getHashcode() {
        return value.hashCode();
    }

}
