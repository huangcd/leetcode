package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 11/30/13
 * <p/>
 * Time: 2:31 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class SingleNumberIITest {

    @Test
    public void testSingleNumber() throws Exception {
        SingleNumberII test = new SingleNumberII();
        Assert.assertEquals(124, test.singleNumber(new int[]{1, 1, 1, 124, 2, 2, 2, 3, 3, 3, 125, 125, 125, 248, 248, 248,}));
    }
}
