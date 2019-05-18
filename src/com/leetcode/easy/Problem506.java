package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem506 {
	public String[] findRelativeRanks(int[] nums) {
		int len = nums.length;
		String[] medals = {"Gold Medal", "Silver Medal", "Bronze Medal"};
		String[] ans = new String[len];
		
		int[] a = Arrays.copyOf(nums, len);
		Arrays.sort(a);
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < len; i++) 
			map.put(a[i], len - 1 - i);
		
		int rank = 0;
		
		for (int i = 0; i < len; i++) {
			rank = map.get(nums[i]);
			ans[i] = rank < 3 ? medals[rank] : String.valueOf(rank + 1);
		}
		
		return ans;
	}
}
