package com.madzia;

/**
 * Solution for <a href="https://leetcode.com/problems/sort-colors/">Sort Colors</a>
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int countZero = 0;
        int countOne = 0;
        for (int num : nums) {
            if (num == 0) {
                countZero++;
            }
            if (num == 1) {
                countOne++;
            }
        }
        for (int x = 0; x < countZero; x++) {
            nums[x] = 0;
        }
        for (int y = countZero; y < countZero + countOne; y++) {
            nums[y] = 1;
        }
        for (int z = countZero + countOne; z < nums.length; z++) {
            nums[z] = 2;
        }
    }
}
