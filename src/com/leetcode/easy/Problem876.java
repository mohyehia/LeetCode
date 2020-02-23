package com.leetcode.easy;

public class Problem876 {
     class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode middleNode(ListNode head) {
         ListNode curr = head;
         int size = 0;
         while(curr != null){
             size++;
             curr = curr.next;
         }
         int middle = size / 2, i = 1;
         ListNode ans = head;
         while(i++ <= middle){
             ans = ans.next;
         }
        return ans;
    }

    public ListNode middleNodeUsingArray(ListNode head){
         // max number of nodes = 100 & min number = 1
         ListNode[] arr = new ListNode[100];
         int i = 0;
         while(head != null){
             arr[i++] = head;
             head = head.next;
         }
         // return element with index = last element index(i) / 2
        return arr[i / 2];
    }
}
