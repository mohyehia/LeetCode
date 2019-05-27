package com.leetcode.easy;

import java.util.Arrays;

public class Problem1046 {
	public int lastStoneWeight(int[] stones) {
		// base cases
        if(stones.length == 0) return 0;
        if(stones.length == 1) return stones[0];
        
        Arrays.sort(stones);
        int len = stones.length;
        int x = stones[len - 2], y = stones[len - 1];
        
        if(x == y)
        	stones = Arrays.copyOfRange(stones, 0, len - 2);
        else {
        	y -= x;
        	stones[len - 2] = y;
        	stones = Arrays.copyOfRange(stones, 0, len - 1);
        }
        return lastStoneWeight(stones);
    }
}
