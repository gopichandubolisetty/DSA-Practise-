public class CheckForBalancedBinaryTree {

    public static class TreeNode {
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

    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }
    
    private int checkHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) {
            return -1;
        }
        
        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) {
            return -1;
        }
        
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        CheckForBalancedBinaryTree solver = new CheckForBalancedBinaryTree();

        TreeNode root1 = new TreeNode(1,
            new TreeNode(2, new TreeNode(4), new TreeNode(5)),
            new TreeNode(3)
        );

        TreeNode root2 = new TreeNode(1,
            new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null),
            new TreeNode(2)
        );

        System.out.println(solver.isBalanced(root1)); 
        System.out.println(solver.isBalanced(root2)); 
    }
}