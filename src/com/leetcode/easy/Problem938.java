package com.leetcode.easy;

public class Problem938 {
	class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	}
	
	int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null)
        	return 0;
        if(root.val <= R && root.val >= L)
        	sum += root.val;
        if(root.val > L)
        	rangeSumBST(root.left, L, R);
        if(root.val < R)
        	rangeSumBST(root.right, L, R);
        return sum;
    }
}
