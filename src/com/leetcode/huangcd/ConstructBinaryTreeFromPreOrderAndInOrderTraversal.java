package com.leetcode.huangcd;

/**
 * Date: 12/12/13
 * <p/>
 * Time: 9:35 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class ConstructBinaryTreeFromPreOrderAndInOrderTraversal {
    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        if (preOrder == null) {
            return null;
        }
        return buildTree(preOrder, 0, preOrder.length, inOrder, 0, inOrder.length);
    }

    private TreeNode buildTree(int[] preOrder, int f1, int t1, int[] inOrder, int f2, int t2) {
        assert (t1 - f1 == t2 - f2);
        if (f1 >= t1) {
            return null;
        }
        TreeNode node = new TreeNode(preOrder[f1]);
        int index = f2;
        while (index < t2 && inOrder[index] != preOrder[f1]) {
            index++;
        }
        int leftLength = index - f2;
        int rightLength = t2 - index - 1;
        node.left = buildTree(preOrder, f1 + 1, f1 + leftLength + 1, inOrder, f2, f2 + leftLength);
        node.right = buildTree(preOrder, t1 - rightLength, t1, inOrder, t2 - rightLength, t2);
        return node;
    }
}
