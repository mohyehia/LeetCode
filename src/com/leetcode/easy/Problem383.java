package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Problem383 {
	public boolean canConstruct(String ransomNote, String magazine) {
		if(ransomNote.length() > magazine.length()) return false;
		Map<Character, Integer> map = new HashMap<>();
		for(char c : magazine.toCharArray()) {
			if(!map.containsKey(c)) map.put(c, 1);
			else map.put(c, map.get(c) + 1);
		}
		for(char c : ransomNote.toCharArray()) {
			if(!map.containsKey(c)) return false;
			if(map.get(c) > 0)
				map.put(c, map.get(c) - 1);
			else return false;
		}
		return true;
	}
}
