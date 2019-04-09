package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Problem349 {
	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums1) {
        	for(int j : nums2) {
        		if(i == j) {
        			set.add(i); break;
        		}
        	}
        }
        int[] a = new int[set.size()];
        int i = 0;
        for(int val : set) a[i++] = val;
        return a;
    }
}
