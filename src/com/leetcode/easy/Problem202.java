package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Problem202 {
	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		set.add(n);
		return getSum(n, set);
    }

	private boolean getSum(int n, Set<Integer> set) {
		if(n == 1) return true;
		int remainder = 0, sum = 0;
		while(n > 0) {
			remainder = n % 10;
			sum += Math.pow(remainder, 2);
			n /= 10;
		}
		if(set.contains(sum)) return false;
		set.add(sum);
		return getSum(sum, set);
	}

}
