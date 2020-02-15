package com.leetcode.easy;

public class Problem1299 {
	public int[] replaceElements(int[] arr) {
        if(arr.length == 1) {
        	arr[0] = -1;
        	return arr;
        }
        int len = arr.length;
        for(int i = 0; i < len - 1; i++) {
        	arr[i] = getMax(arr, i + 1);
        }
        arr[len - 1] = -1;
        return arr;
    }

	private int getMax(int[] arr, int startIndex) {
		int max = 0;
		for(int i = startIndex; i < arr.length; i++)
			max = Math.max(max, arr[i]);
		return max;
	}
}
