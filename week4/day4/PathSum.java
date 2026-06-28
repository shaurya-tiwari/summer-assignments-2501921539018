package day4;

public class PathSum {

 public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }

        if(root.left==null && root.right==null && root.val ==targetSum ){
            return true ;
        }
        //tyraverse 
        boolean lefttt=hasPathSum( root.left, targetSum-root.val);
        boolean righttt=hasPathSum( root.right, targetSum-root.val);
        
        return lefttt||righttt;
    }
    public static void main(String[] args) {
        
    }
}
