package com.leetcode.google.medium;

public class TrimBinarySearchTree {
	public TreeNode trimBST(TreeNode root, int L, int R) {
		// base case
		if (root == null) {
			return null;
		}

		// recursive rule
		if (root.val >= L && root.val <= R) {
			root.left = trimBST(root.left, L, R);
			root.right = trimBST(root.right, L, R);
			return root;
		} else if (root.val < L) {
			root.right = trimBST(root.right, L, R);
			return root.right;
		} else { // root.val > R
			root.left = trimBST(root.left, L, R);
			return root.left;
		}
	}
}