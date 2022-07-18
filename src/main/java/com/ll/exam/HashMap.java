package com.ll.exam;

import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> {
    ArrayList<K> keyList;
    ArrayList<V> valueList;

    HashMap(){
        keyList = new ArrayList();
        valueList = new ArrayList();
    }

    public void put(K key, V value){
        if(keyList.contains(key)){
            int index = keyList.indexOf(key);
            valueList.set(index, value);
            return;
        }
        keyList.add(key);
        valueList.add(value);
    }

    public V get(K key){
        int index = keyList.indexOf(key);
        return valueList.get(index);
    }

    public void remove(K key){
        if(keyList.contains(key)){
            int index = keyList.indexOf(key);
            keyList.remove(key);
            valueList.remove(index);
        }
    }

    public ArrayList<String> keySet(){
        return (ArrayList<String>) keyList;
    }

    public int size(){
        return keyList.size();
    }
}