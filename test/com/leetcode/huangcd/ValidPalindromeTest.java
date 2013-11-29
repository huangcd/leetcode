package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 11/29/13
 * <p/>
 * Time: 11:45 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class ValidPalindromeTest {

    @Test
    public void testIsPalindrome() throws Exception {
        ValidPalindrome test = new ValidPalindrome();
        Assert.assertEquals(true, test.isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertEquals(false, test.isPalindrome("race a car"));
        Assert.assertEquals(true, test.isPalindrome(""));
        Assert.assertEquals(true, test.isPalindrome(",.#@"));
    }
}
