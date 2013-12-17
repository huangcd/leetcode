package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Date: 12/17/13
 * <p/>
 * Time: 7:47 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class NQueensTest {

    @Test
    public void testSolveNQueens() throws Exception {
        NQueens test = new NQueens();
        Assert.assertEquals(2, test.solveNQueens(4).size());
        Assert.assertEquals(1, test.solveNQueens(1).size());
    }
}
