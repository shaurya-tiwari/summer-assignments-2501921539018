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
    public int countNodesBFS(TreeNode root) {
        // Agar tree khali hai, toh 0 nodes hain
        if (root == null) {
            return 0;
        }

        // BFS ke liye ek Queue (Line) banayi
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); // Main root (sabse pehle node) ko line mein khada kiya

        int count = 0; // Total count rakhne ke liye variable

        // Jab tak line khali na ho jaye, tab tak chalte raho
        while (!queue.isEmpty()) {
            // Line mein jo sabse aage hai, usko bahar nikalo
            TreeNode current = queue.poll();
            
            // Ek node bahar aaya, matlab humne use visit kar liya, toh count badha do
            count++; 
            System.out.println("Visiting Node Level-by-Level: " + current.val);

            // Agar is current node ka Left bacha hai, toh use line ke peeche laga do
            if (current.left != null) {
                queue.add(current.left);
            }

            // Agar is current node ka Right bacha hai, toh use bhi line ke peeche laga do
            if (current.right != null) {
                queue.add(current.right);
            }
        }

        // Jab poori line khatam ho jayegi, tab hamare paas total count hoga
        return count;
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