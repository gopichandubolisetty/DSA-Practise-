import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
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

public class PostorderTraversal {
    
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;
        
        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                TreeNode peekNode = stack.peek();
                
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    curr = peekNode.right;
                } else {
                    result.add(peekNode.val);
                    lastVisited = stack.pop();
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> traversalResult = postorderTraversal(root);
        
        System.out.println("Postorder Traversal Output: " + traversalResult);
    }
}