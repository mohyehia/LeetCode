package com.leetcode.easy;
public class Problem867 {
	public int[][] transpose(int[][] A){
		int row = A.length, col = A[0].length;
		int[][] ans = new int[col][row];
		for(int i = 0; i < row; i++)
			for(int j = 0; j < col; j++)
				ans[j][i] = A[i][j];
		return ans;
	}
}
