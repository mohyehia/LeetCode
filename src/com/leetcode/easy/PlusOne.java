package com.leetcode.easy;

import java.math.BigInteger;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		StringBuilder builder = new StringBuilder();
		for(int i : digits) builder.append(i);
		BigInteger bigInteger = new BigInteger(builder.toString());
		bigInteger = bigInteger.add(BigInteger.ONE);
		char[] s = bigInteger.toString().toCharArray();
		int[] ans = new int[s.length];
		for(int i = 0; i < ans.length; i++)
			ans[i] = s[i] - '0';
		return ans;
    }
}
