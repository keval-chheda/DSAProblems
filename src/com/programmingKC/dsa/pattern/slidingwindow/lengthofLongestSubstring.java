package com.programmingKC.dsa.pattern.slidingwindow;

import java.util.HashSet;

/**
 * 6522556 -  shrinking from left if found the same character in set and 
 * increasing from right everytime till length of string
*/
public class lengthofLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, maxLen = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

	public static void main(String[] args) {
		String input1 = "abcabcbb";
		System.out.println("Input: " + input1 + " => Output: " + lengthOfLongestSubstring(input1)); // 3 }
	}
}
