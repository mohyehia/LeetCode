package com.leetcode.easy;

import java.util.Arrays;

public class Problem561 {
	public int arrayPairSum(int[] nums) {
		int sum = 0;
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i += 2) {
			if(i >= nums.length) break;
			sum += nums[i];
		}
		return sum;
    }
}
