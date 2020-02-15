package com.leetcode.medium;

public class Problem1343 {
	
	public int numOfSubarrays(int[] arr, int k, int threshold) {
		int len = arr.length, sum = 0, count = 0;
		for(int i = 0; i < k - 1; i++)
			sum += arr[i];
		for(int i = k - 1; i < len; i++) {
			sum += arr[i];
			if(sum / k >= threshold)
				count++;
			// remove first element from the sum
			sum -= arr[i - k + 1];
		}
		return count;
	}
}
