package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInAStringTest {

    FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();

    @Test
    void testOnlyOneUniqueCharacterInString() {
        //Given
        String s = "eel";
        //When
        int result = firstUniqueCharacterInAString.firstUniqChar(s);
        //Then
        assertEquals(2, result);
    }

    @Test
    void testMoreThanOneUniqueCharacterInString() {
        //Given
        String s = "leetcode";
        //When
        int result = firstUniqueCharacterInAString.firstUniqChar(s);
        //Then
        assertEquals(0, result);
    }

    @Test
    void testNoUniqueCharacterInString() {
        //Given
        String s = "codecodecode";
        //When
        int result = firstUniqueCharacterInAString.firstUniqChar(s);
        //Then
        assertEquals(-1, result);
    }

    @Test
    void testEmptyString() {
        //Given
        String s = "";
        //When
        int result = firstUniqueCharacterInAString.firstUniqChar(s);
        //Then
        assertEquals(-1, result);
    }
}