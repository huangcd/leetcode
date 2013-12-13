package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Date: 12/11/13
 * <p/>
 * Time: 9:28 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class GenerateParentheses {
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        generateParenthesis(n, n, new LinkedList<Character>(), result);
        return result;
    }

    private void generateParenthesis(int s, int e, LinkedList<Character> queue, ArrayList<String> list) {
        if (s > e || s < 0 || e < 0) {
            return;
        }
        if (s == 0 && e == 0) {
            char[] chars = new char[queue.size()];
            for (int i = 0; i < queue.size(); i++) {
                chars[i] = queue.get(i);
            }
            list.add(new String(chars));
            return;
        }
        queue.addLast('(');
        generateParenthesis(s - 1, e, queue, list);
        queue.removeLast();
        queue.addLast(')');
        generateParenthesis(s, e - 1, queue, list);
        queue.removeLast();
    }
}
