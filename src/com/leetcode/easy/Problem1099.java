package com.leetcode.easy;

import java.util.Arrays;

public class Problem1099 {
	public int twoSumLessThanK(int[] A, int K) {
        int s = 0, left = 0, right = A.length - 1;
        Arrays.sort(A);
        while(left < right) {
        	int sum = A[left] + A[right];
        	if(sum > K) right--;
        	else if(sum < K) left++;
        	else right--;
        	if(sum > s && sum < K)
        		s = sum;
        }
        return s == 0 ? -1 : s;
    }
}
