package com.leetcode.easy;
public class Problem944 {
	public static int minDeletionSize(String[] A) {
        int count = 0;
        for(int j = 0; j < A[0].length(); j++) {
        	int i = 0;
        	for(; i < A.length - 1;) {
        		if(A[i].charAt(j) > A[i + 1].charAt(j)) {
        			count++; break;
        		} else i++;
        	}
        }
        return count;
    }
	
	public static void main(String[] args) {
		System.out.println(minDeletionSize(new String[]{"zyx","wvu","tsr"}));
	}
}
