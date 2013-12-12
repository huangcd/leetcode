package com.leetcode.huangcd;

/**
 * Date: 12/12/13
 * <p/>
 * Time: 9:54 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class ConstructBinaryTreeFromInOrderAndPostOrderTraversal {
    public TreeNode buildTree(int[] inOrder, int[] postOrder) {
        if (inOrder == null) {
            return null;
        }
        return buildTree(postOrder, 0, postOrder.length, inOrder, 0, inOrder.length);
    }

    private TreeNode buildTree(int[] postOrder, int f1, int t1, int[] inOrder, int f2, int t2) {
        assert (t1 - f1 == t2 - f2);
        if (f1 >= t1) {
            return null;
        }
        TreeNode node = new TreeNode(postOrder[t1 - 1]);
        int index = f2;
        while (index < t2 && inOrder[index] != postOrder[t1 - 1]) {
            index++;
        }
        int leftLength = index - f2;
        int rightLength = t2 - index - 1;
        node.left = buildTree(postOrder, f1, f1 + leftLength, inOrder, f2, f2 + leftLength);
        node.right = buildTree(postOrder, t1 - rightLength - 1, t1 - 1, inOrder, t2 - rightLength, t2);
        return node;
    }
}
