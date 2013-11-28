package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 11/27/13
 * Time: 5:24 PM
 *
 * @author chhuang at live dot cn
 */
public class UniqueBinarySearchTreesTest {

    @Test
    public void testNumTrees() throws Exception {
        Assert.assertEquals(1, new UniqueBinarySearchTrees().numTrees(1));
        Assert.assertEquals(2, new UniqueBinarySearchTrees().numTrees(2));
        Assert.assertEquals(5, new UniqueBinarySearchTrees().numTrees(3));
    }
}
