package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 11:05 AM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class BinaryTreeInOrderTraversalTest {

    @Test
    public void testInOrderTraversal() throws Exception {
        BinaryTreeInOrderTraversal test = new BinaryTreeInOrderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.left.right = new TreeNode(5);
        Assert.assertArrayEquals(new Integer[]{2, 1, 4, 5, 3}, test.inOrderTraversal(root).toArray());
        Assert.assertArrayEquals(new Integer[0], test.inOrderTraversal(null).toArray());
        root.right = null;
        Assert.assertArrayEquals(new Integer[]{2, 1}, test.inOrderTraversal(root).toArray());
    }
}
