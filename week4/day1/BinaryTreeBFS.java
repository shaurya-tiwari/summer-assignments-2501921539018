package day1;
import java.util.LinkedList;
import java.util.Queue;

// Pehle TreeNode banana padega (Same as before)
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    // Constructor
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class BinaryTreeBFS {

    // Aapka BFS Method jo nodes count karega
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        
        int rightDepth = maxDepth(root.right);
        
        return 1 + Math.max(leftDepth, rightDepth);
    
    }

    public static void main(String[] args) {
        // Niche hum wohi same tree bana rahe hain:
        //        10
        //       /  \
        //      5    20
        //     / \
        //    3   7
        
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        // Class ka object banaya
        BinaryTreeBFS tree = new BinaryTreeBFS();

        // BFS Method call kiya
        System.out.println("--- BFS Traversal Start ---");
        int totalCount = tree.countNodesBFS(root);
        
        // Final result print kiya
        System.out.println("---------------------------");
        System.out.println("Total nodes in the tree: " + totalCount);
    }
}