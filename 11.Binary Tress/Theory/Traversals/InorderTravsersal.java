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
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode node = root;
        while(true){
            if(node!=null){
                stack.push(node);
                node = node.left;
            }else{

                if(stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                result.add(node.val);
                node = node.right;

            }
        }
        return result;
    }

   public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        InorderTravsersal traversal = new InorderTravsersal();
        List<Integer> result = traversal.inorderTraversal(root);
        System.out.println(result);
    }
}