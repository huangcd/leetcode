package com.leetcode.huangcd;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Date: 12/8/13
 * <p/>
 * Time: 7:06 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class MaxPointOnALine {
    public int maxPoints(Point[] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        if (points.length == 1) {
            return 1;
        }
        HashMap<Tuple, HashSet<Integer>> cache = new HashMap<Tuple, HashSet<Integer>>();
        int length = points.length;
        for (int i = 0; i < length; i++) {
            Point p1 = points[i];
            for (int j = i + 1; j < length; j++) {
                Point p2 = points[j];
                int[] line = calcLine(p1, p2);
                Tuple tuple = new Tuple(line);
                HashSet<Integer> set;
                if (cache.containsKey(tuple)) {
                    set = cache.get(tuple);
                } else {
                    set = new HashSet<Integer>();
                    cache.put(tuple, set);
                }
                set.add(i);
                set.add(j);
            }
        }
        int maxCount = 0;
        for (HashSet<Integer> set : cache.values()) {
            maxCount = Math.max(maxCount, set.size());
        }
        return maxCount;
    }

    private int[] calcLine(Point p1, Point p2) {
        if (p1.x == p2.x && p1.y == p2.y) {
            return new int[]{p1.x, p2.x, Integer.MIN_VALUE};
        }
        if (p1.x == p2.x) {
            return new int[]{1, 0, -p1.x};
        } else if (p1.y == p2.y) {
            return new int[]{0, 1, -p1.y};
        }
        int a = p2.y - p1.y;
        int b = p1.x - p2.x;
        if (a < 0) {
            a = -a;
            b = -b;
        }
        int ab = gcd(Math.abs(a), Math.abs(b));
        a /= ab;
        b /= ab;
        int c = -a * p1.x - b * p1.y;
        return new int[]{a, b, c};
    }

    private int gcd(int a, int b) {
        if (a < b) {
            return gcd(b, a);
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    final class Tuple {
        int a;
        int b;
        int c;

        Tuple(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        Tuple(int[] array) {
            this.a = array[0];
            this.b = array[1];
            this.c = array[2];
        }

        @Override
        public int hashCode() {
            int result = a;
            result = 31 * result + b;
            result = 31 * result + c;
            return result;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) { return true; }
            if (o == null || getClass() != o.getClass()) { return false; }

            Tuple tuple = (Tuple) o;

            return a == tuple.a && b == tuple.b && c == tuple.c;
        }
    }
}
