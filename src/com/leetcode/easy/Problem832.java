package com.leetcode.easy;
public class Problem832 {
	public static int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i < A.length; i++) {
        	int left = 0, right = A[i].length - 1, temp = 0;
        	while(left <= right) {
        		temp = 1 - A[i][left];
        		A[i][left] = 1 - A[i][right];
        		A[i][right] = temp;
        		left++;
        		right--;
        	}
        }
        return A;
    }
}
