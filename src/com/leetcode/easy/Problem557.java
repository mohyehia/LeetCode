package com.leetcode.easy;
public class Problem557 {
	public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for(String word : words)
        	builder.append(new StringBuilder(word).reverse().toString() + " ");
        return builder.toString().trim();
    }
}
