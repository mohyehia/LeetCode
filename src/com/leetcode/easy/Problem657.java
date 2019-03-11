package com.leetcode.easy;

import java.util.HashMap;

public class Problem657 {
	public boolean judgeCircle(String moves) {
		int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('R', 1);
        map.put('L', -1);
        map.put('U', 2);
        map.put('D', -2);
        for(int i = 0; i < moves.length(); i++)
        	count += map.get(moves.charAt(i));
        return count == 0;
    }
}
