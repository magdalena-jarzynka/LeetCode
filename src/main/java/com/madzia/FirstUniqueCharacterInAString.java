package com.madzia;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Solution for <a href="https://leetcode.com/problems/first-unique-character-in-a-string/">First Unique Character In A String</a>
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Set<Character> uniqueCharacterSet = new LinkedHashSet<>();
        Set<Character> repeatingCharacterSet = new HashSet<>();
        int result = -1;

        for (Character character : chars) {
            if (!uniqueCharacterSet.contains(character) && !repeatingCharacterSet.contains(character)) {
                uniqueCharacterSet.add(character);
            } else if (uniqueCharacterSet.contains(character)) {
                repeatingCharacterSet.add(character);
                uniqueCharacterSet.remove(character);
            }
        }
        if (!uniqueCharacterSet.isEmpty()) {
            Character firstUniqueCharacter = uniqueCharacterSet.stream().findFirst().get();
            int i = 0;
            while (i < chars.length) {
                if (chars[i] == firstUniqueCharacter) {
                    result = i;
                    break;
                } else {
                    i++;
                }
            }
        }
        return result;
    }
}
