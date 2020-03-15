package com.leetcode.easy;

public class Problem125 {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();
        if(s.isEmpty()) return true;
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while(i < j){
            if(arr[i++] != arr[j--])
                return false;
        }
        return true;
    }
}
