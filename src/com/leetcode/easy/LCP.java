package com.leetcode.easy;
public class LCP {
	public static String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0) return "";
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while(strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if(prefix.isEmpty()) return "";
			}
		}
		return prefix;
	}
	
	public static void main(String[] args) {
		String[] s =  {"flower","flow","flight"};
		System.out.println(s[2].indexOf("flow"));
		System.out.println(s[0].substring(0, s[0].length() - 1));
		System.out.println(longestCommonPrefix(s));
	}
}
