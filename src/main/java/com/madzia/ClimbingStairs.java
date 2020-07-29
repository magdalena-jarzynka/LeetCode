package com.madzia;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int result = -1;
        if (n == 1) {
            result = 1;
        }
        if (n == 2) {
            result = 2;
        }
        if (n > 2) {
            result = climbStairs(n-1) + climbStairs(n-2);
        }
        return result;
    }
}


