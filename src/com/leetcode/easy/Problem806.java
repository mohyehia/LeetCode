package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Problem806 {
	public int[] numberOfLines(int[] widths, String S) {
        int units = 0, lines = 1;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < 26; i++) {
        	char c = (char) (i + 97);
        	map.put(c, widths[i]);
        }
        for(int i = 0; i < S.length(); i++) {
        	char c = S.charAt(i);
        	int val = map.get(c);
        	if(units + val <= 100) units += val;
        	else {
        		lines++; units = val;
        	}
        }
        return new int[]{lines, units};
    }
}
