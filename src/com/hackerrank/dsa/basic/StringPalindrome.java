package com.hackerrank.dsa.basic;

import java.io.*;
import java.util.*;

public class StringPalindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		sc.close();

		// Check if the string is equal to its reverse
		String reversed = new StringBuilder(A).reverse().toString();
		if (A.equals(reversed)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
