package com.leetcode.easy;

import java.util.*;

public class Problem1380 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> minValues = new HashSet<>();
        int min, max;
        for (int[] row : matrix) {
            min = Arrays.stream(row).min().getAsInt();
            minValues.add(min);
        }
        for(int i = 0; i < matrix[0].length; i++){
            max = matrix[0][i];
            for(int j = 0; j < matrix.length; j++){
                max = Math.max(max, matrix[j][i]);
            }
            if(minValues.contains(max))
                ans.add(max);
        }
        return ans;
    }

}
