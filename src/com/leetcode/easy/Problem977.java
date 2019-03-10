package com.leetcode.easy;

import java.util.Arrays;

public class Problem977 {
	public static int[] sortedSquares(int[] A) {
        for(int i = 0; i < A.length; i++) A[i] *= A[i];
        Arrays.sort(A);
        return A;
    }

}
