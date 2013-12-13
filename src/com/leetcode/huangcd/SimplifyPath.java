package com.leetcode.huangcd;

import java.util.Stack;

/**
 * Date: 12/6/13
 * <p/>
 * Time: 8:42 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        if (!path.endsWith("/")) {
            path = path + "/";
        }
        char[] chars = new char[256];
        int index = 0;
        Stack<String> folders = new Stack<String>();
        for (char c : path.toCharArray()) {
            if (c == '/') {
                String folder = new String(chars, 0, index);
                if (!folder.isEmpty() && !folder.equals(".")) {
                    if (folder.equals("..")) {
                        if (!folders.empty()) {
                            folders.pop();
                        }
                    } else {
                        folders.push(folder);
                    }
                }
                index = 0;
            } else {
                chars[index] = c;
                index++;
            }
        }
        StringBuilder buffer = new StringBuilder("/");
        for (String folder : folders) {
            buffer.append(folder).append('/');
        }
        if (buffer.length() > 1) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
        return buffer.toString();
    }
}
