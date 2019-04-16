package com.leetcode.easy;
public class Problem696 {
	public int countBinarySubstrings(String s) {
        int counter = 0;
        int[] groups = new int[s.length()];
        groups[0] = 1;
        for(int i = 1; i < s.length(); i++) {
        	if(s.charAt(i - 1) != s.charAt(i))
        		groups[++counter] = 1;
        	else groups[counter]++;
        }
        int ans = 0;
        for(int i = 1; i < s.length(); i++)
        	ans += Math.min(groups[i - 1], groups[i]);
        return ans;
    }
}
