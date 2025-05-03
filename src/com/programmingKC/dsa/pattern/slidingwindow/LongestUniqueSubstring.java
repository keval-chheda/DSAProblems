package com.programmingKC.dsa.pattern.slidingwindow;

import java.util.HashSet;


/**
 * Input: "abcabcbb" Output: 3 Explanation: The answer is "abc", with length 3.
 * Its better to debug and understand how it shrinks from left to right siding
 * window pattern can be mostly used wit arrays
 */

public class LongestUniqueSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Longest substring length: " + lengthOfLongestSubstring(input));
    }
}
