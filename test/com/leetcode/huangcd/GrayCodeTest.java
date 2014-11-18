package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Date: 12/16/13
 * <p/>
 * Time: 11:02 AM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class GrayCodeTest {
    @Test
    public void testGrayCode() throws Exception {
        GrayCode test = new GrayCode();
        Assert.assertEquals(Arrays.asList(0, 1, 3, 2), test.grayCode(2));
        Assert.assertEquals(Arrays.asList(0), test.grayCode(0));
    }
}
