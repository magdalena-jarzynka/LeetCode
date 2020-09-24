package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterTest {

    ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    void testSimpleInput() {
        //Given
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        //When
        int result = containerWithMostWater.maxArea(array);
        //Then
        assertEquals(49, result);
    }
}