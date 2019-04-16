package com.leetcode.easy;
public class Problem520 {
	public boolean detectCapitalUse(String word) {
		if(word.equals(word.toUpperCase())) return true;
		if(word.equals(word.toLowerCase())) return true;
		
		if(word.length() > 1) {
			if(Character.isUpperCase(word.charAt(0))) {
				String temp = word.substring(1);
				if(temp.equals(temp.toLowerCase())) return true;
			}
		}
		
		return false;
	}
}
