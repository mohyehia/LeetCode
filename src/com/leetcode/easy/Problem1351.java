package com.leetcode.easy;

public class Problem1351 {
	public int countNegatives(int[][] grid) {
		int count = 0, m = 0;
		for(int[] arr : grid) {
			m = arr.length - 1;
			for(int i = m; i >= 0; i--) {
				if(arr[i] < 0) count++;
				else break;
			}
		}
		return count;
	}
}
