package com.leetcode.huangcd;

import java.util.HashMap;

/**
 * Date: 12/17/13
 * <p/>
 * Time: 10:06 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class LRUCache {
    private final HashMap<Integer, Node> entities;
    private int count;
    private Node head;
    private Node tail;
    private int capacity;

    public LRUCache(int capacity) {
        this.entities = new HashMap<Integer, Node>(capacity);
        this.capacity = capacity;
        this.count = 0;
    }

    public int get(int key) {
        if (entities.containsKey(key)) {
            return entities.get(key).value;
        }
        return -1;
    }

    public void set(int key, int value) {
        if (entities.containsKey(key)) {
            Node node = entities.get(key);
            node.value = value;
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.next = head;
            head.prev = node;
            tail.next = node;
            node.prev = tail;
            head = node;
        } else {
            Node node = new Node(key, value);
            entities.put(key, node);
            if (count == 0) {
                head = tail = node;
                node.prev = node;
                node.next = node;
                count ++;
            } else if (count == capacity) {
                node.next = head;
                head.prev = node;
                node.prev = tail;
                tail.prev.next = node;
                entities.remove(tail.key);
                head = node;
                tail = node.prev;
            } else {
                node.next = head;
                head.prev = node;
                tail.next = node;
                node.prev = tail;
                head = node;
                count ++;
            }
        }
    }

    private class Node {
        Node prev;
        Node next;
        int key;
        int value;

        private Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
