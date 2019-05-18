package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem830 {
	public List<List<Integer>> largeGroupPositions(String S) {
		List<List<Integer>> ans = new ArrayList<>();
		
		char[] a = S.toCharArray();
		int len = S.length(), start = 0, i = 0;
		
		while (i < len - 2) {
			if(i >= len - 2) break;
			start = i;
			if(a[i] == a[i + 1] && a[i + 1] == a[i + 2]) {
				i += 2;
				while(i < len - 1) {
					if(a[i] != a[i + 1]) break;
					i++;
				}
				ans.add(Arrays.asList(new Integer[] {start, i}));
			} else i++;
		}
		
		return ans;
	}
}
