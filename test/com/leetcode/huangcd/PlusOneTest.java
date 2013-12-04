package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 9:15 AM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class PlusOneTest {

    @Test
    public void testPlusOne() throws Exception {
        PlusOne test = new PlusOne();
        Assert.assertArrayEquals(new int[]{1, 2, 3}, test.plusOne(new int[]{1, 2, 2}));
        Assert.assertArrayEquals(new int[]{1}, test.plusOne(new int[0]));
        Assert.assertArrayEquals(new int[]{1, 0}, test.plusOne(new int[]{9}));
    }
}
