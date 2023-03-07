package com.example.RomainP01.algorithmstraining.datastructures.tree;

import com.example.RomainP01.algorithmstraining.model.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        TreeNode newTree = new TreeNode();
        if (root== null){
            return null;
        }
        newTree.val = root.val;
        newTree.left = invertTree(root.right);
        newTree.right = invertTree(root.left);
        return newTree;
    }

    //optimized
    public TreeNode invertTreeOptimized(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
