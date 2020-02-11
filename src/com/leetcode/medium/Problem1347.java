package com.leetcode.medium;

public class Problem1347 {
	public int minSteps(String s, String t) {
        int len = s.length(), count = 0;
        int [] arr = new int[26];
        for(int i = 0; i < len; i++) {
        	arr[s.charAt(i) - 'a']++;
        	arr[t.charAt(i) - 'a']--;
        }
        for(int i : arr) {
        	if(i > 0)
        		count += i;
        }
        return count;
    }
}
