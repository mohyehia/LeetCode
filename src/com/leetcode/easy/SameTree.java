package com.leetcode.easy;

import java.util.Stack;

public class SameTree {
	class TreeNode{
		int val;
		TreeNode left, right;
		TreeNode(int x){
			val = x;
		}
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(!equals(p, q)) return false;
		Stack<TreeNode> st1 = new Stack<>();
		Stack<TreeNode> st2 = new Stack<>();
		st1.push(p);
		st2.push(q);
		
		while(!st1.isEmpty()) {
			p = st1.pop();
			q = st2.pop();
			if(!equals(p, q)) return false;
			if(p != null) {
				//check left nodes
				if(!equals(p.left, q.left)) return false;
				if(p.left != null) {
					st1.push(p.left);
					st2.push(q.left);
				}
				//check right nodes
				if(!equals(p.right, q.right)) return false;
				if(p.right != null) {
					st1.push(p.right);
					st2.push(q.right);
				}
			}
		}
		
		return true;
	}
	
	boolean equals(TreeNode p, TreeNode q) {
		if(p == null && q == null) return true;
		if(p == null || q == null) return false;
		if(p.val != q.val) return false;
		return true;
	}
}
