package com.leetcode.easy;

public class Problem860 {
	public boolean lemonadeChange(int[] bills) {
		int[] count = new int[3];
		for(int i : bills) {
			if(i == 5) count[0]++;
			else if(i == 10) {
				if(count[0] > 0) {
					count[0]--;
					count[1]++;
				}else return false;
			}else {
				if(count[0] > 0 && count[1] > 0) {
					count[0]--;
					count[1]--;
					count[2]++;
				}else if(count[0] > 2) {
					count[0] -= 3;
					count[2]++;
				}else return false;
			}
		}
		return true;
	}
}
