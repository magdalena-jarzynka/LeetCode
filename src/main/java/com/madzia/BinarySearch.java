package com.madzia;

/**
 * Solution for <a href="https://leetcode.com/problems/binary-search/">Binary Search</a>
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int firstIndex = 0;
        int lastIndex = nums.length - 1;
        while (firstIndex < lastIndex) {
            int midIndex = (firstIndex + lastIndex) / 2;
            if (nums[midIndex] >= target) {
                lastIndex = midIndex;
            } else if (nums[midIndex] < target) {
                firstIndex = midIndex + 1;
            }
        }
        if (nums[lastIndex] == target) {
            return lastIndex;
        } else {
            return -1;
        }
    }
}
