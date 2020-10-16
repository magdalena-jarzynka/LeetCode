package com.madzia;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfAPhoneNumberTest {

    LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();

    @Test
    void testStringWithOneDigit() {
        //Given
        String digits = "2";
        List<String> expected = List.of("a", "b", "c");
        //When
        List<String> result = letterCombinationsOfAPhoneNumber.letterCombinations(digits);
        //Then
        assertEquals(expected, result);
    }

    @Test
    void testStringWithTwoDigits() {
        //Given
        String digits = "23";
        List<String> expected = List.of("ad","ae","af","bd","be","bf","cd","ce","cf");
        //When
        List<String> result = letterCombinationsOfAPhoneNumber.letterCombinations(digits);
        //Then
        assertEquals(expected, result);
    }

    @Test
    void testStringWithFourDigits() {
        //Given
        String digits = "5678";
        List<String> expected = List.of("jmpt","jmpu","jmpv","jmqt","jmqu","jmqv","jmrt","jmru","jmrv","jmst","jmsu","jmsv","jnpt","jnpu","jnpv","jnqt","jnqu","jnqv","jnrt","jnru","jnrv","jnst","jnsu","jnsv","jopt","jopu","jopv","joqt","joqu","joqv","jort","joru","jorv","jost","josu","josv","kmpt","kmpu","kmpv","kmqt","kmqu","kmqv","kmrt","kmru","kmrv","kmst","kmsu","kmsv","knpt","knpu","knpv","knqt","knqu","knqv","knrt","knru","knrv","knst","knsu","knsv","kopt","kopu","kopv","koqt","koqu","koqv","kort","koru","korv","kost","kosu","kosv","lmpt","lmpu","lmpv","lmqt","lmqu","lmqv","lmrt","lmru","lmrv","lmst","lmsu","lmsv","lnpt","lnpu","lnpv","lnqt","lnqu","lnqv","lnrt","lnru","lnrv","lnst","lnsu","lnsv","lopt","lopu","lopv","loqt","loqu","loqv","lort","loru","lorv","lost","losu","losv");
        //When
        List<String> result = letterCombinationsOfAPhoneNumber.letterCombinations(digits);
        //Then
        assertEquals(expected, result);
    }

    @Test
    void testStringWithTwoSameDigits() {
        //Given
        String digits = "22";
        List<String> expected = List.of("aa","ab","ac","ba","bb","bc","ca","cb","cc");
        //When
        List<String> result = letterCombinationsOfAPhoneNumber.letterCombinations(digits);
        //Then
        assertEquals(expected, result);
    }

    @Test
    void testEmptyString() {
        //Given
        String digits = "";
        List<String> expected = List.of();
        //When
        List<String> result = letterCombinationsOfAPhoneNumber.letterCombinations(digits);
        //Then
        assertEquals(expected, result);
    }}

