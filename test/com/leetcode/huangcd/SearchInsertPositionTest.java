package com.leetcode.huangcd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Date: 11/28/13
 * <p/>
 * Time: 5:10 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class SearchInsertPositionTest {

    @Test
    public void testSearchInsert() throws Exception {
        SearchInsertPosition test = new SearchInsertPosition();
        assertEquals(2, test.searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, test.searchInsert(new int[]{1, 3, 5, 6}, 2));
        assertEquals(4, test.searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(0, test.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
}
