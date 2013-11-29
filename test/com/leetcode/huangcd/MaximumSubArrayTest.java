package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 11/29/13
 * <p/>
 * Time: 11:31 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class MaximumSubArrayTest {

    @Test
    public void testMaxSubArray() throws Exception {
        MaximumSubArray test = new MaximumSubArray();
        Assert.assertEquals(6, test.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        Assert.assertEquals(-1, test.maxSubArray(new int[]{-2, -1, -3, -4, -1, -2, -1, -5, -4}));
    }
}
