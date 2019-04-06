package com.leetcode.easy;
public class Problem824 {
	public String toGoatLatin(String S) {
		StringBuilder builder = new StringBuilder();
		String vowels = "aeiouAEIOU";
		int countOfA = 1;
		for(String word : S.split(" ")) {
			if(vowels.indexOf(word.charAt(0)) > -1)
				builder.append(word + "ma" + addA(countOfA) + " ");
			else {
				String temp = word.substring(1);
				builder.append(temp + word.charAt(0) + "ma" + addA(countOfA) + " ");
			}
			countOfA++;
		}
		return builder.toString().trim();
    }
	String addA(int count) {
		StringBuilder s = new StringBuilder("");
		while(count > 0) {
			s.append("a"); count--;
		}
		return s.toString();
	}
	
}
