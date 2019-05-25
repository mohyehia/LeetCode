package com.leetcode.easy;
public class Problem541 {
	public String reverseStr(String s, int k) {
		int n = k * 2, left, right;
		char[] a = s.toCharArray();
		
		for(int i = 0; i < a.length; i += n) {
			left = i;
			right = Math.min(i + k - 1, a.length - 1);
			
			while(left < right) {
				char temp = a[left];
				a[left++] = a[right];
				a[right--] = temp;
			}
		}
		return new String(a);
	}
}
