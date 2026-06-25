package day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
     public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer> ans = new ArrayList<>();

        if(root == null) {
            return ans;
        }


        Queue<Treenode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentlevelist = new ArrayList<>();
            for(int i = 0; i < levelsize; i++){
                TreeNode current = queue.poll();

                currentlevelist.add(current.val);

                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);
            }
            ans.add(ccurrentlevelist);
        }

        return ans;
    }

        

    public static void main(String[] args) {
        
    }
}
