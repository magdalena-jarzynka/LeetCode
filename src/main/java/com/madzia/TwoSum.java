package com.madzia;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution for <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (numsMap.containsKey(difference) && i != numsMap.get(difference)) {
                result[0] = i;
                result[1] = numsMap.get(difference);
                break;
            }
        }
        return result;
    }
}
