package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem257 {
	class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root == null) return ans;
        
        dfs(ans, new StringBuilder(), root);
        return ans;
    }

	private void dfs(List<String> ans, StringBuilder stringBuilder,
			TreeNode root) {
		if(root.left == null && root.right == null) {
			stringBuilder.append(root.val);
			ans.add(stringBuilder.toString());
			return;
		}
		
		stringBuilder.append(root.val + "->");
		
		if(root.left != null)
			dfs(ans, new StringBuilder(stringBuilder), root.left);
		
		if(root.right != null)
			dfs(ans, new StringBuilder(stringBuilder), root.right);
	}
}
