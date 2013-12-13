package com.leetcode.huangcd;

/**
 * Date: 12/13/13
 * <p/>
 * Time: 1:22 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class JumpGame {
    public boolean canJump(int[] A) {
        if (A == null || A.length == 0) {
            return true;
        }
        int size = A.length;
        boolean[] visited = new boolean[size];
        int index = 0;
        while (true) {
            if (index >= size - 1) {
                return true;
            }
            if (visited[index]) {
                return false;
            }
            visited[index] = true;
            index += A[index];
        }
    }
}
