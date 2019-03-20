package com.leetcode.easy;
public class Problem136 {
	public int singleNumber(int[] nums) {
        int ans = 0;
        for(int num : nums)
            ans ^= num;
        return ans;
    }
}
