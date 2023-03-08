package com.example.RomainP01.algorithmstraining.datastructures.tree;

import com.example.RomainP01.algorithmstraining.model.TreeNode;

public class SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        if (root.val > val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }
}
