package day3;

public class LowestCommonAncestorofaBinarySearchree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }

        

            if (p.val<root.val && q.val< root.val) {
                lowestCommonAncestor(root.left,p,q);
                
            }
            else if (p.val>root.val && q.val>root.val) {
                lowestCommonAncestor(root.right , p , q);
            }


            else {
                return root;
            }
            
        
        return null;
    }

    public static void main(String[] args) {

    }
}
