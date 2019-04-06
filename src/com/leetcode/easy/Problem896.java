package com.leetcode.easy;
public class Problem896 {
	public boolean isMonotonic(int[] A) {
		if(A.length == 1) return true;
		boolean inc = false, dec = false;
		for (int i = 0; i < A.length - 1; i++) {
			if(A[i] < A[i + 1]) inc = true;
			else if(A[i] > A[i + 1]) dec = true;
			if(inc && dec) return false;
		}
		return true;
    }
}
