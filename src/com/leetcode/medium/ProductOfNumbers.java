package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class ProductOfNumbers {
	List<Integer> nums;
	public ProductOfNumbers() {
		nums = new ArrayList<>();
	}
	
	public void add(int num) {
		if(num == 0)
			nums.clear();
		else {
			int size = nums.size();
			if(size == 0) nums.add(num);
			else nums.add(num * nums.get(size - 1));
		}
    }
	
	public int getProduct(int k) {
		int size = nums.size();
		if(k > size)
			return 0;
		else if( k == size)
			return nums.get(size - 1);
		else
			return nums.get(size - 1) / nums.get(size - k - 1);
    }
}
