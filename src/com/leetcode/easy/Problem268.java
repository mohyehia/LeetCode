package com.leetcode.easy;

import java.util.Arrays;

public class Problem268 {
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		
		if(nums[0] != 0) return 0;
		
		if(nums[n - 1] != n) return n;
		
		int num = 0;
		for(int i = 1; i < n; i++) {
			num = nums[i - 1] + 1;
			if(nums[i] != num) return num;
		}
		
		return -1;
	}
}
