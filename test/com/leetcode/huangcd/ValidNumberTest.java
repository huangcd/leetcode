package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/3/13
 * <p/>
 * Time: 5:16 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class ValidNumberTest {
    private final static String TAG = ValidNumberTest.class.getName();

    @Test
    public void testIsNumber() throws Exception {
        ValidNumber test = new ValidNumber();
        Assert.assertEquals(true, test.isNumber("0"));
        Assert.assertEquals(true, test.isNumber(" 0.1"));
        Assert.assertEquals(true, test.isNumber("3."));
        Assert.assertEquals(true, test.isNumber(".3"));
        Assert.assertEquals(true, test.isNumber("0x12"));
        Assert.assertEquals(true, test.isNumber("2e10"));
        Assert.assertEquals(true, test.isNumber("2E10"));
        Assert.assertEquals(false, test.isNumber("abc"));
        Assert.assertEquals(false, test.isNumber("1 a"));
        Assert.assertEquals(false, test.isNumber("1a"));
    }
}
