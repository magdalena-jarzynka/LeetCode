package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {

    ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void shouldReturnTrueForPalindromeWithAlphanumericCharacters() {
        //Given
        String palindrome = "2abba2";
        //When
        boolean result = validPalindrome.isPalindrome(palindrome);
        //Then
        assertTrue(result);

    }

    @Test
    void shouldReturnFalseForPalindromeWithAlphanumericCharacters() {
        //Given
        String palindrome = "2lalka3";
        //When
        boolean result = validPalindrome.isPalindrome(palindrome);
        //Then
        assertFalse(result);

    }

    @Test
    void shouldBeCaseInsensitive() {
        //Given
        String palindrome = "Abba";
        //When
        boolean result = validPalindrome.isPalindrome(palindrome);
        //Then
        assertTrue(result);

    }

    @Test
    void shouldReturnTrueForPalindromeWithPunctuationMarks() {
        //Given
        String palindrome = "a man, a plan, a canal: panama";
        //When
        boolean result = validPalindrome.isPalindrome(palindrome);
        //Then
        assertTrue(result);

    }

    @Test
    void shouldReturnFalseForPalindromeWithPunctuationMarks() {
        //Given
        String palindrome = "race a car.";
        //When
        boolean result = validPalindrome.isPalindrome(palindrome);
        //Then
        assertFalse(result);

    }

    @Test
    void shouldReturnTrueForEmptyString() {
        //Given
        String palindrome = "";
        //When
        boolean result = validPalindrome.isPalindrome(palindrome);
        //Then
        assertTrue(result);

    }

}