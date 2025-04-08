package com.hackerrank.dsa.basic;

import java.io.*;
import java.util.*;

public class JavaStringManipulation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		
		
		String c = A + B;
		System.out.println(c.length());
		System.out.println(A.compareTo(B)>0?"Yes":"No");
		
		String capitalA = A.substring(0,1).toUpperCase() + A.substring(1);
		String capitalB = B.substring(0,1).toUpperCase() + B.substring(1);

		System.out.println( capitalA+ " "+capitalB);

	}

}
