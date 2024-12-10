package MinimumDepthOfBinaryTree;

public class Solution1 {
    public int minDepth(TreeNode root) {
        return root == null ? 0 : getMinDepth(root);
    }

    public int getMinDepth(TreeNode node) {
        if (node == null) return Integer.MAX_VALUE;
        if (node.left == null && node.right == null) return 1;

        return Math.min(getMinDepth(node.left), getMinDepth(node.right)) + 1;
    }
}
