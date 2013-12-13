package com.leetcode.huangcd;

import java.util.Stack;

/**
 * Date: 12/13/13
 * <p/>
 * Time: 4:26 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char top = stack.pop();
                if ((c != ')' || top != '(') && (c != ']' || top != '[') && (c != '}' || top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
