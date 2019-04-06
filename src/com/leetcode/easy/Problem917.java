package com.leetcode.easy;
public class Problem917 {
	public String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder(S.replaceAll("[^a-zA-Z]", "")).reverse();
        StringBuilder ans = new StringBuilder();
        for(int i = 0, j = 0; i < S.length(); i++) {
        	if(notLetter(S.charAt(i))) ans.append(S.charAt(i));
        	else {
        		ans.append(sb.charAt(j));
        		j++;
        	}
        }
        return ans.toString();
    }
	boolean notLetter(char c) {
		if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) return false;
		return true;
	}
	
	
}
