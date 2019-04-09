package com.leetcode.easy;
public class Problem788 {
	public int rotatedDigits(int N) {
		int count = 0;
		for(int i = 2; i <= N; i++)
			if(valid(i)) count++;
		return count;
    }

	private boolean valid(int num) {
		boolean valid = false;
		int digit = 0;
		while(num > 0) {
			digit = num % 10;
			if(digit == 2 || digit == 5 || digit == 6 || digit == 9)
				valid = true;
			else if(digit == 3 || digit == 4 || digit == 7)
				return false;
			num /= 10;
		}
		return valid;
	}
	
}
