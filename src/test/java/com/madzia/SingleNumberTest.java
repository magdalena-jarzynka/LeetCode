package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {

    SingleNumber singleNumber = new SingleNumber();

    @Test
    void testForOneElementInArray() {
        //Given
        int[] array = {4};
        //When
        int result = singleNumber.singleNumber(array);
        //Then
        assertEquals(4, result);

    }

    @Test
    void testForMoreThanOneElementInArray() {
        //Given
        int[] array = {1, 23, 4, 2, 2, 1, 23};
        //When
        int result = singleNumber.singleNumber(array);
        //Then
        assertEquals(4, result);

    }
}