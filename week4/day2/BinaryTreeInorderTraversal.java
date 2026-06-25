package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
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
    public List<Integer> inorderTraversal(TreeNode root) {
        
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();

            TreeNode current = root;

            while (current!= null || !stack.isEmpty()) {
                
              while (current!=null) {
                stack.push(current);
                current = current.left;
              }

              current = stack.pop();
              list.add(current.val);

              //move to right 

              current = current.right;

            }


            return list;

            
    }
    public static void main(String[] args) {

    }
}
