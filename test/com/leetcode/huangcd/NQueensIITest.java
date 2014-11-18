package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/17/13
 * <p/>
 * Time: 8:02 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class NQueensIITest {

    @Test
    public void testTotalNQueens() throws Exception {
        NQueensII test = new NQueensII();
        Assert.assertEquals(2, test.totalNQueens(4));
        Assert.assertEquals(1, test.totalNQueens(1));
        Assert.assertEquals(0, test.totalNQueens(1));
    }
}
