package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/6/13
 * <p/>
 * Time: 5:05 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class SumRootToLeafNumbersTest {

    @Test
    public void testSumNumbers() throws Exception {
        SumRootToLeafNumbers test = new SumRootToLeafNumbers();
        Assert.assertEquals(0, test.sumNumbers(null));
        Assert.assertEquals(1, test.sumNumbers(new TreeNode(1)));
        Assert.assertEquals(25, test.sumNumbers(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        Assert.assertEquals(123, test.sumNumbers(new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null)));
        Assert.assertEquals(137, test.sumNumbers(new TreeNode(1, new TreeNode(2, new TreeNode(3), null), new TreeNode(4))));
    }
}
