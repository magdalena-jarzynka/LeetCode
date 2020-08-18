package com.madzia;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution for <a href="https://leetcode.com/problems/ransom-note/">Ransom Note</a>
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        char[] magazineChars = magazine.toCharArray();
        char[] ransomChars = ransomNote.toCharArray();
        Map<Character, Integer> magazineMap = new HashMap<>();
        for (char character : magazineChars) {
            if (magazineMap.containsKey(character)) {
                magazineMap.replace(character, magazineMap.get(character) + 1);
            } else {
                magazineMap.put(character, 1);
            }
        }
        for (char character : ransomChars) {
            if (magazineMap.containsKey(character)) {
                magazineMap.replace(character, magazineMap.get(character) - 1);
                if (magazineMap.get(character) == 0) {
                    magazineMap.remove(character);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
