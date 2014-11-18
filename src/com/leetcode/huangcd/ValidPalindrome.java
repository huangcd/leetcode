package com.leetcode.huangcd;

/**
 * Date: 11/29/13
 * <p/>
 * Time: 11:40 PM
 * <p/>
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p/>
 * For example,
 * <p/>
 * "A man, a plan, a canal: Panama" is a palindrome.
 * <p/>
 * "race a car" is not a palindrome.
 * <p/>
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 * <p/>
 * For the purpose of this problem, we define empty string as valid palindrome.
 *
 * @author chhuang at live dot cn
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int forwardIndex = 0;
        int backwardIndex = s.length() - 1;
        boolean valid = true;
        while (forwardIndex < backwardIndex) {
            while (forwardIndex < s.length() && !isAlphabetic(s.charAt(forwardIndex))) {
                forwardIndex++;
            }
            if (forwardIndex >= s.length()) {
                break;
            }
            while (backwardIndex >= 0 && !isAlphabetic(s.charAt(backwardIndex))) {
                backwardIndex--;
            }
            if (backwardIndex < 0) {
                break;
            }
            if (Character.toUpperCase(s.charAt(forwardIndex)) != Character.toUpperCase(s.charAt(backwardIndex))) {
                valid = false;
                break;
            }
            forwardIndex++;
            backwardIndex--;
        }
        return valid;
    }

    private boolean isAlphabetic(char c) {
        return ('0' <= c && c <= '9') || ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
    }
}
