package com.leetcode.easy;
public class Problem796 {
	public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }
}
