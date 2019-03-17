package com.leetcode.easy;
public class Problem821 {
	public int[] shortestToChar(String S, char C) {
        char[] a = S.toCharArray();
        int[] ans = new int[a.length];
        for(int i = 0; i < a.length; i++) {
        	if(a[i] == C) ans[i] = 0;
        	else {
        		int rightCount = 1, leftCount = 1;
        		//loop right direction
        		boolean rightFound = false;
        		for(int j = i + 1; j < a.length; j++) {
        			if(a[j] != C) rightCount++;
        			else {
        				rightFound = true; break;
        			}
        		}
        		//loop left direction
        		boolean leftFound = false;
        		for(int j = i - 1; j >= 0; j--) {
        			if(a[j] != C) leftCount++;
        			else {
        				leftFound = true; break;
        			}
        		}
        		if(rightFound && leftFound) ans[i] = Math.min(rightCount, leftCount);
        		else if(rightFound) ans[i] = rightCount;
        		else ans[i] = leftCount;
        	}
        }
        return ans;
    }
}
