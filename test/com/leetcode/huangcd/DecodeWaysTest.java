package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/15/13
 * <p/>
 * Time: 11:23 AM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class DecodeWaysTest {
    private final static String TAG = DecodeWaysTest.class.getName();

    @Test
    public void testNumDecodings() throws Exception {
        DecodeWays test = new DecodeWays();
        Assert.assertEquals(2, test.numDecodings("12"));
        Assert.assertEquals(2, test.numDecodings("18"));
        Assert.assertEquals(1, test.numDecodings("28"));
        Assert.assertEquals(1, test.numDecodings(""));
        Assert.assertEquals(1, test.numDecodings("9"));
        Assert.assertEquals(3, test.numDecodings("122"));
        Assert.assertEquals(0, test.numDecodings("0"));
        Assert.assertEquals(0, test.numDecodings("012"));
        Assert.assertEquals(0, test.numDecodings("30"));
        Assert.assertEquals(0, test.numDecodings("301"));
        Assert.assertEquals(0, test.numDecodings("123301"));

    }
}
