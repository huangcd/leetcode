package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/15/13
 * <p/>
 * Time: 6:09 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class CandyTest {

    @Test
    public void testCandy() throws Exception {
        Candy test = new Candy();
        Assert.assertEquals(6, test.candy(new int[]{1, 1, 1, 1, 1, 1}));
        Assert.assertEquals(7, test.candy(new int[]{2, 2, 1, 1, 1, 1}));
        Assert.assertEquals(9, test.candy(new int[]{3, 2, 1, 1, 1, 1}));
        Assert.assertEquals(7, test.candy(new int[]{1, 1, 1, 1, 2, 2}));
        Assert.assertEquals(9, test.candy(new int[]{1, 1, 1, 1, 2, 5}));
        Assert.assertEquals(11, test.candy(new int[]{5, 3, 3, 1, 3, 5}));
        Assert.assertEquals(11, test.candy(new int[]{5, 3, 1, 3, 5}));
        Assert.assertEquals(9, test.candy(new int[]{1, 2, 4, 4, 3}));
        Assert.assertEquals(10, test.candy(new int[]{1, 2, 4, 4, 4, 3}));
    }
}
