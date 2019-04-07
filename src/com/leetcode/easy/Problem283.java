package com.leetcode.easy;
public class Problem283 {
	public void moveZeroes(int[] nums) {
		int curr = 0, len = nums.length;
		for(int i = 0; i < len - 1; i++) {
			if(nums[i] == 0) {
				curr = i;
				for(int j = i + 1; j < len; j++) {
					if(nums[j] != 0) {
						swap(nums, curr, j);
						curr = j;
					}
				}
			}
		}
    }

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
