package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class SmallestCommonElement {
	public int smallestCommonElement(int[][] mat) {
		Map<Integer, Integer> map = new HashMap<>();
		int len = mat.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < mat[i].length; j++)
				map.put(mat[i][j], map.getOrDefault(mat[i][j], 0) + 1);
		}
		
		int commonElement = Integer.MAX_VALUE;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() == len)
				commonElement = Math.min(commonElement, entry.getKey());
		}
		return commonElement < Integer.MAX_VALUE ? commonElement : -1;
	}
}
