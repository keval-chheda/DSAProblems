package com.programmingKC.dsa.leetcode75;

public class StringCompression {
//	443. String Compression
	public int compress(char[] chars) {
		int index = 0;
		int i = 0;

		while (i < chars.length) {
			char currentchar = chars[i];
			int count = 0;

			while (i < chars.length && chars[i] == currentchar) {
				i++;
				count++;
			}
			chars[index++] = currentchar;

			if (count > 1) {
				String countStr = Integer.toString(count);
				for (char c : countStr.toCharArray()) {
					chars[index++] = c;
				}
			}
		}
		return index;

	}

}
