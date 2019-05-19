package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem350 {
	public int[] intersect(int[] nums1, int[] nums2) {
		if(nums1.length == 0 || nums2.length == 0)
			return new int[0];
		Map<Integer, Integer> freq = new HashMap<>();
		List<Integer> ans = new ArrayList<>();
		
		for(int i : nums1)
			freq.put(i, freq.getOrDefault(i, 0) + 1);
		
		for(int i : nums2) {
			if(freq.containsKey(i) && freq.get(i) > 0) {
				ans.add(i);
				freq.put(i, freq.get(i) - 1);
			}
		}
		
		return ans.stream().mapToInt(i -> i).toArray();
	}
}
