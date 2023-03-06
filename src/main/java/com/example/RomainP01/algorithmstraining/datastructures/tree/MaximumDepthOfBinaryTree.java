package com.example.RomainP01.algorithmstraining.datastructures.tree;

import com.example.RomainP01.algorithmstraining.model.TreeNode;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
