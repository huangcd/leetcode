package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 11:44 AM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class BinaryTreePreOrderTraversal {
    public ArrayList<Integer> preOrderTraversal(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Object> stack = new Stack<Object>();
        stack.push(root);
        while (!stack.empty()) {
            Object obj = stack.pop();
            if (Integer.class.isInstance(obj)) {
                list.add(0, (Integer) obj);
            } else if (obj != null) {
                TreeNode node = (TreeNode) obj;
                stack.push(node.val);
                stack.push(node.left);
                stack.push(node.right);
            }
        }
        return list;
    }
}
