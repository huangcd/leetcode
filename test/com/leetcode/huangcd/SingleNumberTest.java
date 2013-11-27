package com.leetcode.huangcd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Date: 11/27/13
 * Time: 2:58 PM
 *
 * @author chhuang@microsoft.com
 */
public class SingleNumberTest {

    @Test
    public void testSingleNumber() throws Exception {
        assertEquals(1, new SingleNumber().singleNumber(new int[]{1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6}));
        assertEquals(4, new SingleNumber().singleNumber(new int[]{1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6}));
    }
}
