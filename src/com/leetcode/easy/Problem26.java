package com.leetcode.easy;
public class Problem26 {
	public int removeDuplicates(int[] nums) {
        int len = nums.length, index = 0;
        
        for(int i = 1; i < len; i++){
            if(nums[index] != nums[i]){
                index++;
                nums[index] = nums[i];
            }
        }
        
        return index + 1;
    }
}
