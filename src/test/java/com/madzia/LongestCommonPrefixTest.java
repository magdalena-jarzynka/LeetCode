package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {

    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void shouldReturnLongestCommonPrefixForStringsWithTheSameLength() {
        //Given
        String[] strs = {"flow", "flew", "flaw"};
        //When
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        //Then
        assertEquals("fl", result);
    }

    @Test
    void shouldReturnLongestCommonPrefixForStringsWithDifferentLength() {
        //Given
        String[] strs = {"flower", "flow", "flight"};
        //When
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        //Then
        assertEquals("fl", result);
    }

    @Test
    void shouldReturnEmptyStringForNoCommonPrefix() {
        //Given
        String[] strs = {"dog", "racecar", "car"};
        //When
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        //Then
        assertEquals("", result);
    }

    @Test
    void shouldReturnEmptyStringIfOneInputStringIsEmpty() {
        //Given
        String[] strs = {"", "flower", "flow", "flight"};
        //When
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        //Then
        assertEquals("", result);
    }

    @Test
    void shouldReturnLongestCommonPrefixWhenLongestCommonPrefixEqualsOneOfTheStrings() {
        //Given
        String[] strs = {"car", "caro", "carol"};
        //When
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        //Then
        assertEquals("car", result);
    }
}