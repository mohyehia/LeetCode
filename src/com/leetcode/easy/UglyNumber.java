package com.leetcode.easy;

public class UglyNumber {
	public boolean isUgly(int num) {
		if(num < 1) return false;
		if(num == 1 || num == 2 || num == 3 || num == 5) return true;
		// base cases
		if(num % 2 == 0) return isUgly(num / 2);
		if(num % 3 == 0) return isUgly(num / 3);
		if(num % 5 == 0) return isUgly(num / 5);
		
		return false;
	}
	
//	public boolean isUgly(int num) {
//        //iterative solution
//		if(num < 1) return false;
//		while(num > 1) {
//			if(num % 2 == 0) {
//				num /= 2;
//				continue;
//			}else if(num % 3 == 0) {
//				num /= 3;
//				continue;
//			}else if(num % 5 == 0) {
//				num /= 5;
//				continue;
//			}else return false;
//		}
//		return true;
//    }
}
