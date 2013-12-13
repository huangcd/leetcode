package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/13/13
 * <p/>
 * Time: 7:03 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class LengthOfLastWordTest {

    @Test
    public void testLengthOfLastWord() throws Exception {
        LengthOfLastWord test = new LengthOfLastWord();
        Assert.assertEquals(5, test.lengthOfLastWord("Hello World"));
        Assert.assertEquals(5, test.lengthOfLastWord("Hello World             "));
        Assert.assertEquals(5, test.lengthOfLastWord(" World             "));
        Assert.assertEquals(5, test.lengthOfLastWord("World             "));
        Assert.assertEquals(5, test.lengthOfLastWord("World"));
        Assert.assertEquals(1, test.lengthOfLastWord("a"));
        Assert.assertEquals(0, test.lengthOfLastWord(""));
        Assert.assertEquals(0, test.lengthOfLastWord("      "));
        Assert.assertEquals(0, test.lengthOfLastWord(null));

    }
}
