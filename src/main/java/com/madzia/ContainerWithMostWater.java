package com.madzia;

/**
 * Solution for <a href="https://leetcode.com/problems/container-with-most-water/">Container With Most Water</a>
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int result = 0;

        int firstIndex = 0;
        int lastIndex = height.length - 1;

        while (firstIndex != lastIndex) {
            int tempResult;
            if (height[firstIndex] <= height[lastIndex]) {
                tempResult = height[firstIndex] * (lastIndex - firstIndex);
                firstIndex++;
            } else {
                tempResult = height[lastIndex] * (lastIndex - firstIndex);
                lastIndex--;
            }
            if (tempResult > result) {
                result = tempResult;
            }
        }
        return result;
    }
}
