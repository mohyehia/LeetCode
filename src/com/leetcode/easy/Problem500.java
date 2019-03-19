package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem500 {
	public String[] findWords(String[] words) {
		List<String> ans = new ArrayList<>();
		for(String word : words)
			if(valid(word)) ans.add(word);
		String[] s = new String[ans.size()];
		for(int i = 0; i < s.length; i++)
			s[i] = ans.get(i);
		return s;
    }
	int getLine(char c) {
		if("QWERTYUIOPqwertyuiop".indexOf(c) != -1) return 1;
		if("ASDFGHJKLasdfghjkl".indexOf(c) != -1) return 2;
		if("ZXCVBNMzxcvbnm".indexOf(c) != -1) return 3;
		return -1;
	}
	boolean valid(String word) {
		int lineNum = getLine(word.charAt(0));
		for(int i = 1; i < word.length(); i++)
			if(getLine(word.charAt(i)) != lineNum) return false;
		return true;
	}
}
