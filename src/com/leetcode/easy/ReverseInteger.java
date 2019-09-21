package com.leetcode.easy;
public class ReverseInteger {
	public int reverse(int x) {
		int ans = 0;
		
		while(x != 0) {
			if((long)ans * 10 > Integer.MAX_VALUE || (long)ans * 10 < Integer.MIN_VALUE)
				return 0;
			ans = ans * 10 + x % 10;
			x /= 10;
		}
		
		return ans;
	}
}
