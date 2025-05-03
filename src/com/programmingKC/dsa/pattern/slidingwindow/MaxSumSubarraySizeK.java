package com.programmingKC.dsa.pattern.slidingwindow;

public class MaxSumSubarraySizeK {
	public static int maxSum(int[] nums, int k) {
		int maxSum = 0, windowSum = 0;

		// First window
		for (int i = 0; i < k; i++) {
			windowSum += nums[i];
		}
		maxSum = windowSum;

		// Slide the window
		for (int i = k; i < nums.length; i++) {
			windowSum += nums[i] - nums[i - k];
			maxSum = Math.max(maxSum, windowSum);
		}

		return maxSum;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 1, 5, 1, 3, 2 };
		int k = 3;
		System.out.println("Max Sum: " + maxSum(nums, k));
	}
}
