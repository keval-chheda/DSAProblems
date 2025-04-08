package com.programmingKC.dsa.leetcode75;

public class MergeStringAlternatively {
	public static String mergeAlternately(String word1, String word2) {
		StringBuilder result = new StringBuilder();
		int i = 0, j = 0;
		while (i < word1.length() || j < word2.length()) {
			if (i < word1.length()) {
				result.append(word1.charAt(i));
				i++;
			}
			if (j < word2.length()) {
				result.append(word2.charAt(j));
				j++;
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "pqr";
		System.out.println(mergeAlternately(word1, word2));
	}

}
