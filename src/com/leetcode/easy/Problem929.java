package com.leetcode.easy;

import java.util.LinkedHashSet;

public class Problem929 {
	
	public int numUniqueEmails(String[] emails) {
        LinkedHashSet<String> uniqueEmails = new LinkedHashSet<>();
        for(int i = 0; i < emails.length; i++)
        	uniqueEmails.add(extractLocal(emails[i]) + extractDomain(emails[i]));
        return uniqueEmails.size();
    }
	
	static String extractLocal(String str) {
		StringBuilder s = new StringBuilder();
		char[] a = str.toCharArray();
		for(int i = 0; i < a.length; i++) {
			char ch = a[i];
			if(ch == '.') continue;
			if(ch == '+' || ch == '@') break;
			s.append(ch);
		}
		return s.toString();
	}
	
	static String extractDomain(String str) {
		String st = "";
		char[] a = str.toCharArray();
		for(int i = 0; i < a.length; i++) {
			if(a[i] != '@') continue;
			st = new String(a, i, a.length - i);
		}
		return st;
	}
	
}
