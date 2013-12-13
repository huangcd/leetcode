package com.leetcode.huangcd;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Date: 12/8/13
 * <p/>
 * Time: 7:41 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class WildcardMatchingTest {

    @Test
    public void testIsMatch() throws Exception {
        WildcardMatching test = new WildcardMatching();
        Assert.assertTrue(test.isMatch("aa", "aa"));
        Assert.assertTrue(test.isMatch("aa", "*"));
        Assert.assertTrue(test.isMatch("aa", "a*"));
        Assert.assertTrue(test.isMatch("ab", "?*"));
        Assert.assertFalse(test.isMatch("aa", "a"));
        Assert.assertFalse(test.isMatch("aaa", "aa"));
        Assert.assertFalse(test.isMatch("aab", "c*a*b"));
    }
}
