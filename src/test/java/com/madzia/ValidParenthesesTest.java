package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void returnTrueForValidSetsOfBracketsInOrder() {
        //Given
        String input = "{}()[]";
        //When
        boolean result = validParentheses.isValid(input);
        //Then
        assertTrue(result);
    }

    @Test
    void returnTrueForValidSetsOfBracketsMixed() {
        //Given
        String input = "{([])[()]{}(){}{([({})])}}";
        //When
        boolean result = validParentheses.isValid(input);
        //Then
        assertTrue(result);
    }

    @Test
    void returnTrueForEmptyString() {
        //Given
        String input = "";
        //When
        boolean result = validParentheses.isValid(input);
        //Then
        assertTrue(result);
    }

    @Test
    void returnFalseForNotValidSetsOfBracketsInOrder() {
        //Given
        String input = "()[]{[}";
        //When
        boolean result = validParentheses.isValid(input);
        //Then
        assertFalse(result);
    }

    @Test
    void returnFalseForClosingBracketAtTheBeginning() {
        //Given
        String input = "]";
        //When
        boolean result = validParentheses.isValid(input);
        //Then
        assertFalse(result);
    }

    @Test
    void returnFalseForValidSetsOfBracketsMixed() {
        //Given
        String input = "{([])[()]{}(){}{([({}])}}";
        //When
        boolean result = validParentheses.isValid(input);
        //Then
        assertFalse(result);
    }
}