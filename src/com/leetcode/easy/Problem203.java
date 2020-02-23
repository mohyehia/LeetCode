package com.leetcode.easy;

// 203. Remove Linked List Elements
public class Problem203 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode prev = head, curr = head.next;
        while(curr != null){
            if(curr.val != val){
                prev.next = curr;
                prev = prev.next;
            } else prev.next = null;
            curr = curr.next;
        }
        return head.val == val ? head.next : head;
    }
}
