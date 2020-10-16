package com.madzia;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Solution for <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/">Letter Combinations of a Phone Number</a>
 */
public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        Map<Character, List<Character>> charMap = Map.of(
                '2', List.of('a', 'b', 'c'),
                '3', List.of('d', 'e', 'f'),
                '4', List.of('g', 'h', 'i'),
                '5', List.of('j', 'k', 'l'),
                '6', List.of('m', 'n', 'o'),
                '7', List.of('p', 'q', 'r', 's'),
                '8', List.of('t', 'u', 'v'),
                '9', List.of('w', 'x', 'y', 'z')
        );

        char[] chars = digits.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        if (digits.length() > 0) {
            for (Character v0 : charMap.get(chars[0])) {
                stringBuilder.append(v0);
                if (digits.length() > 1) {
                    for (Character v1 : charMap.get(chars[1])) {
                        stringBuilder.append(v1);
                        if (digits.length() > 2) {
                            for (Character v2 : charMap.get(chars[2])) {
                                stringBuilder.append(v2);
                                if (digits.length() > 3) {
                                    for (Character v3 : charMap.get(chars[3])) {
                                        stringBuilder.append(v3);
                                        result.add(stringBuilder.toString());
                                        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                                    }
                                } else {
                                    result.add(stringBuilder.toString());
                                }
                                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                            }
                        } else {
                            result.add(stringBuilder.toString());
                        }
                        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                    }
                } else {
                    result.add(stringBuilder.toString());
                }
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
        }
        return result;
    }
}
