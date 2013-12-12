package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/11/13
 * <p/>
 * Time: 4:29 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class AddBinaryTest {

    @Test
    public void testAddBinary() throws Exception {
        AddBinary test = new AddBinary();
        Assert.assertEquals("100", test.addBinary("1", "11"));
        Assert.assertEquals("100000", test.addBinary("1", "11111"));
        Assert.assertEquals("11", test.addBinary("1", "10"));
        Assert.assertEquals("10101", test.addBinary("1010", "1011"));
        Assert.assertEquals("110001", test.addBinary("101111", "10"));
    }
}
