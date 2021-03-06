package com.madzia;

/**
 * Solution for <a href="https://leetcode.com/problems/move-zeroes/">Move Zeroes</a>
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int countZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            } else {
                nums[i - countZero] = nums[i];
            }
        }
        for (int i = 1; i <= countZero; i++) {
            nums[nums.length - i] = 0;
        }
    }
}
