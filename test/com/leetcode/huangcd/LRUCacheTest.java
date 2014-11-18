package com.leetcode.huangcd;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LRUCacheTest {
    @Test
    public void test1() {
        LRUCache cache = new LRUCache(10);
        cache.set(2, 1);
        assertEquals(1, cache.get(2));
    }

    @Test
    public void test2() {
        LRUCache cache = new LRUCache(10);
        ArrayList<Integer> values = new ArrayList<Integer>();
        cache.set(10, 13);
        cache.set(3, 17);
        cache.set(6, 11);
        cache.set(10, 5);
        cache.set(9, 10);
        values.add(cache.get(13));
        cache.set(2, 19);
        values.add(cache.get(2));
        values.add(cache.get(3));
        cache.set(5, 25);
        values.add(cache.get(8));
        cache.set(9, 22);
        cache.set(5, 5);
        cache.set(1, 30);
        values.add(cache.get(11));
        cache.set(9, 12);
        values.add(cache.get(7));
        values.add(cache.get(5));
        values.add(cache.get(8));
        values.add(cache.get(9));
        cache.set(4, 30);
        cache.set(9, 3);
        values.add(cache.get(9));
        values.add(cache.get(10));
        values.add(cache.get(10));
        cache.set(6, 14);
        cache.set(3, 1);
        values.add(cache.get(3));
        cache.set(10, 11);
        values.add(cache.get(8));
        cache.set(2, 14);
        values.add(cache.get(1));
        values.add(cache.get(5));
        values.add(cache.get(4));
        cache.set(11, 4);
        cache.set(12, 24);
        cache.set(5, 18);
        values.add(cache.get(13));
        cache.set(7, 23);
        values.add(cache.get(8));
        values.add(cache.get(12));
        cache.set(3, 27);
        cache.set(2, 12);
        values.add(cache.get(5));
        cache.set(2, 9);
        cache.set(13, 4);
        cache.set(8, 18);
        cache.set(1, 7);
        values.add(cache.get(6));
        cache.set(9, 29);
        cache.set(8, 21);
        values.add(cache.get(5));
        cache.set(6, 30);
        cache.set(1, 12);
        values.add(cache.get(10));
        cache.set(4, 15);
        cache.set(7, 22);
        cache.set(11, 26);
        cache.set(8, 17);
        cache.set(9, 29);
        values.add(cache.get(5));
        cache.set(3, 4);
        cache.set(11, 30);
        values.add(cache.get(12));
        cache.set(4, 29);
        values.add(cache.get(3));
        values.add(cache.get(9));
        values.add(cache.get(6));
        cache.set(3, 4);
        values.add(cache.get(1));
        values.add(cache.get(10));
        cache.set(3, 29);
        cache.set(10, 28);
        cache.set(1, 20);
        cache.set(11, 13);
        values.add(cache.get(3));
        cache.set(3, 12);
        cache.set(3, 8);
        cache.set(10, 9);
        cache.set(3, 26);
        values.add(cache.get(8));
        values.add(cache.get(7));
        values.add(cache.get(5));
        cache.set(13, 17);
        cache.set(2, 27);
        cache.set(11, 15);
        values.add(cache.get(12));
        cache.set(9, 19);
        cache.set(2, 15);
        cache.set(3, 16);
        values.add(cache.get(1));
        cache.set(12, 17);
        cache.set(9, 1);
        cache.set(6, 19);
        values.add(cache.get(4));
        values.add(cache.get(5));
        values.add(cache.get(5));
        cache.set(8, 1);
        cache.set(11, 7);
        cache.set(5, 2);
        cache.set(9, 28);
        values.add(cache.get(1));
        cache.set(2, 2);
        cache.set(7, 4);
        cache.set(4, 22);
        cache.set(7, 24);
        cache.set(9, 26);
        cache.set(13, 28);
        cache.set(11, 26);
        assertArrayEquals(new Integer[]{-1, 19, 17, -1, -1, -1, 5, -1, 12, 3, 5, 5, 1, -1, 30, 5, 30, -1, -1, 24, 18,
                                  -1, 18, -1, 18, -1, 4, 29, 30, 12, -1, 29, 17, 22, 18, -1, 20, -1, 18, 18, 20},
                          values.toArray(new Integer[values.size()]));
    }
}