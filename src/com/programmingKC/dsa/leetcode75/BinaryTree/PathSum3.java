package com.programmingKC.dsa.leetcode75.BinaryTree;

import java.util.HashMap;
import java.util.Map;


class PathSum3 {
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0L, 1); // Base case: prefix sum 0 has one count
        return dfs(root, 0, targetSum, prefixSumCount);
    }

    private int dfs(TreeNode node, long currentSum, int targetSum, Map<Long, Integer> prefixSumCount) {
        if (node == null)
            return 0;

        currentSum += node.val;
        int count = prefixSumCount.getOrDefault(currentSum - targetSum, 0);

        prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);

        count += dfs(node.left, currentSum, targetSum, prefixSumCount);
        count += dfs(node.right, currentSum, targetSum, prefixSumCount);

        prefixSumCount.put(currentSum, prefixSumCount.get(currentSum) - 1); // Backtrack

        return count;
    }

    public static void main(String[] args) {
        /*
         * Example Tree:
         *       10
         *      /  \
         *     5   -3
         *    / \    \
         *   3   2   11
         *  / \   \
         * 3  -2   1
         *
         * Target Sum = 8
         */

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);

        PathSum3 solution = new PathSum3();
        int result = solution.pathSum(root, 8);
        System.out.println("Number of paths with sum 8: " + result);
    }
}
