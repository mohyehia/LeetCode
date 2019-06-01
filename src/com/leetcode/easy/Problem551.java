package com.leetcode.easy;
public class Problem551 {
	public boolean checkRecord(String s) {
		int aCount = 0, lCount = 0;
		for(char c : s.toCharArray()) {
			if(c == 'P') {
				lCount = 0;
				continue;
			} else if(c == 'A') {
				aCount++;
				lCount = 0;
				if(aCount > 1) return false;
			} else if(c == 'L') {
				lCount++;
				if(lCount > 2) return false;
			}
		}
		return true;
    }
}
