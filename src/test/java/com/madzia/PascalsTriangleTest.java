package com.madzia;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {

    PascalsTriangle pascalsTriangle = new PascalsTriangle();

    @Test
    void testZeroRows() {
        //Given
        int numRows = 0;
        //When
        List<List<Integer>> result = pascalsTriangle.generate(numRows);
        //Then
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    void testOneRow() {
        //Given
        int numRows = 1;
        //When
        List<List<Integer>> result = pascalsTriangle.generate(numRows);
        //Then
        assertEquals(Collections.singletonList(Collections.singletonList(1)), result);
    }

    @Test
    void testTwoRows() {
        //Given
        int numRows = 2;
        //When
        List<List<Integer>> result = pascalsTriangle.generate(numRows);
        //Then
        assertEquals(Arrays.asList(Collections.singletonList(1), Arrays.asList(1, 1)), result);
    }

    @Test
    void testTreeRows() {
        //Given
        int numRows = 3;
        //When
        List<List<Integer>> result = pascalsTriangle.generate(numRows);
        //Then
        assertEquals(Arrays.asList(
                Collections.singletonList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1)
        ), result);
    }

    @Test
    void testSevenRows() {
        //Given
        int numRows = 7;
        //When
        List<List<Integer>> result = pascalsTriangle.generate(numRows);
        //Then
        assertEquals(Arrays.asList(
                Collections.singletonList(1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1),
                Arrays.asList(1, 4, 6, 4, 1),
                Arrays.asList(1, 5, 10, 10, 5, 1),
                Arrays.asList(1, 6, 15, 20, 15, 6, 1)
        ), result);
    }

}