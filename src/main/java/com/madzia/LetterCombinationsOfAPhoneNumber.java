package com.madzia;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Solution for <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/">Letter Combinations of a Phone Number</a>
 */
public class LetterCombinationsOfAPhoneNumber {
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

    public List<String> letterCombinations(String digits) {
        List<Character> digitList = digits.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        StringBuilder stringBuilder = new StringBuilder();
        if (!digitList.isEmpty()) {
            combine(stringBuilder, digitList);
        }
        return result;
    }

    private void combine(StringBuilder stringBuilder, List<Character> digitList) {
        if (digitList.isEmpty()) {
            result.add(stringBuilder.toString());
        } else {
            for (Character value : charMap.get(digitList.get(0))) {
                stringBuilder.append(value);
                combine(stringBuilder, digitList.subList(1, digitList.size()));
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
        }
    }
}
