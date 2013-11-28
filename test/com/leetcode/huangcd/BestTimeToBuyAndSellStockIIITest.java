package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 11/28/13
 * <p/>
 * Time: 1:40 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class BestTimeToBuyAndSellStockIIITest {

    @Test
    public void testMaxProfit() throws Exception {
        BestTimeToBuyAndSellStockIII test = new BestTimeToBuyAndSellStockIII();
        Assert.assertEquals(7, test.maxProfit(new int[]{6, 1, 3, 2, 4, 7}));
    }
}
