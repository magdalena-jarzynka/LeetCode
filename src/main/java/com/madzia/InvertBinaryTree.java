package com.madzia;

/**
 * Solution for <a href="https://leetcode.com/problems/invert-binary-tree/">Invert Binary Tree</a>
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left != null || root.right != null) {
            TreeNode tempRight = root.right;
            root.right = root.left;
            root.left = tempRight;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
