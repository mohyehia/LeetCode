package com.leetcode.easy;
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if(x < 0) return false;
		return x == reverse(x);
	}
	int reverse(int x) {
		x = Math.abs(x);
		int ans = 0;
		while(x > 0) {
			ans = ans * 10 + x % 10;
			x /= 10;
		}
		return ans;
	}
}
