package com.leetcode.easy;

import java.util.Arrays;

public class Problem852 {
	public int peakIndexInMountainArray(int[] A) {
		int[] sortedA = Arrays.copyOf(A, A.length);
        Arrays.sort(sortedA);
        int ans = sortedA[A.length - 1];
        for(int i = 0; i < A.length; i++)
        	if(ans == A[i]) return i;
        return ans;
    }
}
