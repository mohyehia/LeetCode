package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Problem217 {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> temp = new HashSet<>();
		for(int i : nums) {
			if(temp.contains(i)) return true;
			temp.add(i);
		}
		return false;
	}
}
