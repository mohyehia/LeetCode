package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem5083 {
	public String[] findOcurrences(String text, String first, String second) {
        String[] s = text.split(" ");
        int len = s.length;
        if(len < 3) return new String[] {};
        List<String> ans = new ArrayList<>();
        for(int i = 2; i < len; i++) {
        	if(s[i - 2].equals(first) && s[i - 1].equals(second))
        		ans.add(s[i]);
        }
        return ans.toArray(new String[ans.size()]);
    }
}
