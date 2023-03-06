package com.example.RomainP01.algorithmstraining.datastructures.tree;

import com.example.RomainP01.algorithmstraining.model.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(Arrays.asList(root.val));
        List<List<Integer>> leftList = levelOrder(root.left);
        List<List<Integer>> rightList = levelOrder(root.right);
        for (int i = 0; i < Math.max(leftList.size(), rightList.size()); i++) {
            List<Integer> newList = new ArrayList<>();
            if (i < leftList.size()) {
                newList.addAll(leftList.get(i));
            }
            if (i < rightList.size()) {
                newList.addAll(rightList.get(i));
            }
            list.add(newList);
        }
        return list;
    }

}
