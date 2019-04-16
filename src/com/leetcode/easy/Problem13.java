package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Problem13 {
	public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        if(s.length() == 1) return map.get(s.charAt(0));
        int count = 0;
        for(int i = 0; i < s.length() - 1; i++) {
        	char curr = s.charAt(i);
        	char next = s.charAt(i + 1);
        	int val = map.get(curr);
        	if(val < map.get(next)) count += -val;
        	else count += val;
        }
        return count + map.get(s.charAt(s.length() - 1));
    }
}
