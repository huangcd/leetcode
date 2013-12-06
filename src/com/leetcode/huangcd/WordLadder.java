package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 9:18 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class WordLadder {
    public int ladderLength(
            String start,
            String end,
            HashSet<String> dict) {
        dict.add(start);
        dict.add(end);
        ArrayList<String> list = new ArrayList<String>(dict);
        int size = list.size();
        boolean[] visited = new boolean[size];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        int startIndex = list.lastIndexOf(start);
        int endIndex = list.indexOf(end);
        queue.add(startIndex);
        visited[startIndex] = true;
        int round = 0;
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            round++;
            for (int i = 0; i < queueSize; i++) {
                int index = queue.removeFirst();
                for (int next = 0; next < size; next++) {
                    if (!visited[next] && close(list.get(next), list.get(index))) {
                        visited[next] = true;
                        queue.add(next);
                        if (next == endIndex) {
                            return round + 1;
                        }
                    }
                }
            }
        }
        return 0;
    }

    private boolean close(String src, String dest) {
        int size = src.length();
        int diff = 0;
        for (int i = 0; i < size; i++) {
            if (src.charAt(i) != dest.charAt(i)) {
                diff++;
                if (diff == 2) {
                    return false;
                }
            }
        }
        return diff <= 1;
    }
}
