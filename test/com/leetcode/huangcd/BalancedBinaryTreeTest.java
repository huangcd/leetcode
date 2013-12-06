package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
 * Date: 12/3/13
 * <p/>
 * Time: 9:21 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class BalancedBinaryTreeTest {
    private final static String TAG = BalancedBinaryTreeTest.class.getName();

    @Test
    public void testIsBalanced() throws Exception {
        BalancedBinaryTree test = new BalancedBinaryTree();
        TreeNode root = new TreeNode(1);
        TreeNode node = root;
        for (int i = 0; i < 100000; i++) {
            node.left = new TreeNode(i);
            node = node.left;
        }
        Assert.assertEquals(false, test.isBalanced(root));
    }

    @Test
    public void testGetHeight() throws Exception {
        BalancedBinaryTree test = new BalancedBinaryTree();
        TreeNode root = new TreeNode(1);
        TreeNode node = root;
        for (int i = 0; i < 100000; i++) {
            node.left = new TreeNode(i);
            node = node.left;
        }
        Assert.assertEquals(1000001, test.getHeight(root, new HashMap<TreeNode, Integer>()));

    }
}
