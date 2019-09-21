package com.leetcode.easy;

import java.util.Arrays;

public class MaxNumberOfApples {
	public int maxNumberOfApples(int[] arr) {
        int count = 0, sum = 5000;
        Arrays.sort(arr);
        for(int i : arr){
        	sum -= i;
            if(sum >= 0)
                count++;
            else return count;
        }
        return count;
    }
}
