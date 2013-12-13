package com.leetcode.huangcd;

import java.util.regex.Pattern;

/**
 * Date: 12/8/13
 * <p/>
 * Time: 7:39 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        while (p.contains("**")) {
            p = p.replace("**", "*");
        }
        Pattern pattern = Pattern.compile(p.replace("?", ".?").replace("*", ".*"), Pattern.DOTALL);
        return pattern.matcher(s).matches();
    }
}
