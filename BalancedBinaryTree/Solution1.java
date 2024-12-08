package BalancedBinaryTree;

public class Solution1 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            int left = getMaxSubtreeHeight(root.left);
            int right = getMaxSubtreeHeight(root.right);
            return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int getMaxSubtreeHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(getMaxSubtreeHeight(root.left), getMaxSubtreeHeight(root.right));
        }
    }
}
