package day5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeandDeserializeBinaryTree {
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder(); 
        buildString(root, sb);
        return sb.toString();
    }

    private void buildString(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("N,");
            return;
        }
        sb.append(root.val).append(",");
        buildString(root.left, sb);
        buildString(root.right, sb);
    }

    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return buildTree(queue);
    }

    private TreeNode buildTree(Queue<String> queue) {
        String current = queue.poll();
        if (current.equals("N")) {
            return null;
        }
        
        TreeNode root = new TreeNode(Integer.parseInt(current));
        root.left = buildTree(queue);
        root.right = buildTree(queue);
        
        return root;
    }
}
