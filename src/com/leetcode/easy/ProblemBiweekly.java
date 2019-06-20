package com.leetcode.easy;

import java.util.Arrays;

public class ProblemBiweekly {
	public int sumOfDigits(int[] A) {
		Arrays.sort(A);
		return getSum(A[0]) % 2 == 0 ? 1 : 0;
    }

	private int getSum(int i) {
		int sum = 0;
		while(i > 0) {
			sum += i % 10;
			i /= 10;
		}
		return sum;
	}
}
