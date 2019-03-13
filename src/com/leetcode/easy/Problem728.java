package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem728 {
	
	public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(; left <= right; left++)
        	if(isDivided(left)) ans.add(left);
        return ans;
    }
	
	static boolean isDivided(int num) {
		String s = String .valueOf(num);
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '0') return false;
			if(num % Integer.valueOf(String.valueOf(c)).intValue() != 0) return false;
		}
		return true;
	}
}
