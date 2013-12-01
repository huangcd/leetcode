package com.leetcode.huangcd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 10:08 AM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class ReverseIntegerTest {

    @Test
    public void testReverse() throws Exception {
        ReverseInteger test = new ReverseInteger();
        assertEquals(123, test.reverse(321));
        assertEquals(-123, test.reverse(-321));
        assertEquals(-123, test.reverse(-32100));
    }
}
