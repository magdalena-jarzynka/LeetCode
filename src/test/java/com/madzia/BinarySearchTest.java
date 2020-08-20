package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    BinarySearch binarySearch = new BinarySearch();

    @Test
    void testWhenTargetExistsInArray() {
        //Given
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        //When
        int result = binarySearch.search(nums, target);
        //Then
        assertEquals(4, result);
    }

    @Test
    void testWhenTargetDoesNotExistInArray() {
        //Given
        int[] nums = {-1, 0, 3, 5, 10, 12};
        int target = 9;
        //When
        int result = binarySearch.search(nums, target);
        //Then
        assertEquals(-1, result);
    }
}