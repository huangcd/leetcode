package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 4:57 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class TrappingRainWaterTest {

    @Test
    public void testTrap() throws Exception {
        TrappingRainWater test = new TrappingRainWater();
        Assert.assertEquals(6, test.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        Assert.assertEquals(0, test.trap(new int[]{10, 1, 1, 1, 1, 1, 1}));
        Assert.assertEquals(0, test.trap(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
        Assert.assertEquals(5, test.trap(new int[]{2, 1, 1, 1, 1, 1, 2}));
        int[] array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            array[i] = i + 1;
        }
        Assert.assertEquals(0, test.trap(array));
        for (int i = 0; i < 10000; i++) {
            array[i] = 10000 - i;
        }
        Assert.assertEquals(0, test.trap(array));
    }
}
