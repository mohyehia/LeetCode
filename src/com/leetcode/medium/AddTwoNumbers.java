package com.leetcode.medium;

public class AddTwoNumbers {
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null)
			return null;
		ListNode ans = new ListNode(-1);
		ListNode current = ans;
		int carry = 0, l1Val, l2Val, sum;
		while((l1 != null || l2 != null) || carry == 1) {
			l1Val = 0;
			l2Val = 0;
			if(l1 != null) {
				l1Val = l1.val;
				l1 = l1.next;
			}
			if(l2 != null) {
				l2Val = l2.val;
				l2 = l2.next;
			}
			sum = l1Val + l2Val + carry;
			if(sum < 10) 
				carry = 0;
			else {
				sum %= 10;
				carry = 1;
			}
			current.next = new ListNode(sum);
			current = current.next;
		}
		return ans.next;
	}
}
