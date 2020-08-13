package com.madzia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Solution for <a href="https://leetcode.com/problems/pascals-triangle/">Pascal's Triangle</a>
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);
        if (numRows >= 2) {
            for (int i = 1; i < numRows; i++) {
                row = new ArrayList<>();
                row.add(1);
                for (int j = 1; j < (i); j++) {
                    row.add(result.get(i - 1).get(j) + result.get(i - 1).get(j - 1));
                }
                row.add(1);
                result.add(row);
            }
        }
        return result;
    }
}
