package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    MajorityElement majorityElement = new MajorityElement();

    @Test
    void shouldReturnMajorityElement() {
        //Given
        int[] input = {2, 2, 1, 1, 1, 2, 2};
        //When
        int result = majorityElement.majorityElement(input);
        //Then
        assertEquals(2, result);
    }
}