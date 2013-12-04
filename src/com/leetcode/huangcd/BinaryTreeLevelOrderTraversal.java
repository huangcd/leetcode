package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 9:01 AM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class BinaryTreeLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<ArrayList<Integer>>();
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<Integer>();
            result.add(list);
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.removeFirst();
                list.add(node.val);
                if (node.left != null) {
                    queue.addLast(node.left);
                }
                if (node.right != null) {
                    queue.addLast(node.right);
                }
            }
        }
        return result;
    }
}
