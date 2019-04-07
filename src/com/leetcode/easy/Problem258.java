package com.leetcode.easy;
public class Problem258 {
	public int addDigits(int num) {
		if(num < 10) return num;
		return addDigits(sumDigits(num));
    }
	int sumDigits(int num) {
		int sum = 0;
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
	
}
