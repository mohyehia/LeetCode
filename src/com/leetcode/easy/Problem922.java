package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem922 {
	public int[] sortArrayByParityII(int[] A) {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        for(int i = 0; i < A.length; i++) {
        	if(A[i] % 2 == 0) evens.add(A[i]);
        	else odds.add(A[i]);
        }
        List<Integer> sorted = new ArrayList<>();
        for(int i = 0; i < evens.size(); i++) {
        	sorted.add(evens.get(i));
        	sorted.add(odds.get(i));
        }
        int [] ans = new int[A.length];
        for(int i = 0; i < sorted.size(); i++)
        	ans[i] = sorted.get(i);
        return ans;
    }
}
