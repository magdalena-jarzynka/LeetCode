package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortColorsTest {

    SortColors sortColors = new SortColors();

    @Test
    void testSortColorsWithOnlyOneColor() {
        //Given
        int[] nums = {1};
        //When
        sortColors.sortColors(nums);
        //Then
        assertArrayEquals(new int[]{1}, nums);
    }

    @Test
    void testSortColorsWithAllPossibleColors() {
        //Given
        int[] nums = {2, 0, 2, 1, 1, 0};
        //When
        sortColors.sortColors(nums);
        //Then
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }
}