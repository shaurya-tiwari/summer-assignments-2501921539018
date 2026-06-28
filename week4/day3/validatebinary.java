package day3;

public class validatebinary {
      public boolean isValidBST(TreeNode root) {
        return checkvalidbst(root , Long.MIN_VALUE , Long.MAX_VALUE );
    }

   public boolean checkvalidbst(TreeNode root, long min ,long max ){

        if(root == null){
           return true;
        }


        if(root.val <= min || root.val >=max){
            return false;
        }

        return  checkvalidbst(root.left , min , root.val) && checkvalidbst(root.right , root.val , max);
    }

}
