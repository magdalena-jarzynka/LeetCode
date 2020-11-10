package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthTribonacciNumberTest {

    NthTribonacciNumber nthTribonacciNumber = new NthTribonacciNumber();

    @Test
    void testInput0() {
        //Given
        int input = 0;
        //When
        int result = nthTribonacciNumber.tribonacci(input);
        //Then
        assertEquals(0, result);
    }

    @Test
    void testInput1() {
        //Given
        int input = 1;
        //When
        int result = nthTribonacciNumber.tribonacci(input);
        //Then
        assertEquals(1, result);
    }

    @Test
    void testInput4() {
        //Given
        int input = 4;
        //When
        int result = nthTribonacciNumber.tribonacci(input);
        //Then
        assertEquals(4, result);
    }

    @Test
    void testInput25() {
        //Given
        int input = 25;
        //When
        int result = nthTribonacciNumber.tribonacci(input);
        //Then
        assertEquals(1389537, result);
    }
}