package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Date: 12/9/13
 * <p/>
 * Time: 2:31 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class DivideTwoIntegersTest {

    @Test
    public void testDivide() throws Exception {
        DivideTwoIntegers test = new DivideTwoIntegers();
        Assert.assertEquals("2/1", 2, test.divide(2, 1));
        Assert.assertEquals("256/17", 256 / 17, test.divide(256, 17));
        Assert.assertEquals("-1815813009/1349602070", -1815813009 / 1349602070, test.divide(-1815813009, 1349602070));
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int a = random.nextInt();
            int b = random.nextInt();
            Assert.assertEquals(a + "/" + b, a / b, test.divide(a, b));
        }
    }
}
