package com.leetcode.easy;

import java.util.Arrays;

public class Problem961 {
	public int repeatedNTimes(int[] A) {
        int num = 0, count = 1, n = A.length / 2;
        Arrays.sort(A);
        for(int i = 0; i < A.length - 1; i++) {
        	if(A[i] == A[i + 1]) {
        		count++;
        		if(count == n) {
        			num = A[i];
        			break;
        		}
        	}else count = 1;
        }
        return num;
    }
}
