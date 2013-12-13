package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/6/13
 * <p/>
 * Time: 8:51 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class SimplifyPathTest {
    @Test
    public void testSimplifyPath() throws Exception {
        SimplifyPath test = new SimplifyPath();
        Assert.assertEquals("/", test.simplifyPath("//..//./home/../"));
        Assert.assertEquals("/c", test.simplifyPath("/a/./b/../../c/"));
        Assert.assertEquals("/c", test.simplifyPath("/a/./b/../../c"));
        Assert.assertEquals("/...", test.simplifyPath("/..."));
        Assert.assertEquals("/...", test.simplifyPath("/.../"));
        Assert.assertEquals("/", test.simplifyPath("/."));
        Assert.assertEquals("/home/foo/bar", test.simplifyPath("/home/foo/./bar/"));
    }
}
