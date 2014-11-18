package com.leetcode.huangcd;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Date: 2014/11/18
 * Time: 11:17
 *
 * @author chhuang
 */
public class LRUCache {
    private final static String TAG = LRUCache.class.getSimpleName();
    private final int capacity;
    LinkedHashMap<Integer, Node> cache;

    public LRUCache(final int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap<Integer, Node>(0, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Node> eldest) {
                return size() >= capacity;
            }
        };
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            return node.value;
        }
        return -1;
    }

    public void set(int key, int value) {
        // Update and move to front
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
        }
        Node node = new Node();
        node.key = key;
        node.value = value;
        cache.put(key, node);
    }

    private static class Node {
        int  key;
        int  value;
        Node prev;
        Node next;
    }
}
