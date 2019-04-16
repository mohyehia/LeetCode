package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        
        if(nums.length == 0) return ans;
        
        Arrays.sort(nums);
        
        for(int i : nums) set.add(i);
        
        for(int i = 1; i <= nums.length; i++)
        	if(set.add(i)) ans.add(i);
        
        return ans;
    }
}
