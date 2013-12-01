package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 10:59 AM
 * <p/>
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * <p/>
 * For example:
 * Given binary tree {1,#,2,3},
 * <p/>
 * 1
 * \
 * 2
 * /
 * 3
 * <p/>
 * return [1,3,2].
 * <p/>
 * Note: Recursive solution is trivial, could you do it iteratively?
 *
 * @author chhuang at live dot cn
 */
public class BinaryTreeInOrderTraversal {
    public ArrayList<Integer> inOrderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Object> stack = new Stack<Object>();
        stack.push(root);
        while (!stack.empty()) {
            Object obj = stack.pop();
            if (Integer.class.isInstance(obj)) {
                list.add(0, (Integer) obj);
            } else if (obj != null) {
                TreeNode node = (TreeNode) obj;
                stack.push(node.left);
                stack.push(node.val);
                stack.push(node.right);
            }
        }
        return list;
    }
}
