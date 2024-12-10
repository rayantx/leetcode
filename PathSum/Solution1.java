package PathSum;

import java.util.Stack;

public class Solution1 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();

        nodeStack.add(root);
        sumStack.add(targetSum - root.val);

        while (!nodeStack.isEmpty()) {
            TreeNode currentNode = nodeStack.pop();
            int currentSum = sumStack.pop();

            if (currentNode.left == null && currentNode.right == null && currentSum == 0) {
                return true;
            }

            if (currentNode.left != null) {
                nodeStack.add(currentNode.left);
                sumStack.add(currentSum - currentNode.left.val);
            }

            if (currentNode.right != null) {
                nodeStack.add(currentNode.right);
                sumStack.add(currentSum - currentNode.right.val);
            }
        }
        return false;
    }
}
