class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}



public class DetectALoopInLL {

    public static boolean checkloop(Node head){

        Node fast =head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        boolean ch = checkloop(head);
        if(ch){
            System.out.println("It has loop");
        }else{
            System.out.print("It has no loop");
        }
    }

}
