package com.madzia;

/**
 * Solution for <a href="https://leetcode.com/problems/fibonacci-number/">Fibonacci Number</a>
 */
public class FibonacciNumber {

    private int n;

    public int fib(int n) {
        this.n = n;

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(2, 1, 0);
    }

    private int fib(int i, int nMinusOne, int nMinusTwo) {
        int sum = nMinusOne + nMinusTwo;
        if (i == n) {
            return sum;
        } else {
            nMinusTwo = nMinusOne;
            nMinusOne = sum;
            i++;
            return fib(i, nMinusOne, nMinusTwo);
        }
    }
}