package com.leetcode.huangcd;

/**
 * Date: 11/27/13
 * Time: 5:09 PM
 *
 * @author chhuang@microsoft.com
 *         Given two binary trees, write a function to check if they are equal or not.
 *         <p/>
 *         Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
