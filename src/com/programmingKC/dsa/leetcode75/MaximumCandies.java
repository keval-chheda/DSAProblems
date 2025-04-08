package com.programmingKC.dsa.leetcode75;

import java.util.ArrayList;
import java.util.List;

public class MaximumCandies {

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> result = new ArrayList<>();
		int maxCandies = 0;

		for (int candy : candies) {
			maxCandies = Math.max(maxCandies, candy);
		}

		for (int candy : candies) {
			result.add(candy + extraCandies >= maxCandies);
		}
		return result;
	}

	public static void main(String[] args) {
		MaximumCandies sol = new MaximumCandies();
		int[] candies = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;
		System.out.println(sol.kidsWithCandies(candies, extraCandies));

	}

}
