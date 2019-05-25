package com.leetcode.easy;

import java.util.Stack;

public class Problem844 {
	public boolean backspaceCompare(String S, String T) {
		if(S.length() == 1 && T.length() == 1) {
			if(S.charAt(0) == T.charAt(0)) return true;
			else return false;
		}
		
		Stack<Character> sList = new Stack<>();
		Stack<Character> tList = new Stack<>();
		
		for(char c : S.toCharArray()) {
			if(c == '#'){
				if(!sList.isEmpty()) sList.pop();
			} else sList.push(c);
		}
		
		for(char c : T.toCharArray()) {
			if(c == '#') {
				if(!tList.isEmpty()) tList.pop();
			} else tList.push(c);
		}
		
		return sList.equals(tList);
    }
}
