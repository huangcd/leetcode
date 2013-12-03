package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/3/13
 * <p/>
 * Time: 8:32 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class BinaryTreeMaximumPathSumTest {

    @Test
    public void testMaxPathSum() throws Exception {
        BinaryTreeMaximumPathSum test = new BinaryTreeMaximumPathSum();
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(-1);
        Assert.assertEquals(2, test.maxPathSum(node));
    }
}
