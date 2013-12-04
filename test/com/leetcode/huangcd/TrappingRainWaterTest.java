package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 4:57 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class TrappingRainWaterTest {

    @Test
    public void testTrap() throws Exception {
        TrappingRainWater test = new TrappingRainWater();
        Assert.assertEquals(6, test.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        Assert.assertEquals(0, test.trap(new int[]{10, 1, 1, 1, 1, 1, 1}));
        Assert.assertEquals(0, test.trap(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
        Assert.assertEquals(5, test.trap(new int[]{2, 1, 1, 1, 1, 1, 2}));
    }
}
