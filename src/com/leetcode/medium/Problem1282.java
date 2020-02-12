package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1282 {
	public List<List<Integer>> groupThePeople(int[] arr) {
        int len = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < len; i++) {
        	if(map.containsKey(arr[i])) {
        		map.get(arr[i]).add(i);
        	}else {
        		map.put(arr[i], new ArrayList<>());
        		map.get(arr[i]).add(i);
        	}
        	if(map.get(arr[i]).size() == arr[i]) {
        		ans.add(map.get(arr[i]));
        		map.remove(arr[i]);
        	}
        }
        return ans;
    }
}
