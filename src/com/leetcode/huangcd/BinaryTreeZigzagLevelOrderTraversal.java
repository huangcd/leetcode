package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Date: 12/9/13
 * <p/>
 * Time: 10:43 AM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<ArrayList<Integer>>();
        }
        boolean reverse = true;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        queue.add(root);
        while (!queue.isEmpty()) {
            LinkedList<TreeNode> newQueue = new LinkedList<TreeNode>();
            ArrayList<Integer> values = new ArrayList<Integer>();
            result.add(values);
            for (TreeNode node : queue) {
                values.add(node.val);
                if (reverse) {
                    if (node.left != null) {
                        newQueue.addFirst(node.left);
                    }
                    if (node.right != null) {
                        newQueue.addFirst(node.right);
                    }
                } else {
                    if (node.right != null) {
                        newQueue.addFirst(node.right);
                    }
                    if (node.left != null) {
                        newQueue.addFirst(node.left);
                    }
                }
            }
            queue = newQueue;
            reverse = !reverse;
        }
        return result;
    }
}
