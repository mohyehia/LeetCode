package com.leetcode.easy;

public class Problem1281 {
	public int subtractProductAndSum(int n) {
		int sum = 0, product = 1, remainder;
		while(n > 0) {
			remainder = n % 10;
			sum += remainder;
			product *= remainder;
			n /= 10;
		}
		return product - sum;
	}
}
