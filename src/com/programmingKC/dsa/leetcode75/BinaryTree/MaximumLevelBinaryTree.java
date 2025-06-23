package com.programmingKC.dsa.leetcode75.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;


//  Definition for a binary tree node.

 
class MaximumLevelBinaryTree {
    public int maxLevelSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE;
        int ans = 0, level = 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            level++;
            int sumAtCurrentLevel = 0;
            // Iterate over all the nodes in the current level.
            for (int sz = q.size(); sz > 0; --sz) {
                TreeNode node = q.poll();
                sumAtCurrentLevel += node.val;

                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            if (maxSum < sumAtCurrentLevel) {
                maxSum = sumAtCurrentLevel;
                ans = level;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        // Create a sample binary tree:
        //        1
        //       / \
        //      7   0
        //     / \
        //    7  -8

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(-8);

        MaximumLevelBinaryTree treeAnalyzer = new MaximumLevelBinaryTree();
        int maxLevel = treeAnalyzer.maxLevelSum(root);
        System.out.println("Level with maximum sum: " + maxLevel);
    }
}