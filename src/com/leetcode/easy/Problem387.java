package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Problem387 {
	public int firstUniqChar(String s) {
		char[] a = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(char c : a)
			map.put(c, map.getOrDefault(c, 0) + 1);
		for(int i = 0; i < a.length; i++)
			if(map.get(a[i]) == 1) return i;
		return -1;
	}
}
