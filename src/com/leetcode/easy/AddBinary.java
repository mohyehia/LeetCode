package com.leetcode.easy;

public class AddBinary {
	public static void main(String[] args) {
		System.out.println(Integer.parseInt("1010", 2));
	}
	public static String addBinary(String a, String b) {
		long sum = Long.parseLong(a, 2) + Long.parseLong(b, 2), remainder = 0;	
		if(sum == 0)
			return "0";
		String ans = "";
		while(sum > 0) {
			remainder = sum % 2;
			ans = remainder + ans;
			sum /= 2;
		}
		return ans;
	}
}
