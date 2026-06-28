package day4;

public class dimeterorbinarytree {
    int dia = 0;
    public int diameterOfBinaryTree(TreeNode root ) {

        solve(root);
        return dia;

    }


        public int solve(TreeNode root){

            if(root==null){
                return 0;
            }

            int l = solve(root.left);
            int r = solve(root.right);
            dia = Math.max(l+r,dia);
            return Math.max(l,r)+1;
     }

}
