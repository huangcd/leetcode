package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 6:48 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class MinimumPathSumTest {
    private final static String TAG = MinimumPathSumTest.class.getName();

    @Test
    public void testMinPathSum() throws Exception {
        MinimumPathSum test = new MinimumPathSum();
        Assert.assertEquals(3, test.minPathSum(new int[][]{{1, 2}, {1, 1}}));
    }
}
