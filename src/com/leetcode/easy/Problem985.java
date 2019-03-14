package com.leetcode.easy;
public class Problem985 {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int[] ans = A;
        for(int i = 0; i < A.length; i++) {
        	A[queries[i][1]] += queries[i][0];
        	ans[i] = sumEven(A);
        }
        return ans;
    }

	private int sumEven(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++)
			if(a[i] % 2 == 0) sum += a[i];
		return sum;
	}
	
}
