package com.leetcode.easy;
public class Problem83 {
	class ListNode{
		int val;
		ListNode next;
		public ListNode(int x) {val = x;}
	}
	
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode curr = head, nextNode = null;
        while(curr != null && curr.next != null) {
            nextNode = curr.next;
            if(curr.val == nextNode.val)
                curr.next = nextNode.next;
            else curr = curr.next;
        }
        return head;
    }
}
