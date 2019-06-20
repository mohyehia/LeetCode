package com.leetcode.easy;

public class Problem88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0, right = 0, index = 0;
        int[] a = new int[m + n];
        while(left < m && right < n) {
        	if(nums1[left] <= nums2[right])
        		a[index] = nums1[left++];
        	else a[index] = nums2[right++];
        	index++;
        }
        if(left == m && index < (m + n)) {
        	while(right < n)
        		a[index++] = nums2[right++];
        }
        if(right == n && index < (m + n)) {
        	while(left < m)
        		a[index++] = nums1[left++];
        }
        for(int i = 0; i < nums1.length; i++)
        	nums1[i] = a[i];
    }
}
