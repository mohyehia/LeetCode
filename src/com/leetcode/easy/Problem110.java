package com.leetcode.easy;

public class Problem110 {
	class TreeNode{
		int val;
		TreeNode left, right;
		TreeNode(int x){
			val = x;
		}
	}
	
	public boolean isBalanced(TreeNode root) {
		if(root == null) return true;
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		
		return (Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    }

	int getHeight(TreeNode root) {
		if(root == null) return 0;
		int l = getHeight(root.left);
		int r = getHeight(root.right);
		
		return Math.max(l, r) + 1;
	}	

}
