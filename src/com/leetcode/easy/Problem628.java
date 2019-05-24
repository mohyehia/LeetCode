package com.leetcode.easy;

import java.util.Arrays;

public class Problem628 {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		
		int sumNeg = 1, sumPos = 1, len = nums.length;
		
		sumNeg = nums[0] * nums[1] * nums[len - 1];
		sumPos = nums[len - 1] * nums[len - 2] * nums[len - 3];
		return Math.max(sumNeg, sumPos);
	}
}
