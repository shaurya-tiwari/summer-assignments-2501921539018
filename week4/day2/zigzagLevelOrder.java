package day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zigzagLevelOrder {
    public static void main(String[] args) {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Boolean islefttoright = true;
        if(root==null) {
            return ans;
        }  
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentlist = new ArrayList<>();
            for(int i = 0 ; i < levelsize; i ++){
                TreeNode current = queue.poll();   
                if(islefttoright==true) {
                    currentlist.add(current.val);
                }
                else{
                    currentlist.add(0,current.val);
                }
                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);
            }
            ans.add(currentlist);
            islefttoright = !islefttoright;
        }
        return ans;
    }
    }
}
