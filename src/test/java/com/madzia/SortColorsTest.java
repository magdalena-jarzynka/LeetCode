package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortColorsTest {

    SortColors sortColors = new SortColors();

    @Test
    void testSortColorsWithOnlyRedColor() {
        //Given
        int[] nums = {0};
        //When
        sortColors.sortColors(nums);
        //Then
        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    void testSortColorsWithOnlyBlueColor() {
        //Given
        int[] nums = {2};
        //When
        sortColors.sortColors(nums);
        //Then
        assertArrayEquals(new int[]{2}, nums);
    }

    @Test
    void testSortColorsWithAllPossibleColorsOccurringOnce() {
        //Given
        int[] nums = {2, 0, 1};
        //When
        sortColors.sortColors(nums);
        //Then
        assertArrayEquals(new int[]{0, 1, 2}, nums);
    }

    @Test
    void testSortColorsWithAllPossibleColorsOccurringMoreThanOnce() {
        //Given
        int[] nums = {1, 2, 2, 2, 2, 0, 0, 0, 1, 1};
        //When
        sortColors.sortColors(nums);
        //Then
        assertArrayEquals(new int[]{0, 0, 0, 1, 1, 1, 2, 2, 2, 2}, nums);
    }

    @Test
    void testSortColorsWithOnlyTwoColors() {
        //Given
        int[] nums = {1, 2, 1};
        //When
        sortColors.sortColors(nums);
        //Then
        assertArrayEquals(new int[]{1, 1, 2}, nums);
    }
}