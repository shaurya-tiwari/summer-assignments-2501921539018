package day4;

public class binarytreemaxsum {
    public int maxPathSum(TreeNode root) {
        int[] maxSum = new int[1];
        maxSum[0] = Integer.MIN_VALUE;
        
        calculateMaxPath(root, maxSum);

        return maxSum[0];
    }

    private int calculateMaxPath(TreeNode root, int[] maxSum) {
        if (root == null) {
            return 0;
        }

        // Negatives ko ignore karne wala logic
        int leftSum = Math.max(0, calculateMaxPath(root.left, maxSum));
        int rightSum = Math.max(0, calculateMaxPath(root.right, maxSum));

        // Naya possible max rasta nikalna
        int currentPathSum = leftSum + rightSum + root.val;
        maxSum[0] = Math.max(maxSum[0], currentPathSum);

        // Upar wale boss ko seedha rasta return karna
        return root.val + Math.max(leftSum, rightSum);
    }
}
