package com.leetcode.huangcd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Date: 11/28/13
 * <p/>
 * Time: 2:11 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class EvaluateReversePolishNotationTest {

    @Test
    public void testEvalRPN() throws Exception {
        assertEquals(9, new EvaluateReversePolishNotation().evalRPN(new String[] {"2", "1", "+", "3", "*"}));
        assertEquals(6, new EvaluateReversePolishNotation().evalRPN(new String[] {"4", "13", "5", "/", "+"}));
    }
}
