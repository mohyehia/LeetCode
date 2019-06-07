package com.leetcode.easy;
public class Problem504 {
	public String convertToBase7(int num) {
        if(num == 0) return "0";
        
        boolean flag = false;
        StringBuilder ans = new StringBuilder();
        if(num < 0) {
        	flag = true;
        	num *= -1;
        }
        while(num > 0) {
        	ans.append(num % 7);
        	num /= 7;
        }
        
        return flag ? "-" : "" + ans.reverse().toString();
    }
}
