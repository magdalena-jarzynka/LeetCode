package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumOf1dArrayTest {

    RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();

    @Test
    void testRandomNumbers() {
        //Given
        int[] nums = {3,1,2,10,1};
        //When
        int[] result = runningSumOf1dArray.runningSum(nums);
        //Then
        assertArrayEquals(new int[]{3,4,6,16,17}, result);
    }
}