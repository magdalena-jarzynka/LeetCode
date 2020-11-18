package com.madzia;

/**
 * Solution for <a href="https://leetcode.com/problems/sort-colors/">Sort Colors</a>
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int lastIndex = nums.length - 1;
        int firstIndex = 0;

        while (nums[firstIndex] == 0 && firstIndex != lastIndex) {
            firstIndex++;
        }
        while (nums[lastIndex] == 2 && firstIndex != lastIndex) {
            lastIndex--;
        }

        for (int i = firstIndex; i <= lastIndex && firstIndex != lastIndex; i++) {
            if (nums[i] == 2) {
                int temp = nums[lastIndex];
                nums[lastIndex] = nums[i];
                nums[i] = temp;
                lastIndex--;
                while (nums[lastIndex] == 2 && firstIndex != lastIndex) {
                    lastIndex--;
                }
            }
            if (nums[i] == 0) {
                int temp = nums[firstIndex];
                nums[firstIndex] = nums[i];
                nums[i] = temp;
                firstIndex++;
            }
        }
    }
}
