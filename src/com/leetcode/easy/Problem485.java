package com.leetcode.easy;
public class Problem485 {
	public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0, count = 0;
        for(int i = 0; i < nums.length; i++) {
        	if((nums[i] & 1) == 1) count++;
        	else count = 0;
        	ans = Math.max(ans, count);
        }
        return ans;
    }
}
