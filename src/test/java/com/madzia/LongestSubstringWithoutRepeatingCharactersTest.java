package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void testStringWithLettersOnly() {
        //Given
        String s = "dvdf";
        //When
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        //Then
        assertEquals(3, result);
    }

    @Test
    void testStringWithLettersOnly1() {
        //Given
        String s = "pwwkew";
        //When
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        //Then
        assertEquals(3, result);
    }

    @Test
    void testStringWithSpacesOnly() {
        //Given
        String s = "     ";
        //When
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        //Then
        assertEquals(1, result);
    }

    @Test
    void testStringWithDigitsOnly() {
        //Given
        String s = "1231235616";
        //When
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        //Then
        assertEquals(5, result);
    }

    @Test
    void testStringWithSymbolsOnly() {
        //Given
        String s = "@#$#$%^!@";
        //When
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        //Then
        assertEquals(6, result);
    }

    @Test
    void testStringWithTheSameLetterRepeated() {
        //Given
        String s = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
        //When
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        //Then
        assertEquals(1, result);
    }

    @Test
    void testEmptyString() {
        //Given
        String s = "";
        //When
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        //Then
        assertEquals(0, result);
    }
}