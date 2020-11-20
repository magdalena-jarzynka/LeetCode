package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniquePathsTest {

    UniquePaths uniquePaths = new UniquePaths();

    @Test
    void uniquePathsForM3N1() {
        //Given
        int m = 3;
        int n = 1;
        //When
        int result = uniquePaths.uniquePaths(m, n);
        //Then
        assertEquals(1, result);
    }

    @Test
    void uniquePathsForM3N3() {
        //Given
        int m = 3;
        int n = 3;
        //When
        int result = uniquePaths.uniquePaths(m, n);
        //Then
        assertEquals(6, result);
    }

    @Test
    void uniquePathsForM1N1() {
        //Given
        int m = 1;
        int n = 1;
        //When
        int result = uniquePaths.uniquePaths(m, n);
        //Then
        assertEquals(1, result);
    }

    @Test
    void uniquePathsForM23N12() {
        //Given
        int m = 23;
        int n = 12;
        //When
        int result = uniquePaths.uniquePaths(m, n);
        //Then
        assertEquals(193536720, result);
    }

    @Test
    void uniquePathsForM7N3() {
        //Given
        int m = 7;
        int n = 3;
        //When
        int result = uniquePaths.uniquePaths(m, n);
        //Then
        assertEquals(28, result);
    }
}