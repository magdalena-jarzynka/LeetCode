package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringTest {

    ReverseString reverseString = new ReverseString();

    @Test
    void testEvenNumberOfCharacters() {
        //Given
        char[] chars = new char[]{'s', 'p', 'r', 'i', 'n', 'g'};
        //When
        reverseString.reverseString(chars);
        //Then
        assertArrayEquals(new char[]{'g', 'n', 'i', 'r', 'p', 's'}, chars);
    }

    @Test
    void testUnevenNumberOfCharacters() {
        //Given
        char[] chars = new char[]{'g', 'l', 'a', 's', 's'};
        //When
        reverseString.reverseString(chars);
        //Then
        assertArrayEquals(new char[]{'s', 's', 'a', 'l', 'g'}, chars);
    }

    @Test
    void testPrintableAsciiCharacters() {
        //Given
        char[] chars = new char[]{'a', 'B', 'c', 'd', 'E', '%', 'f', '0'};
        //When
        reverseString.reverseString(chars);
        //Then
        assertArrayEquals(new char[]{'0', 'f', '%', 'E', 'd', 'c', 'B', 'a'}, chars);
    }

    @Test
    void testEmptyArray() {
        //Given
        char[] chars = new char[0];
        //When
        reverseString.reverseString(chars);
        //Then
        assertArrayEquals(new char[0], chars);
    }
}