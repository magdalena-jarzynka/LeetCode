package com.madzia;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution for <a href="https://leetcode.com/problems/single-number/">Single Number</a>
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.stream().findFirst().get();
    }
}
