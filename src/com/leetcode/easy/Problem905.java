package com.leetcode.easy;

import java.util.ArrayList;

public class Problem905 {
	public int[] sortArrayByParity(int[] A) {
		ArrayList<Integer> evens = new ArrayList<>();
		ArrayList<Integer> odds = new ArrayList<>();
		for(int i = 0; i < A.length; i++) {
			if(A[i] % 2 == 0) evens.add(A[i]);
			else odds.add(A[i]);
		}
		evens.addAll(odds);
		int[] sortedA = new int[A.length];
		for(int i = 0; i < A.length; i++)
			sortedA[i] = evens.get(i);
		return sortedA;
    }
}
