package day5;

public class symmetrictree {
    ublic boolean isSymmetric(TreeNode root) {
        if(root==null){
            return false;
        }
        
        return checkmirror(root.left , root.right);
    }

    public boolean checkmirror(TreeNode leftnode, TreeNode rigtnode){

        if(leftnode==null && rigtnode==null){
            return true;
        }

        if(leftnode==null || rigtnode==null){
            return false;
        }

        if(leftnode.val != rigtnode.val){
            return false;
        }

        boolean leftside = checkmirror(leftnode.left , rigtnode.right);
        boolean rightside = checkmirror(leftnode.right , rigtnode.left);


        return leftside && rightside;

    }
}
