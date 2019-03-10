package com.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;

public class Problem804 {
	public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
       
        HashMap<Character, String> map = new HashMap<>();
        for(int i = 0; i < morseCodes.length; i++)
        	map.put(alphabet.charAt(i), morseCodes[i]);
        
        HashSet<String> count = new HashSet<>();
        for(String word : words) {
        	StringBuilder st = new StringBuilder();
        	for(int i = 0; i < word.length(); i++)
        		st.append(map.get(word.charAt(i)));
        	count.add(st.toString());
        }
        return count.size();
    }
}
