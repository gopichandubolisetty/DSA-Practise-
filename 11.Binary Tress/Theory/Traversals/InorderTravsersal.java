import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { 
        this.val = val; 
    }
}

public class InorderTravsersal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(true) {
            if(node != null) {
                stack.push(node);
                node = node.left;
            } else {
                if(stack.isEmpty()) {
                    break;
                }
                node = stack.pop();
                inorder.add(node.val);
                node = node.right;
            }
        }
        return inorder;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        InorderTravsersal traversal = new InorderTravsersal();
        List<Integer> result = traversal.inorderTraversal(root);
        System.out.println(result);
    }
}