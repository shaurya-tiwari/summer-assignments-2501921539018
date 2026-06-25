package day1;
public class InvertBinaryTree {

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

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }
        //hold data swap 
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        //. traverse 
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        return root;
    }

    public static void main(String[] args) {

    }
}
