package com.leetcode.easy;

public class Problem104 {
	class TreeNode{
		int val;
		TreeNode left, right;
		TreeNode(int x){
			val = x;
		}
	}
	
	public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        int leftHeight = 0, rightHeight = 0;
        if(root.left != null)
        	leftHeight = maxDepth(root.left);
        if(root.right != null)
        	rightHeight = maxDepth(root.right);
        
        int max = Math.max(leftHeight, rightHeight);
        return max + 1;
    }
}
