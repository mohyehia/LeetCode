package com.leetcode.easy;
public class Problem908 {
	public int smallestRangeI(int[] A, int K) {
        int min = A[0], max = A[0];
        for(int i = 0; i < A.length; i++) {
        	min = Math.min(min, A[i]);
        	max = Math.max(max, A[i]);
        }
        return Math.max(0, max - min - 2*K);
    }
}
