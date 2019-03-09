package com.leetcode.easy;
public class Problem709 {
	
	public String toLowerCase(String str) {
        char[] a = str.toCharArray();
        for(int i = 0; i < a.length; i++) {
        	if(Character.isUpperCase(a[i])) a[i] = (char) (a[i] + 32);
        }
        return new String(a);
    }
}
