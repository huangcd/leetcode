package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/16/13
 * <p/>
 * Time: 9:45 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class WordSearchTest {
    private final static String TAG = WordSearchTest.class.getName();

    @Test
    public void testExist() throws Exception {
        WordSearch test = new WordSearch();
        char[][] board = new char[][]{
                "ABCE".toCharArray(),
                "SFCS".toCharArray(),
                "ADEE".toCharArray()
        };
        Assert.assertEquals(true, test.exist(board, "ABCCED"));
        Assert.assertEquals(true, test.exist(board, "SEE"));
        Assert.assertEquals(false, test.exist(board, "ABCB"));
    }
}
