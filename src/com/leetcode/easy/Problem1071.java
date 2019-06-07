package com.leetcode.easy;
public class Problem1071 {
	public String gcdOfStrings(String str1, String str2) {
		return gcd(str1, str2);
    }

	private String gcd(String a, String b) {
		if(a.length() == 0) return b;
		if(b.length() == 0 || a.equals(b)) return a;
		
		int aLen = a.length(), bLen = b.length();
		if(aLen > bLen) {
			for(int i = 0; i < bLen; i++)
				if(a.charAt(i) != b.charAt(i)) return "";
			String temp = a.substring(bLen);
			return gcd(temp, b);
		} else if(bLen > aLen)
			return gcd(b, a);
		return "";
	}
}
