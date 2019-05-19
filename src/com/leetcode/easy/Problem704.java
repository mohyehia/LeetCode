package com.leetcode.easy;
public class Problem704 {
	public int search(int[] nums, int target) {
		if(nums.length == 1 && nums[0] == target) return 0;
		return binarySearch(nums, target);
	}

	private int binarySearch(int[] a, int target) {
		int left = 0, right = a.length - 1, mid = 0;
		while(left <= right) {
			mid = (left + right) / 2;
			if(target == a[mid]) return mid;
			else if(target < a[mid]) right = mid - 1;
			else left = mid + 1;
		}
		return -1;
	}
	
}
