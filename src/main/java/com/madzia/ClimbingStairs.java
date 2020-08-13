package com.madzia;

/**
 * Solution for <a href="https://leetcode.com/problems/climbing-stairs/">Climbing Stairs</a>
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int result = -1;
        if (n == 1) {
            result = 1;
        }
        if (n == 2) {
            result = 2;
        }
        if (n >= 3) {
            int result1 = 1;
            int result2 = 2;
            for (int i = 3; i <= n; i++) {
                result = result1 + result2;
                result1 = result2;
                result2 = result;
            }
        }
        return result;
    }
}


