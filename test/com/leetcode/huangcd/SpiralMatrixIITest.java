package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/13/13
 * <p/>
 * Time: 1:17 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class SpiralMatrixIITest {

    @Test
    public void testGenerateMatrix() throws Exception {
        SpiralMatrixII test = new SpiralMatrixII();
        Assert.assertArrayEquals(new int[][]{{1}}, test.generateMatrix(1));
        Assert.assertArrayEquals(new int[][]{}, test.generateMatrix(0));
        Assert.assertArrayEquals(new int[][]{{1, 2}, {4, 3}}, test.generateMatrix(2));
        Assert.assertArrayEquals(new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}}, test.generateMatrix(3));
    }
}
