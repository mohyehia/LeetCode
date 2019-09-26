package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
	public List<List<Integer>> minimumAbsDifference(int[] arr) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(arr);
		int len = arr.length - 1, min = arr[1] - arr[0];
		for (int i = 0; i < len; i++) {
			int temp = arr[i + 1] - arr[i];
			if(temp < min) {
				min = temp;
				list.clear();
			}
			if(arr[i + 1] - arr[i] == min)
				list.add(Arrays.asList(arr[i], arr[i + 1]));
		}
		return list;
	}
}
