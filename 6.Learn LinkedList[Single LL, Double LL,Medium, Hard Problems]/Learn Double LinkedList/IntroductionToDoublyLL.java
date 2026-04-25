class Node{
    int data;
    Node left;
    Node right;

    Node(int data1){
        this.data = data1;
        this.left=null;
        this.right=null;
    }

    Node(int data1,Node left1,Node right1){
        this.data=data1;
        this.left=left1;
        this.right=right1;
    }
}


public class IntroductionToDoublyLL {
    public static void main(String[] args){
        Node head = new Node(10);
        head.right = new Node(20,head,null);
        head.right.right = new Node(30,head.right,null);

        System.out.println(head.right.right);
    }
}
