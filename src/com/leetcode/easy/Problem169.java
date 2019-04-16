package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Problem169 {
	public int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : nums) {
			if(map.containsKey(i)) {
				int val = map.get(i);
				map.put(i, val + 1);
			}else map.put(i, 1);
		}
		int max = 0, ans = 0, oldMax = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			max = Math.max(max, entry.getValue());
			if(max != oldMax) ans = entry.getKey();
			oldMax = max;
		}
		return ans;
    }
}
