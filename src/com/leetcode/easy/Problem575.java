package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Problem575 {
	public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for(int i : candies)
            set.add(i);
        return Math.min(set.size(), candies.length / 2);
    }
}
