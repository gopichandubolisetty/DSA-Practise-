import java.util.Stack;

public class CheckIfTwoTreesAreIdenticalOrNot {

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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();

        TreeNode pcu = p;
        TreeNode qcu = q;

        while (pcu != null || qcu != null || !st1.isEmpty() || !st2.isEmpty()) {
            if (pcu == null && qcu == null) {
                pcu = st1.pop().right;
                qcu = st2.pop().right;
                continue;
            }
            
            if (pcu == null || qcu == null) {
                return false;
            }

            if (pcu.val != qcu.val) {
                return false;
            }

            st1.push(pcu);
            st2.push(qcu);
            pcu = pcu.left;
            qcu = qcu.left;
        }
        
        return true;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        boolean result = isSameTree(p, q);
        System.out.println("Are the two trees identical? " + result);
    }
}