package com.leetcode.easy;
public class Problem762 {
	public int countPrimeSetBits(int L, int R) {
        int ans = 0;
        for(int i = L; i <= R; i++){
            if(isBitPrime(Integer.bitCount(i))) ans++;
        }
        return ans;
    }
	
	boolean isBitPrime(int i) {
		return (i == 2 || i == 3 || i == 5 || i == 7 || i == 11 ||
				i == 13 || i == 17 || i == 19);
	}
}
