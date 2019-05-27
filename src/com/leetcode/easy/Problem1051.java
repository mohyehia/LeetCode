package com.leetcode.easy;

import java.util.Arrays;

public class Problem1051 {
	public int heightChecker(int[] heights) {
        int[] a = Arrays.copyOf(heights, heights.length);
        Arrays.sort(a);
        int count = 0;
        for(int i = 0; i < a.length; i++)
            if(a[i] != heights[i]) count++;
        return count;
    }
}
