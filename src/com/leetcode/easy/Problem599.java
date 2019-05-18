package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem599 {
	public String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> map = new HashMap<>();
		List<String> ans = new ArrayList<>();
		for (int i = 0; i < list1.length; i++) 
			map.put(list1[i], i);
		
		int sum = 0, minSum = Integer.MAX_VALUE;
		
		for (int i = 0; i < list2.length; i++) {
			if(map.containsKey(list2[i])) {
				sum = map.get(list2[i]) + i;
				if(sum < minSum) {
					ans.clear();
					ans.add(list2[i]);
				} else if(sum == minSum)
					ans.add(list2[i]);
				minSum = sum;
			}
		}
		
		return ans.toArray(new String[ans.size()]);
	}
}
