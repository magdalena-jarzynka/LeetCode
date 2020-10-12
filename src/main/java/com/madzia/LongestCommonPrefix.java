package com.madzia;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution for <a href="https://leetcode.com/problems/longest-common-prefix/">Longest Common Prefix</a>
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Set<Character> charSet = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();

        int minStringLength = 200;
        for (String s : strs) {
            if (s.length() < minStringLength) {
                minStringLength = s.length();
            }
        }

        for (int i = 0; i < minStringLength; i++) {
            for (String s : strs) {
                charSet.add(s.charAt(i));
            }
            if (charSet.size() == 1) {
                stringBuilder.append(charSet.iterator().next());
                charSet.clear();
            } else break;
        }

        return stringBuilder.toString();
    }
}
