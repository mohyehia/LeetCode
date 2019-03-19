package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Problem884 {
	public String[] uncommonFromSentences(String A, String B) {
        String[] a = A.split(" ");
        String[] b = B.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String word : a) {
        	if(!map.containsKey(word)) map.put(word, 1);
        	else map.put(word, 2);
        }
        for(String word : b) {
        	if(!map.containsKey(word)) map.put(word, 1);
        	else map.put(word, 2);
        }
        List<String> uncommonList = new ArrayList<>();
        for(Entry<String, Integer> entry : map.entrySet()) {
        	if(entry.getValue() == 1) 
        		uncommonList.add(entry.getKey());
        }
        String[] ans = new String[uncommonList.size()];
        for(int i = 0; i < ans.length; i++)
        	ans[i] = uncommonList.get(i);
        return ans;
    }
}
