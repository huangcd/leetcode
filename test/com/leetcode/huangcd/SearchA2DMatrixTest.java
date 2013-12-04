package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 8:57 AM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class SearchA2DMatrixTest {

    @Test
    public void testSearchMatrix() throws Exception {
        SearchA2DMatrix test = new SearchA2DMatrix();
        int[][] matrix = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        Assert.assertEquals(true, test.searchMatrix(matrix, 1));
        Assert.assertEquals(true, test.searchMatrix(matrix, 3));
        Assert.assertEquals(true, test.searchMatrix(matrix, 5));
        Assert.assertEquals(true, test.searchMatrix(matrix, 7));
        Assert.assertEquals(true, test.searchMatrix(matrix, 10));
        Assert.assertEquals(true, test.searchMatrix(matrix, 11));
        Assert.assertEquals(true, test.searchMatrix(matrix, 16));
        Assert.assertEquals(true, test.searchMatrix(matrix, 20));
        Assert.assertEquals(true, test.searchMatrix(matrix, 23));
        Assert.assertEquals(true, test.searchMatrix(matrix, 30));
        Assert.assertEquals(true, test.searchMatrix(matrix, 34));
        Assert.assertEquals(true, test.searchMatrix(matrix, 50));
        Assert.assertEquals(false, test.searchMatrix(matrix, 0));
        Assert.assertEquals(false, test.searchMatrix(matrix, 51));
        Assert.assertEquals(false, test.searchMatrix(matrix, 2));
        Assert.assertEquals(false, test.searchMatrix(matrix, 8));
        Assert.assertEquals(false, test.searchMatrix(matrix, 9));
        Assert.assertEquals(false, test.searchMatrix(matrix, 18));
    }
}
