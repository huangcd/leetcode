package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 9:37 AM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class SetMatrixZeroesTest {

    @Test
    public void testSetZeroes() throws Exception {
        SetMatrixZeroes test = new SetMatrixZeroes();
        int[][] matrix = new int[][]{{0}, {1}};
        test.setZeroes(matrix);
        Assert.assertArrayEquals(new int[2][1], matrix);

        matrix = new int[][]{{0, 0, 0, 5}, {4, 3, 1, 4}, {0, 1, 1, 4}, {1, 2, 1, 3}, {0, 0, 1, 1}};
        test.setZeroes(matrix);
        Assert.assertArrayEquals(new int[][]{{0, 0, 0, 0}, {0, 0, 0, 4}, {0, 0, 0, 0}, {0, 0, 0, 3}, {0, 0, 0, 0}}, matrix);
    }
}
