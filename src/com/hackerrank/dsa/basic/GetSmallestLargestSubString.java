package com.hackerrank.dsa.basic;

import java.util.Scanner;

public class GetSmallestLargestSubString {

	 public static String getSmallestAndLargest(String s, int k) {
	        // Initialize smallest and largest with the first substring of length k
	        String smallest = s.substring(0, k);
	        String largest = s.substring(0, k);

	        // Loop through all substrings of length k
	        for (int i = 1; i <= s.length() - k; i++) {
	            // Extract substring of length k starting at index i
	            String substring = s.substring(i, i + k);

	            // Update smallest and largest based on lexicographical comparison
	            if (substring.compareTo(smallest) < 0) {
	                smallest = substring; // Update smallest
	            }
	            if (substring.compareTo(largest) > 0) {
	                largest = substring; // Update largest
	            }
	        }

	        return smallest + "\n" + largest;
	    }
	  
	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();

	        System.out.println(getSmallestAndLargest(s, k));
	    }

}
