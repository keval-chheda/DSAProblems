package com.programmingKC.dsa.dailychallenge.june;

import java.util.Arrays;

import java.util.Arrays;

public class CandyDistribution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        // Step 1: Everyone gets at least 1 candy
        Arrays.fill(candies, 1);

        // Step 2: Left to Right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: Right to Left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Step 4: Sum all candies
        int total = 0;
        for (int c : candies) {
            total += c;
        }

        return total;
    }

    public static void main(String[] args) {
        CandyDistribution sol = new CandyDistribution();

        System.out.println(sol.candy(new int[]{1, 0, 2}));     // Output: 5
        System.out.println(sol.candy(new int[]{1, 2, 2}));     // Output: 4
        System.out.println(sol.candy(new int[]{1, 3, 4, 5, 2})); // Output: 11
    }
}
