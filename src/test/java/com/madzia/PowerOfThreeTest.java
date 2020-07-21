package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeTest {

    PowerOfThree powerOfThree = new PowerOfThree();

    @Test
    void shouldReturnTrueIfIntegerIsPowerOfThree() {
        //Given
        int i = 27;
        //When
        boolean result = powerOfThree.isPowerOfThree(i);
        //Then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseIfIntegerIsNotPowerOfThree() {
        //Given
        int i = 10;
        //When
        boolean result = powerOfThree.isPowerOfThree(i);
        //Then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseIfIntegerIsZero() {
        //Given
        int i = 0;
        //When
        boolean result = powerOfThree.isPowerOfThree(i);
        //Then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseIfIntegerIsNegative() {
        //Given
        int i = -9;
        //When
        boolean result = powerOfThree.isPowerOfThree(i);
        //Then
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueIfIntegerIsOne() {
        //Given
        int i = 1;
        //When
        boolean result = powerOfThree.isPowerOfThree(i);
        //Then
        assertTrue(result);
    }


}