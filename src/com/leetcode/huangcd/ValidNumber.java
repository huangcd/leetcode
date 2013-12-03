package com.leetcode.huangcd;

import java.util.regex.Pattern;

/**
 * Date: 12/3/13
 * <p/>
 * Time: 5:02 PM
 * <p/>
 * Validate if a given string is numeric.
 * <p/>
 * Some examples:
 * "0" => true
 * " 0.1 " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * <p/>
 * Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one.
 *
 * @author chhuang@microsoft.com
 */
public class ValidNumber {
    Pattern decimalPattern = Pattern.compile("[+-]?[0-9]+(\\.[0-9]*)?(e[0-9]*)?", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    Pattern hexPattern = Pattern.compile("[+-]?0x[0-9a-f]+", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);

    public boolean isNumber(String s) {
        s = s.trim();
        if (decimalPattern.matcher(s).matches()) {
            return true;
        }
        else if (hexPattern.matcher(s).matches()) {
            return true;
        }
        return false;
    }
}
