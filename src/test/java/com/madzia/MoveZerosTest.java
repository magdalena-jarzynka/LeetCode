package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

    MoveZeros moveZeros = new MoveZeros();

    @Test
    void testOneZeroAtTheBegging() {
        //Given
        int[] nums = {0, 1, 3, 4};
        //When
        moveZeros.moveZeroes(nums);
        //Then
        assertArrayEquals(new int[]{1, 3, 4, 0}, nums);
    }

    @Test
    void testOneZeroAtTheEnd() {
        //Given
        int[] nums = {1, 3, 4, 0};
        //When
        moveZeros.moveZeroes(nums);
        //Then
        assertArrayEquals(new int[]{1, 3, 4, 0}, nums);
    }

    @Test
    void testOneZeroInTheMiddle() {
        //Given
        int[] nums = {1, 3, 0, 4};
        //When
        moveZeros.moveZeroes(nums);
        //Then
        assertArrayEquals(new int[]{1, 3, 4, 0}, nums);
    }

    @Test
    void testFewZerosInARow() {
        //Given
        int[] nums = {3, 4, 0, 0, 0, 0, 5, 1};
        //When
        moveZeros.moveZeroes(nums);
        //Then
        assertArrayEquals(new int[]{3, 4, 5, 1, 0, 0, 0, 0}, nums);
    }

    @Test
    void testOnlyZeros() {
        //Given
        int[] nums = {0, 0, 0, 0, 0};
        //When
        moveZeros.moveZeroes(nums);
        //Then
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, nums);
    }

    @Test
    void testEmptyArray() {
        //Given
        int[] nums = {};
        //When
        moveZeros.moveZeroes(nums);
        //Then
        assertArrayEquals(new int[]{}, nums);
    }
}