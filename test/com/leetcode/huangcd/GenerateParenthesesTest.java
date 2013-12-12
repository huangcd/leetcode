package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/11/13
 * <p/>
 * Time: 9:51 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class GenerateParenthesesTest {

    @Test
    public void testGenerateParenthesis() throws Exception {
        GenerateParentheses test = new GenerateParentheses();
        Assert.assertEquals("[((())), (()()), (())(), ()(()), ()()()]", test.generateParenthesis(3).toString());
        Assert.assertEquals("[]", test.generateParenthesis(0).toString());
        Assert.assertEquals("[()]", test.generateParenthesis(1).toString());

    }
}
