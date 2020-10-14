package com.madzia;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution for <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">Longest Substring Without Repeating Characters</a>
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int firstElement = 0;
        char[] chars = s.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            if (charMap.containsKey(chars[i])) {
                maxLength = Math.max(maxLength, i - firstElement);
                firstElement = Math.max(firstElement, charMap.get(chars[i]) + 1);
            }
            charMap.put(chars[i], i);
        }

        return Math.max(maxLength, chars.length - firstElement);
    }
}
