package com.leetcode.easy;

public class Problem1290 {
	public int getDecimalValue(ListNode head) {
		StringBuilder sb = new StringBuilder();
		while(head != null) {
			sb.append(head.val);
			head = head.next;
		}
		String num = sb.reverse().toString();
		// base = 2^0 = 1
		int ans = 0, base = 1;
		for(char c : num.toCharArray()) {
			if(c == '1')
				ans += base;
			base *= 2;
		}
		return ans;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}