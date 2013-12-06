package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 10:20 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class RotateImageTest {

    @Test
    public void testRotate() throws Exception {
        RotateImage test = new RotateImage();
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        test.rotate(matrix);
        Assert.assertArrayEquals(new int[][]{{7,4,1},{8,5,2},{9,6,3}}, matrix);
    }
}
