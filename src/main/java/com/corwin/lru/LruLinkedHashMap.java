package com.corwin.lru;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LruLinkedHashMap<K, V> {

    // 容量
    private int capacity;
    // Map+双向链表
    private LinkedHashMap<K, V> data;

    public LruLinkedHashMap(int capacity) {
        this.capacity = capacity;
        this.data = new LinkedHashMap<>(capacity);
    }

    public void put(K key, V value) {
        if(this.data.containsKey(key)) {
            System.out.println(this.data.get(key));
            this.data.remove(key);
        }
        if(this.data.size() >= capacity) {
            Iterator<K> item = this.data.keySet().iterator();
            K targetK = item.next();
            System.out.println(this.data.get(targetK));
            this.data.remove(targetK);
        }
        this.data.put(key, value);
    }

    public V get(K key) {
        return this.data.get(key);
    }
}
