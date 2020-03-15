package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem234 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean isPalindrome(ListNode head) {
        List<String> list = new ArrayList<>();
        while(head != null){
            list.add(String.valueOf(head.val));
            head = head.next;
        }
        int i = 0, j = list.size() - 1;
        while(i < j){
            if(!list.get(i++).equals(list.get(j--)))
                return false;
        }
        return true;
    }
}
