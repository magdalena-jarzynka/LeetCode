package com.madzia;

/**
 * Solution for <a href="https://leetcode.com/problems/n-th-tribonacci-number/">N-th Tribonacci Number</a>
 */
public class NthTribonacciNumber {

    private int n;

    public int tribonacci(int n) {
        this.n = n;

        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return tribonacci(3, 0, 1, 1);
    }

    private int tribonacci(int i, int nMinusThree, int nMinusTwo, int nMinusOne) {
        int sum = nMinusThree + nMinusTwo + nMinusOne;
        if (i == n) {
            return sum;
        }
        nMinusThree = nMinusTwo;
        nMinusTwo = nMinusOne;
        nMinusOne = sum;
        i++;
        return tribonacci(i, nMinusThree, nMinusTwo, nMinusOne);
    }
}
