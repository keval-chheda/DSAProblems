package com.programmingKC.dsa.dailychallenge.june;

import java.util.LinkedList;
import java.util.Queue;

public class MaxCandies {
	public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
		int n = status.length;
		boolean[] hasBox = new boolean[n];
		boolean[] hasKey = new boolean[n];
		boolean[] used = new boolean[n];
		Queue<Integer> queue = new LinkedList<>();

		for (int box : initialBoxes) {
			hasBox[box] = true;
			queue.offer(box);
		}

		int totalCandies = 0;

		boolean changed = true;
		while (changed) {
			changed = false;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int box = queue.poll();
				if (!hasBox[box] || (!hasKey[box] && status[box] == 0) || used[box]) {
					queue.offer(box); // retry later
					continue;
				}

				used[box] = true;
				totalCandies += candies[box];
				changed = true;

				// Collect keys
				for (int key : keys[box]) {
					if (!hasKey[key]) {
						hasKey[key] = true;
					}
				}

				// Collect contained boxes
				for (int inner : containedBoxes[box]) {
					if (!hasBox[inner]) {
						hasBox[inner] = true;
					}
					queue.offer(inner);
				}
			}
		}

		return totalCandies;
	}

	public static void main(String[] args) {
		MaxCandies sol = new MaxCandies();
		int[] status = { 1, 0, 1, 0 };
		int[] candies = { 7, 5, 4, 100 };
		int[][] keys = { {}, {}, { 1 }, {} };
		int[][] containedBoxes = { { 1, 2 }, { 3 }, {}, {} };
		int[] initialBoxes = { 0 };

		System.out.println(sol.maxCandies(status, candies, keys, containedBoxes, initialBoxes)); // Output: 16
	}
}
