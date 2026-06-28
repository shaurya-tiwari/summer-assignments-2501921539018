package day5;

public class ConstructBinaryreefromPreorderandInorderTraversal {
    

    public static void main(String[] args) {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        
        int[] preorderIndex = new int[]{0}; 
        return construct(preorder, 0, inorder.length - 1, inorderMap, preorderIndex);
    }

    private TreeNode construct(int[] preorder, int inStart, int inEnd, Map<Integer, Integer> inorderMap, int[] preorderIndex) {
        if (inStart > inEnd) {
            return null;
        }

        int rootValue = preorder[preorderIndex[0]];
        TreeNode root = new TreeNode(rootValue);
        preorderIndex[0]++; 

        int rootIndexInMap = inorderMap.get(rootValue);

        root.left = construct(preorder, inStart, rootIndexInMap - 1, inorderMap, preorderIndex);
        root.right = construct(preorder, rootIndexInMap + 1, inEnd, inorderMap, preorderIndex);

        return root;
    }
    }
}
