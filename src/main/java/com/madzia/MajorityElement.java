package com.madzia;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int result = 0;
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        for (int num : numsSet) {
            long count = Arrays.stream(nums).filter(n -> n == num).count();
            if (count > nums.length / 2) {
                result = num;
                break;
            }
        }
        return result;
    }
}
