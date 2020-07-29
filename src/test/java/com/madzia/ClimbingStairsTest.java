package com.madzia;

import org.junit.jupiter.api.Test;

import java.net.Authenticator;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    void testInput1() {
        //Given
        int input = 1;
        //When
        int result = climbingStairs.climbStairs(input);
        //Then
        assertEquals(1, result);
    }

    @Test
    void testInput2() {
        //Given
        int input = 2;
        //When
        int result = climbingStairs.climbStairs(input);
        //Then
        assertEquals(2, result);
    }

    @Test
    void testInput3() {
        //Given
        int input = 3;
        //When
        int result = climbingStairs.climbStairs(input);
        //Then
        assertEquals(3, result);
    }

    @Test
    void testInput5() {
        //Given
        int input = 5;
        //When
        int result = climbingStairs.climbStairs(input);
        //Then
        assertEquals(8, result);
    }

    @Test
    void testInput15() {
        //Given
        int input = 15;
        //When
        int result = climbingStairs.climbStairs(input);
        //Then
        assertEquals(987, result);
    }

    @Test
    void testInput45() {
        //Given
        int input = 45;
        //When
        int result = climbingStairs.climbStairs(input);
        //Then
        assertEquals(1836311903, result);
    }
}