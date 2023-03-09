package com.example.RomainP01.algorithmstraining.datastructures.tree;

import com.example.RomainP01.algorithmstraining.model.TreeNode;

public class TwoSumIVInputIsABST {
    public boolean findTarget(TreeNode root, int k) {
        return findTarget(root, root, k);
    }

    private boolean findTarget(TreeNode root, TreeNode current, int k) {
        if (current == null) {
            return false;
        }
        return findTarget(root, current.left, k) || findTarget(root, current.right, k) || find(root, k - current.val, current);
    }

    private boolean find(TreeNode root, int k, TreeNode current) {
        if (root == null) {
            return false;
        }
        if (root.val == k && root != current) {
            return true;
        }
        if (root.val < k) {
            return find(root.right, k, current);
        }
        return find(root.left, k, current);
    }
}
