package com.madzia;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        boolean result;
        int newN = n;

        while (newN != 0 && newN % 3 == 0) {
            newN = newN / 3;
        }

        result = newN == 1;
        return result;
    }
}
